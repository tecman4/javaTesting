public class Main {
    public static void main(String[] args) {
        StackQueue queue = new StackQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        int first = queue.dequeue();
        int second = queue.dequeue();
        queue.dequeue();
        queue.enqueue(60);
        queue.enqueue(70);
//        queue.dequeue();
        queue.enqueue(80);
        System.out.println(first + " " + second);
    }
    }
