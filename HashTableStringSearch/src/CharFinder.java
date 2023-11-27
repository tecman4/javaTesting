import java.util.Map;
import java.util.HashMap;

public class CharFinder {
    public char findFirstNonRepeatingChar(String string) {
        Map<Character, Integer> map = new HashMap<>();
        {
            // same as below
//            for (var ch : string.toCharArray()) {
//                if (map.containsKey(ch)) {
//                    var count = map.get(ch);
//                    map.put(ch, count);
//                }   else
//                    map.put(ch,1);
//            }
            var chars = string.toCharArray();
            for (var ch : chars) {
                var count = map.containsKey(ch) ? map.get(ch) : 0;
                map.put(ch, count + 1);
            }

            for (var ch : chars)
                if(map.get(ch) == 1)
                    return ch;

        }
        return Character.MIN_VALUE;
    }
}
