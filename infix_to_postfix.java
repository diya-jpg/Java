import java.util.*;

public class InfixToPostfix {
    // Method to return precedence of operators
    static int precedence(char c) {
        if (c == '+' || c == '-') {
            return 1;
        }
        if (c == '*' || c == '/') {
            return 2;
        }
        return -1;
    }

    // Method to convert infix to postfix
    static String INFIX_POSTFIX(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If the character is an operand (a-z, A-Z, or 0-9)
            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            }
            // If the character is '(' push to stack
            else if (ch == '(') {
                st.push(ch);
            }
            // If the character is ')' pop until '('
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }
                st.pop(); // Pop '('
            }
            // If the character is an operator
            else {
                while (!st.isEmpty() && precedence(ch) <= precedence(st.peek())) {
                    ans.append(st.pop());
                }
                st.push(ch);
            }
        }

        // Pop all remaining operators from the stack
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "A*(B+C)";

        String result = INFIX_POSTFIX(str);
        System.out.println("Postfix expression: " + result);  // Output should be: ABC+*
    }
}
