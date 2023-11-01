

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        System.out.println(list.indexOf(20));
        list.addFirst(5);
        list.removeFirst();
        System.out.println(list.contains(10));
//        list.addFirst(5);
//        System.out.println(list.contains(10));
//        System.out.println(list.indexOf(10));
//        System.out.println(list.size());
//        var array = list.toArray();
//        System.out.println(list);
//        System.out.println(Arrays.toString(array));
       }
    }
