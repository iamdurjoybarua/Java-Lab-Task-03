import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the console.
        Scanner input = new Scanner(System.in);

        try {
            // Prompt the user to enter the first number.
            System.out.print("Enter the first number: ");
            // Read the first number from the user and store it in the 'num1' variable.
            int num1 = input.nextInt();

            // Prompt the user to enter the second number.
            System.out.print("Enter the second number: ");
            // Read the second number from the user and store it in the 'num2' variable.
            int num2 = input.nextInt();

            // Prompt the user to enter the third number.
            System.out.print("Enter the third number: ");
            // Read the third number from the user and store it in the 'num3' variable.
            int num3 = input.nextInt();

            // Find the largest number using Math.max() method.
            // Math.max() returns the larger of two numbers.  We use it nested to compare all three.
            // First, find the larger of num1 and num2.
            // Then, compare that result with num3 to find the overall largest.
            int largest = Math.max(Math.max(num1, num2), num3);

            // Print the largest number.
            System.out.println("The largest number is: " + largest);

        } finally {
            // This block ensures that the Scanner is closed even if an exception occurs.
            if (input != null) {
                input.close(); // Close the Scanner to release resources and prevent leaks.
            }
        }
    }
}