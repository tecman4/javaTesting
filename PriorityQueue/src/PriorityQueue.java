import java.util.Arrays;

public class PriorityQueue {
    private int[] items;
    private int count =0;
    public PriorityQueue(int capacity){
        items = new int[capacity];

    }
    public void add(int item) {
        if(isFull())
            throw new IllegalStateException();
        var i = shiftItemsToInsert(item);
        items[i]=item;
        count++;
            }
    public int shiftItemsToInsert(int item){
        int i;
        for(i = count-1;i >= 0;i--) {
            if (items[i] > item)
                items[i + 1] = items[i];
            else
                break;
        }
        return i+1;
    }
    public boolean isFull(){
        return count == items.length;
    }
    public int remove(){
        if(isEmpty())
            throw new IllegalStateException();
        return items[--count];
    }
    public boolean isEmpty(){
        return count ==0;

    }
    @Override
    public java.lang.String toString() {
        return Arrays.toString(items);
    }
}


