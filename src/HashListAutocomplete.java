import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashListAutocomplete implements Autocompletor {

    private static final int MAX_PREFIX = 10;
    private Map<String, List<Term>> myMap;
    private int mySize;

    public HashListAutocomplete(String[] terms, double[] weights) {
		if (terms == null || weights == null) {
			throw new NullPointerException("One or more arguments null");
		}

		if (terms.length != weights.length) {
			throw new IllegalArgumentException("terms and weights are not the same length");
		}
		initialize(terms,weights);
	}

    @Override
    public List<Term> topMatches(String prefix, int k) {
        if (k == 0){
            return new ArrayList<Term>();
        }
        
        if (prefix.length() > MAX_PREFIX){
            prefix = prefix.substring(0, MAX_PREFIX);
        }

        if (myMap.containsKey(prefix)){
            List<Term> all = myMap.get(prefix);
            List<Term> list = all.subList(0, Math.min(k, all.size()));
            return list;
        }

        return new ArrayList<>();
    }

    @Override
    public void initialize(String[] terms, double[] weights) {
        myMap = new HashMap<>();
        for (int x = 0; x < terms.length; x++){
            mySize += BYTES_PER_CHAR * terms[x].length();
            mySize += BYTES_PER_DOUBLE;

            for (int i = 0; i <= Math.min(MAX_PREFIX, terms[x].length()); i++){
                String sub = terms[x].substring(0, i);
                if (!myMap.containsKey(sub)){
                    myMap.put(sub, new ArrayList<Term>());
                    mySize += BYTES_PER_CHAR * i;
                }

                myMap.get(sub).add(new Term(terms[x], weights[x]));
            }
        }

        for (String key : myMap.keySet()){
            Collections.sort(myMap.get(key), Comparator.comparing(Term::getWeight).reversed());
        }
        
    }

    @Override
    public int sizeInBytes() {
        return mySize;
    }
    
}

