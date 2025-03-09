import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try { // Use a try-finally block to ensure close() is always called
            System.out.print("Enter the number of terms: ");
            int numTerms = input.nextInt();

            // Handle invalid input (number of terms less than 1)
            if (numTerms < 1) {
                System.out.println("Number of terms must be at least 1.");
                return; // Exit the program
            }

            // Print the first two terms (0 and 1)
            int firstTerm = 0;
            int secondTerm = 1;

            System.out.print("Fibonacci Series up to " + numTerms + " terms: ");

            if (numTerms >= 1) {
                System.out.print(firstTerm + " "); // Print the first term
            }
            if (numTerms >= 2) {
                System.out.print(secondTerm + " "); // Print the second term
            }

            // Generate and print the remaining terms
            for (int i = 3; i <= numTerms; i++) {
                int nextTerm = firstTerm + secondTerm;
                System.out.print(nextTerm + " ");

                // Update first and second terms for the next iteration
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }

            System.out.println(); // Print a newline at the end

        } finally { // This block will always execute, even if there's an exception
            if (input != null) { // Check if input is not null to avoid NullPointerException
                input.close(); // Close the Scanner to prevent resource leak
            }
        }
    }
}
