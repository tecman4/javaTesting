import java.util.HashMap;
import java.util.LinkedList;

import static sun.util.locale.LocaleUtils.isEmpty;

public class KeyValuePair {
    public KeyValuePair() {

    }

    public static Object get(int key) {
        return myMap.get(key);

    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int[] items;
    private int i;
    static HashMap<String, Integer> myMap = new HashMap<>();

    KeyValuePair(int key, String value) {
        HashMap<String, Integer> myMap = new HashMap<>();
        int LinkedList;
        items = new int[5];


    }

    static boolean put(int key, String value) {

        var node = new Node(key);
        new KeyValuePair(i, node.toString());
        if (first == null)
            first = last = node;
        else {
            node.next = first;
            first = node;

        }

    return true;
    }
}
