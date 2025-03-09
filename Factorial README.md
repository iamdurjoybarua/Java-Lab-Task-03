# Factorial Calculator (Java)

This Java program calculates the factorial of a non-negative integer entered by the user.

## Description

The program prompts the user to enter a non-negative integer. It then calculates the factorial of that number using a loop and prints the result to the console. The program handles the case where the user enters a negative number, as factorials are not defined for negative integers.  It also includes a `try-finally` block for proper resource management (closing the `Scanner`).

## How to Compile and Run

1.  **Save the code:** Save the Java code as `Factorial.java`.

2.  **Compile:** Open a terminal or command prompt and navigate to the directory where you saved the file. Compile the code using the Java compiler:

    ```bash
    javac Factorial.java
    ```

3.  **Run:** After successful compilation, run the program:

    ```bash
    java Factorial
    ```

4.  **Input:** The program will prompt you to enter a non-negative integer. Type the integer and press Enter.

5.  **Output:** The program will then display the factorial of the entered number. If a negative number is entered, it will print a message indicating that factorials are not defined for negative numbers.
