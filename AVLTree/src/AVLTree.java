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
    root.height = Math.max(height(root.leftChild), height(root.rightChild)) + 1;

    root = balance(root);
    return root;
    }
    private boolean isLeftHeavy(AVLNode node) {
        return balanceFactor(node) > 1;
    }
    private boolean isRightHeavy(AVLNode node) {
        return balanceFactor(node)  < (-1);
    }
private AVLNode balance(AVLNode root){
    if(isLeftHeavy(root)) {
        if(balanceFactor(root) > 0)
//            root.leftChild = rotateLeft(root.leftChild);
        root = rotateRight(root);
//            System.out.println("Left Rotate " + root.leftChild.value);
//        System.out.println("Right Rotate " + root.value);
    }
    else if(isRightHeavy(root)) {
        if (balanceFactor(root) < 0) {
//            root.rightChild = rotateLeft(root.leftChild);
            root = rotateLeft(root);
//            System.out.println("Right Rotate " + root.rightChild.value);
//            System.out.println("Left Rotate " + root.value);
        }
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
    return root;

    }
    private AVLNode rotateRight(AVLNode node){
        var newRoot = root.leftChild;
        root.leftChild = newRoot.rightChild;
        newRoot.rightChild = root;
        return root;

    }
}
