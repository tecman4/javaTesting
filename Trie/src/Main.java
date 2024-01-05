public class Main {
    public static void main(String[] args) {
        var trie = new Trie();
        trie.insert("cat");
        trie.insert("catton");
        trie.contains("can");
        trie.remove("catton");
        System.out.println(trie.contains("catton"));
        System.out.println(trie.contains("cat"));
        //        trie.traverse();
    }
}