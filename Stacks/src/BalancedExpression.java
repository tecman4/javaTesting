import java.util.Stack;
public class BalancedExpression {
    public boolean isBalanced(String input) {
        if (input == null)
            throw new IllegalArgumentException();
        Stack<Character> stack = new Stack<>();


        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch))
                stack.push(ch);

            if (isRightBracket(ch)) {
                if (stack.isEmpty()) return false;
                var top = stack.pop();
                if (
                  (ch == ')' && top != '(') ||
                  (ch == ']' && top != '[') ||
                  (ch == '>' && top != '<') ||
                  (ch == '}' && top != '{')
                ) return false;
            }
        }
        return stack.isEmpty();
    }
    private boolean isLeftBracket(char ch){
        return ch == '<' || ch == '(' || ch == '[' || ch == '{';
    }
    private boolean isRightBracket(char ch){
        return ch == '>' || ch == ')' || ch == ']' || ch == '}';
    }
}

