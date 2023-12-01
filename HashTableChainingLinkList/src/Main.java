import java.util.HashSet;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable table = new HashTable();
        table.put(6,"A");// index 1
        table.put(8,"B");// index 3
        table.put(11,"C");// index 1
        table.put(6,"A+");// index 1
        table.remove(6);
        System.out.println(table.get(6));








//        KeyValuePair pair = new KeyValuePair();
//       pair.put(5, "Wayne");
//        pair.put(6, "Matthew");
//        String whoamiw = pair.get(5);
//        System.out.println(whoamiw);
//        String whoamim = pair.get(6);
//        System.out.println(whoamim);
    }
}