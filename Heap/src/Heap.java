public class Heap {
    private int[] items;
    private int size;
    public Heap(int capacity) {
        items = new int[capacity];
        size = 0;
    }
    public void insert(int item){
        if(isFull())
            throw new IllegalStateException();
        items[size++] = item;
        bubbleUp();

    }
    public boolean isFull(){
        return size ==items.length;
    }
    private void bubbleUp(){
        var index = size -1;

        while (index > 0 && items[index] > items[parent(index)]) {
            swap(index,parent(index));
            index = parent(index);

        }
    }
    private int parent (int index){
        return (index -1)/2;
    }
    private void swap(int first, int second){
        var temp = items[first];
        items[first] = items[second];
        items[second] = temp;

    }
    public void remove() {

    }
}
