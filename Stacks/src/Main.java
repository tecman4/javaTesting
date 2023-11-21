import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        var top = stack.pop();
        System.out.println(top);
        System.out.println(stack);
        top = stack.peek();
        System.out.println(top);
        System.out.println(stack);
        
        //Reverse a string
        String str = "ABCD";
        StringReverser reverser = new StringReverser();
        var result = reverser.reverse(str);
        System.out.println(result);

        //Balanced Expression
        String strBalanced = "(1+2]";
         BalancedExpression isBalanced= new BalancedExpression();
        System.out.println(isBalanced.isBalanced(strBalanced));

    }
}