import java.util.Arrays;

public class ArrayQueue {
private int[] items;
private int front = 0;
private int rear = 0;
private int count= 0;

    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    public void enqueue(int item) {
        if(count == items.length)
            throw new IllegalStateException();
    items[rear] =item;
    rear =(rear + 1) % items.length;
    count++;
    }
public int dequeue(){
    var item = items[front];
    items[front] = 0;
    front =(front + 1) % items.length;
    count--;
    return item;
}
public int peek(){
    return items[front];
}
public boolean isEmpty(){
    return front == rear;
}
public boolean isFull(){
    return count == items.length;
}
@Override
    public String toString() {
        return Arrays.toString(items);

    }
}
