public class AVLTree {
    private class AVLNode {
        private int height;
        private int value;
        private AVLNode leftChild;
        private AVLNode rightChild;


        public AVLNode(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Value=" + value;
        }
    }

    private AVLNode root;
    public void insert(int value){
    root= insert(root, value);
    }
    private AVLNode insert(AVLNode root, int value) {
        if (root == null) {
            return new AVLNode(value);
        }
        if (value < root.value) {
            root.leftChild = insert(root.leftChild, value);
        }
        else {
            root.rightChild = insert(root.rightChild, value);
        }
    setHeight(root);
    return balance(root);
    }

private AVLNode balance(AVLNode root){

    int balanceFactor = balanceFactor(root);

    if (balanceFactor > 1) {
        if (balanceFactor(root.leftChild) < 0) {
            root.leftChild = rotateLeft(root.leftChild);
        }
        return rotateRight(root);
    } else if (balanceFactor < -1) {
        if (balanceFactor(root.rightChild) > 0) {
            root.rightChild = rotateRight(root.rightChild);
        }
        return rotateLeft(root);
    }

    return root;
}
    private int balanceFactor(AVLNode node){
        return(node == null) ? 0 : height(node.leftChild)- height(node.rightChild);
    }
    private int height(AVLNode node){
        return(node == null) ? -1 : node.height;
    }
    private AVLNode rotateLeft(AVLNode root){
        var newRoot = root.rightChild;
        root.rightChild = newRoot.leftChild;
        newRoot.leftChild = root;
        setHeight(root);
        setHeight(newRoot);
        return newRoot;

    }
    private void setHeight(AVLNode node){
        node.height = Math.max(height(node.leftChild),height(node.rightChild))+1;
    }
    private AVLNode rotateRight(AVLNode root){
        var newRoot = root.leftChild;
        root.leftChild = newRoot.rightChild;
        newRoot.rightChild = root;
        setHeight(root);
        setHeight(newRoot);
        return newRoot;

    }
}
