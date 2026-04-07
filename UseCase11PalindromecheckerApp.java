import java.util.Stack;

class UseCase11PalindromeCheckerApp {

    // Public method to check palindrome
    public boolean checkPalindrome(String input) {
        if (input == null) {
            return false;
        }

        // Normalize input (remove spaces, lowercase)
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push all characters to stack
        for (char ch : cleaned.toCharArray()) {
            stack.push(ch);
        }

        // Compare characters
        for (char ch : cleaned.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}