


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Stack myStack = new Stack();
        System.out.println(myStack.isEmpty());
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        int a = myStack.pop();
        int b = myStack.peek();
        myStack.push(40);
        myStack.push(50);
        myStack.push(60);
        int c = myStack.pop();
        System.out.println(myStack);
        System.out.println("a " + a + " b " + b + " c " + c );

    }


}