import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the console.
        Scanner input = new Scanner(System.in);

        try {
            // Prompt the user to enter a non-negative integer.
            System.out.print("Enter a non-negative integer: ");
            // Read the integer from the user and store it in the 'number' variable.
            int number = input.nextInt();

            // Check if the number is negative. Factorial is not defined for negative numbers.
            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                // If the number is non-negative, calculate the factorial.
                // Initialize the factorial variable to 1.  The factorial of 0 is 1.
                long factorial = 1;

                // Use a for loop to calculate the factorial.
                // The loop iterates from 1 up to and including the number.
                for (int i = 1; i <= number; i++) {
                    // Multiply the current value of factorial by i in each iteration.
                    factorial *= i;  // This is equivalent to factorial = factorial * i;
                }

                // Print the calculated factorial.
                System.out.println("The factorial of " + number + " is: " + factorial);
            }

        } finally {
            // This block ensures that the Scanner is closed even if an exception occurs.
            if (input != null) {
                input.close(); // Close the Scanner to release resources and prevent leaks.
            }
        }
    }
}