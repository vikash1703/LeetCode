import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParenthesis {

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (final char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthesis solution = new ValidParenthesis();
        
        // Example inputs
        String s1 = "()[]{}";
        String s2 = "(]";
        
        // Testing the isValid method
        System.out.println("Is the string \"" + s1 + "\" valid? " + solution.isValid(s1));  // Should return true
        System.out.println("Is the string \"" + s2 + "\" valid? " + solution.isValid(s2));  // Should return false
    }
}
