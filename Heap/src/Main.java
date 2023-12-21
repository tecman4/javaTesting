public class Main {
    public static void main(String[] args){
var heap = new Heap(10);
    heap.insert(10);
    heap.insert(20);
    heap.insert(50);
    heap.insert(40);
    heap.insert(70);
    heap.remove();
    System.out.println(heap.remove());
    }
}