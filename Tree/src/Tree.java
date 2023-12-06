public class Tree {
    private class Node{
        private int value;
        private Node leftChild;
        private Node rightChild;
        public Node(int value) {
            this.value = value;
        }
        @Override
        public String toString(){
            return "Node="+ value;
        }
    }

    private Node root;
public boolean find(int value){
    var current = root;
    while(current!= null) {
        if (current.value == value)
            return true;
        else if (value > current.value) {
            current = current.rightChild;
        }
        else  {
            current = current.leftChild;
        }
    }
    return false;
}
public void insert(int value){
    var current = root;
    var node = new Node(value);
        if(root == null){
            root = new Node(value);
             return;
        }
        while(true) {
            if (value > current.value) {
                if(current.rightChild == null) {
                    current.rightChild = node;
                    current = current.rightChild;
                    current.value = value;
                    break;
                }
                current = current.rightChild;
            }
            else {
                if(current.leftChild == null) {
                    current.leftChild =  node;
                    current = current.leftChild;
                    current.value = value;
                    break;
                }
                current = current.leftChild;
            }
        }
}
public void traversePreOrder(){
    traversePreOrder(root);
}
private void traversePreOrder(Node root){
    if(root ==null)
        return;
    System.out.println(root.value);
    traversePreOrder(root.leftChild);
    traversePreOrder(root.rightChild);
}
public void traverseInOrder(){
traverseInOrder(root);
}
private void traverseInOrder(Node root) {
    if (root == null)
        return;
    traverseInOrder(root.leftChild);
    System.out.println(root.value);
    traverseInOrder(root.rightChild);
    }
    public void traversePostOrder(){
        traversePostOrder(root);
    }
    private void traversePostOrder(Node root){
        if(root ==null)
            return;
        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.println(root.value);
    }
}
