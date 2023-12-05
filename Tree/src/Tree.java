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
        var current = root;
        if(value > current.value){

        }
        return false;
}
public void insert(int value){
    var current = root;
        if(root == null){
            root = new Node(value);
             return;
        }

        while(true) {

            if (value > current.value) {

                if(current.rightChild == null) {
                    current.rightChild = new Node(value);
                    current = current.rightChild;
                    current.value = value;
                    break;
                }
                current = current.rightChild;
            }
            if (value < current.value) {

                if(current.leftChild == null) {
                    current.leftChild = new Node(value);
                    current = current.leftChild;
                    current.value = value;
                    break;
                }
                current = current.leftChild;
            }

        }


}
}
