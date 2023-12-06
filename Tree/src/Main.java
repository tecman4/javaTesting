public class Main {
    public static void main(String[] args) {
        var tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        tree.find(8);
        System.out.println(tree.find(9));
        tree.traversePreOrder();
        System.out.println(tree.find(9));
        tree.traverseInOrder();
        System.out.println(tree.find(9));
        tree.traversePostOrder();
    }
}