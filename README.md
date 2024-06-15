 # $\textsf{\color{lime} Autocomplete}$

## $\textsf{\color{purple} Description}$
Autocomplete demonstrates a graphical user interface (GUI) that provides autocomplete suggestions based on user input. It supports multiple autocomplete algorithms such as Brute Force, Binary Search, and Hash List, each offering different trade-offs between speed and memory usage. Users can input text, receive autocomplete suggestions, and perform online searches directly from the application.

## $\textsf{\color{purple} Class Overview}$

### 1. Autocompletor Interface
**Overview:** Defines methods for autocomplete functionality, including initialization and retrieving top matching terms.
**Key Features:**
- `topMatches(String prefix, int k)`: Returns top k matching terms based on a prefix.
- `initialize(String[] terms, double[] weights)`: Initializes internal state with terms and corresponding weights.
- `sizeInBytes()`: Computes total memory usage in bytes after initialization.

### 2. BruteAutocomplete.java
**Overview:** Implements autocomplete using a brute force approach.
**Key Features:**
- Linear search for finding matching terms.
- Suitable for small datasets or when simplicity is preferred.

### 3. BinarySearchAutocomplete.java
**Overview:** Implements autocomplete using binary search on a sorted dataset.
**Key Features:**
- Efficient retrieval of matching terms using binary search.
- Requires the data to be sorted beforehand.

### 4. HashListAutocomplete.java
**Overview:** Implements autocomplete using a hash list for efficient term retrieval.
**Key Features:**
- Uses hash tables to store and retrieve terms.
- Balances speed and memory usage, suitable for medium to large datasets.

### 5. AutocompleteGUI.java
**Overview:** Provides a graphical user interface for interacting with autocomplete functionality.
**Key Features:**
- Allows users to input text and receive autocomplete suggestions.
- Supports online search functionality based on selected suggestions.
- Integrates with different autocomplete implementations based on user selection.

### 6. FileSelector.java
**Overview:** Utility class for selecting files from the system.
**Key Features:**
- Provides methods to select a file for loading autocomplete data.
- Used by AutocompleteGUI to initialize autocomplete implementations from a chosen file.

### 7. AutocompleteMain.java
**Overview:** Main class to initialize the GUI with selected autocomplete implementation.
**Key Features:**
- Configures and launches the GUI with user-selected autocomplete implementation (Brute Force, Binary Search, or Hash List).
- Handles file selection and GUI initialization.
- Directs user interaction with autocomplete functionality and online search.

### 8. Term.java
**Overview:** Represents a term with associated weight for autocomplete purposes.
**Key Features:**
- Stores a word (term) and its weight.
- Provides methods to retrieve the word and weight.

### 9. AutocompleteData.txt (Sample)
**Overview:** Sample text file containing autocomplete data.
**Key Features:**
- Format: `weight\tterm`.
- Used by AutocompleteMain to initialize autocomplete implementations.

## $\textsf{\color{purple} Languages and Utilities Used}$
- Java
- Data Structures and Agorithms

# $\textsf{\color{lime} Autocomplete Program Walkthrough}$

## $\textsf{\color{purple} Cloning the Repository}$

1. **Clone the Repository:**
   - Open your terminal or command prompt.
   - Navigate to the directory where you want to clone the repository.
   - Run the following command:
     ```
     git clone <repository_url>
     ```
     Replace `<repository_url>` with the actual URL of the GitHub repository.

## $\textsf{\color{purple} Setting Up the Environment}$

2. **Environment Setup:**
   - Ensure you have Java installed on your system. You can check by running:
     ```
     java -version
     ```
   - Install any necessary IDE (Integrated Development Environment) such as IntelliJ IDEA, Eclipse, or use a text editor like Visual Studio Code.

## $\textsf{\color{purple} Program Walkthrough}$

3. **Program Walkthrough:**
   - **Step 1: Starting the Program**
     - Open the project folder, navigate to the `src` folder, open the `AutocompleteMain.java` file.
   <p align="center">
   <img src="ReadMe%20Images/step1.png" height="60%" width="60%" alt="Finding the main method"/>
   </p>

   - **Step 2: Select Autocomplete Class and Run**
     - Uncomment the autocomplete algorithm you would like to use and run the main method.
   <p align="center">
   <img src="ReadMe%20Images/step2.png" height="60%" width="60%" alt="Selecting autocomplete class"/>
   </p>

   - **Step 3: Select Data File**
     - Select the `data` folder and then selct the `.txt` file you would like to use as your autocomplete data source
   <p align="center">
   <img src="ReadMe%20Images/step3.png" height="40%" width="40%" display="inline-block" alt="Selecting data folder"/>
   <img src="ReadMe%20Images/step4.png" height="40%" width="40%" display="inline-block" alt="Selecting source file"/>
   </p>

   - **Step 4: Autocompletion**
     - Watch as the program autocomplete your search! Double-click to open in Google!
   <p align="center">
   <img src="ReadMe%20Images/step5.png" height="60%" width="60%" alt="Autocompleting"/>
   </p>



