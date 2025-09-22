import java.util.Scanner;

/**
 * Calculates the sum of even and odd numbers based on specific conditions for five user-input integers.
 */
public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array to store five input numbers
        int[] numbers = new int[5];
        String[] prompts = {
            "Enter the first number: ",
            "Enter the second number: ",
            "Enter the third number: ",
            "Enter the fourth number: ",
            "Enter the fifth number: "
        };

        // Get and validate five integer inputs
        for (int i = 0; i < 5; i++) {
            numbers[i] = getValidInteger(scanner, prompts[i]);
        }

        int evenSum = 0;
        int oddSum = 0;

        // Process each number based on specific conditions
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                // First number: add to evenSum if even, oddSum if odd
                if (numbers[i] % 2 == 0) {
                    evenSum += numbers[i];
                } else {
                    oddSum += numbers[i];
                }
            } else if (i == 1) {
                // Second number: add to evenSum if divisible by first number, else oddSum
                if (numbers[0] != 0 && numbers[i] % numbers[0] == 0) {
                    evenSum += numbers[i];
                } else {
                    oddSum += numbers[i];
                }
            } else {
                // Third, fourth, fifth numbers: add 2 to evenSum if even, oddSum if odd
                if (numbers[i] % 2 == 0) {
                    evenSum += 2;
                } else {
                    oddSum += 2;
                }
            }
        }

        // Display results
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

        scanner.close();
    }

    /**
     * Gets a valid integer input from the user.
     * @param scanner Scanner object for input
     * @param prompt Prompt message to display
     * @return Valid integer input
     */
    private static int getValidInteger(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Error: Please enter a valid integer.");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }
}