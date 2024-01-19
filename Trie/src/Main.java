public class Main {
    public static void main(String[] args) {
        var trie = new Trie();
        trie.insert("cat");
        trie.insert("car");
        trie.insert("card");
        trie.insert("careful");
        trie.insert("mouse");
        trie.insert("catdog");
        trie.contains("can");
//        trie.remove("catton");
//        System.out.println(trie.contains("catton"));
//        System.out.println(trie.contains("cat"));
                var words = trie.findWords("m");
                System.out.println(words);
    }
}