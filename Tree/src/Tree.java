public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value;
        }
    }

    private Node root;

    public boolean find(int value) {
        var current = root;
        while (current != null) {
            if (current.value == value)
                return true;
            else if (value > current.value) {
                current = current.rightChild;
            } else {
                current = current.leftChild;
            }
        }
        return false;
    }

    public void insert(int value) {
        var current = root;
        var node = new Node(value);
        if (root == null) {
            root = new Node(value);
            return;
        }
        while (true) {
            if (value > current.value) {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    current = current.rightChild;
                    current.value = value;
                    break;
                }
                current = current.rightChild;
            } else {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    current = current.leftChild;
                    current.value = value;
                    break;
                }
                current = current.leftChild;
            }
        }
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root) {
        if (root == null)
            return;
        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root) {
        if (root == null)
            return;
        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root) {
        if (root == null)
            return;
        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.println(root.value);
    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null)
            return -1;
        if (isLeaf(root))
            return 0;
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    private boolean isLeaf(Node node) {
        return node.leftChild == null & node.rightChild == null;

    }

    public int minBST() {//Min for a binary search tree, left most leaf o(log n)
        if (root == null)
            throw new IllegalStateException();
        var current = root;
        var last = current;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last.value;
    }

    public int min() {
        return min(root);
    }

    private int min(Node root) {
        if (isLeaf(root))
            return root.value;
        var left = min(root.leftChild);
        var right = min(root.rightChild);

        return Math.min(Math.min(left, right), root.value);

    }

    public boolean equals(Tree other) {
        if (other == null)
            return false;
        return equals(root, other.root);
    }

    private boolean equals(Node first, Node second) {
        if (first == null && second == null)
            return true;
        if (first != null && second != null)
            return first.value == second.value && equals(first.leftChild, second.leftChild) && equals(first.rightChild, second.rightChild);


        return false;

    }
public boolean isBinarySearchTree(){
        return isBinarySearchTree(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
}
    private boolean isBinarySearchTree(Node root,int min, int max) {
    if(root == null)
        return true;
    if(root.value < min || root.value > max)
        return false;
    return isBinarySearchTree(root.leftChild, min, root.value - 1) && isBinarySearchTree(root.rightChild, root.value + 1, max);
    }




}
