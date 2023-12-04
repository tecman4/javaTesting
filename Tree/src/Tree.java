public class Tree {

    private class Node{
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

    }
    private Node root;
public boolean find(int value){
        if(root.value == value)
            return true;
        return false;
}
public void insert(int value){
        if(root == null){
            var node = new Node(value);
            node = root;
        }
}
}
