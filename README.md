# Data Structures Lab Sheet 1

## How to Run the Code

1. **Clone the repository**:
    On the terminal, copy and paste the following command

   ```bash
   git clone https://github.com/Aryan-Dot-Dev/Lab-Sheet-1
   ```
   
2. **Compile the Code**:
    Use javac to create Class Files for all Java files.
    All the code is compiled in out/src and out/test directories
    ```
    javac -d out src/StaticArray.java test/StaticArrayTest.java
    javac -d out src/DynamicArray.java test/DynamicArrayTest.java
    javac -d out src/StringOperations.java test/StringOperationsTest.java
    ```

3. **Run the Code**:
    Use java command to run files individually.
    ```
    java -cp out test.StaticArrayTest
    java -cp out test.DynamicArrayTest
    java -cp out test.StringOperationsTest
    ```