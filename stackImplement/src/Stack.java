import java.util.Arrays;

public class Stack {
    private int[] items = new int[5];
    private int size = 0;

    public void push(int item) {
        if(size == items.length)
            throw new StackOverflowError();
       items[size++] = item;
    }

    public int pop() {
        if(size  == 0) throw new IllegalStateException();
        return items[--size];
    }
    @Override
    public String toString(){
        var content = Arrays.copyOfRange(items, 0,size);
        return Arrays.toString(content);
    }
    public int peek() {
        if(isEmpty()) throw new IllegalStateException();
        return items[size-1];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}


