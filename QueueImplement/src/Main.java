public class Main {
    public static void main(String[] args) {
    //queue using an array. ArrayDeque
        //enqueue add to back of queue
        //dequeue remove from the front of the queue
        //peek view from the front
        //isEmpty
        //isFull
        //F = front of queue
        //R = rear of queue.
        ArrayQueue queue = new ArrayQueue(5);
        System.out.println(queue.isEmpty());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(60);
        queue.enqueue(70);
        queue.dequeue();
        queue.enqueue(80);
        System.out.println(queue.isFull());
        System.out.println(queue);
    }
}