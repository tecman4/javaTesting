import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       CharFinder finder = new CharFinder();//first non repeating character
        var ch = finder.findFirstNonRepeatingChar("a green apple");
        System.out.println(ch);

    }


}