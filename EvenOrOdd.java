import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the console.
        Scanner input = new Scanner(System.in);

        try {
            // Prompt the user to enter an integer.
            System.out.print("Enter an integer: ");
            // Read the integer from the user and store it in the 'number' variable.
            int number = input.nextInt();

            // Check if the number is even or odd using the modulo operator (%).
            // The modulo operator returns the remainder of a division.
            // If the remainder when dividing by 2 is 0, the number is even.
            if (number % 2 == 0) {
                // If the number is even, print a message indicating so.
                System.out.println(number + " is even.");
            } else {
                // If the number is not even (i.e., the remainder is not 0), it's odd.
                System.out.println(number + " is odd.");
            }

        } finally {
            // This block ensures that the Scanner is closed even if an exception occurs.
            if (input != null) {
                input.close(); // Close the Scanner to release resources and prevent leaks.
            }
        }
    }
}