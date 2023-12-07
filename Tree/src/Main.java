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
        var tree2 = new Tree();
        tree2.insert(7);
        tree2.insert(4);
        tree2.insert(9);
        tree2.insert(1);
        tree2.insert(6);
        tree2.insert(8);
//        tree2.insert(10);

        tree.find(8);
        System.out.println(tree.find(9));
        tree.traversePreOrder();
        System.out.println(tree.find(9));
        tree.traverseInOrder();
        System.out.println(tree.find(9));
        tree.traversePostOrder();
        System.out.println("Height " + tree.height());
        System.out.println("Min " + tree.min());
        System.out.println("Equals " + tree.equals(tree2));
        System.out.println("IS BST " + tree.isBinarySearchTree());
    }
}