public class ParenthesesBalanceCheck {
    public static void main(String[] args) {
        String input = "$%^^&(*(&((**(^&#$%^&*(*&^%$%^&*)))@)@)@)$#%R#$";

        int openCount = 0, closeCount = 0;

        // Count occurrences of '(' and ')'
        for (char ch : input.toCharArray()) {
            if (ch == '(') {
                openCount++;
            } else if (ch == ')') {
                closeCount++;
            }
        }

        // Print the counts
        System.out.println("Opening Parentheses Count: " + openCount);
        System.out.println("Closing Parentheses Count: " + closeCount);

        // Check if they are equal
        if (openCount == closeCount) {
            System.out.println("The counts are equal ✅");
        } else {
            System.out.println("The counts are NOT equal ❌");
        }
    }
}