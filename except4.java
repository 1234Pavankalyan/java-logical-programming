import java.util.Scanner;

public class except4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            if (isPalindrome(input)) {
                System.out.println("The input string is a palindrome.");
            } else {
                System.out.println("The input string is not a palindrome.");
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid string.");
        }

        scanner.close();
    }

    private static boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}
