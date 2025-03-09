import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the console.
        Scanner input = new Scanner(System.in);

        try {
            // Prompt the user to enter the first number.
            System.out.print("Enter the first number: ");
            // Read the first number from the user and store it in the firstNumber variable.
            int firstNumber = input.nextInt();

            // Prompt the user to enter the second number.
            System.out.print("Enter the second number: ");
            // Read the second number from the user and store it in the secondNumber variable.
            int secondNumber = input.nextInt();

            // Calculate the sum of the two numbers.
            int sum = firstNumber + secondNumber;

            // Display the result to the user.
            System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + sum);

        } finally {
            // This block ensures that the Scanner is closed even if an exception occurs.
            if (input != null) {
                input.close(); // Close the Scanner to release resources.  This is important to prevent resource leaks.
            }
        }
    }
}