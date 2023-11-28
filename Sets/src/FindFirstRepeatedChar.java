import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatedChar {
private String input;

    public FindFirstRepeatedChar(String input) {
        this.input = input;
    }


        public char findFirstRepeatedChar(){
            Set<Character> set = new HashSet<>();
            for (char letters : input.toCharArray()) {
                if (set.contains(letters)) {
                    return letters;
                }
                set.add(letters);
            }
            return Character.MIN_VALUE;
        }
    @Override
    public java.lang.String toString() {
        return Character.toString(findFirstRepeatedChar());
    }

    }

