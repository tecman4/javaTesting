import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Wayne");
        map.put(2,"Matthew");
        map.put(3,"Jessica");
        map.put(3,"Eliana");
        map.put(null,null);
        map.remove(null);
        var value = map.get(3);
        System.out.println(value);
        System.out.println(map);
        for(var itemkey : map.keySet())
            System.out.println(itemkey);
        for(var itemKeyValue : map.entrySet())
            System.out.println(itemKeyValue);

    }
}