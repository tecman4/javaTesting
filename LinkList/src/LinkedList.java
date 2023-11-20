import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
    }
    public int size(){
        return size;
    }
    private Node first;
    private Node last;
    private int size;
    public void addFirst( int item){
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else{
            node.next = first;
            first = node;

        }
        size++;
    }
    private boolean isEmpty(){
        return first == null;
    }
    public void addLast( int item){
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else{
            last.next = node;
            last = node;
        }
        size++;

    }
    public int getKthFromTheEnd(int k){
        if(k<1) throw new NoSuchElementException();
        if(isEmpty()) throw new IllegalArgumentException();
        var current = first;
        var currentk = first;
        int Kth = 0;
        while(current != null) {
            if (Kth >= k) currentk = currentk.next;
            current = current.next;
            Kth++;
        }
        if (Kth < k) throw new IllegalArgumentException();
        return currentk.value;
    }
    public void removeFirst(){
        if(isEmpty())
            throw new NoSuchElementException();
        size--;
        if(first == last) {
            first = last = null;
            return;
        }
        var second = first.next;
        first.next = null;

        first = second;

    }
    public int[] toArray(){
        int[] array = new int[size];
        var current = first;
        var index = 0;
        while(current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }
    public void removeLast(){


        if(isEmpty())
            throw new NoSuchElementException();
        size --;
        if(first == last){
            first = last = null;
            return;

        }
        var previous = getPrevious(last);
        last = previous;
        last.next = null;
    }
    public void reverse(){
        if(isEmpty()) return;
        var curr=first.next;
        var prev= first;
        while(curr != null) {
            var next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            }
        last = first;
        last.next =null;
        first = prev;


    }


    private Node getPrevious(Node node){
        var current = first;
        while(current != null){
            if(current.next == node) return current;
            current = current.next;
        }
        return null;
    }
    public boolean contains( int item){
        return indexOf(item) != -1;



    }
    public int indexOf( int item){
        int index =0;
        var current = first;
while(current != null){
    if(current.value == item) return index;
    current = current.next;
    index++;
}
return -1;
    }
}
