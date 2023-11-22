import java.util.Arrays;

public class ArrayQueue {
private int[] items;
private int f = 0;
private int r = 0;

    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    public void enqueue(int item) {
    items[r++] =item;
    }
public int dequeue(){
    return items[f++];
}
public int peek(){
    return items[f];
}
public boolean isEmpty(){
    return f == r;
}
public boolean isFull(){
    return r == items.length;
}

    public String print() {
        return Arrays.toString(items);

    }
}
