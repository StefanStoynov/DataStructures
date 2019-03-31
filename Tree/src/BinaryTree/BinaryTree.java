package BinaryTree;

public class BinaryTree<T> {
    private BinaryTreeNode<T> root;

    public BinaryTree(T value, BinaryTree<T> leftTree, BinaryTree<T> rightTree) {
        if (value == null) {
            throw new IllegalArgumentException();
        }

        BinaryTreeNode<T> left = leftTree != null ? leftTree.root : null;
        BinaryTreeNode<T> right = rightTree != null ? rightTree.root : null;
        this.root = new BinaryTreeNode<T>(value, left, right);
    }

    public BinaryTree(T value) {
        this(value, null, null);
    }

    public BinaryTreeNode<T> getRoot() {
        return this.root;
    }

    public void setRoot(BinaryTreeNode<T> root) {
        this.root = root;
    }

    public BinaryTreeNode<T> getLeftTree() {
        if (this.root != null) {
            return this.root.getLeftTree();
        }
        return null;
    }

    public BinaryTreeNode<T> getRightTree() {
        if (this.root != null) {
            return this.root.getRightTree();
        }
        return null;
    }

    private void printPreOrder(BinaryTreeNode<T> root) {
        if (root == null) {
            return;
        }

        printPreOrder(root.getLeftTree());
        System.out.print(root.getValue() + " ");
        printPreOrder(root.getRightTree());
    }

    public void printPreOrder() {
        this.printPreOrder(this.root);
        System.out.println();
    }

    private void printInOrder(BinaryTreeNode<T> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getValue() + " ");
        printInOrder(root.getLeftTree());
        printInOrder(root.getRightTree());
    }

    public void printInOrder() {
        this.printInOrder(this.root);
        System.out.println();
    }

    private void printPostOrder(BinaryTreeNode<T> root) {
        if (root == null) {
            return;
        }

        printPostOrder(root.getLeftTree());
        printPostOrder(root.getRightTree());
        System.out.print(root.getValue() + " ");
    }

    public void printPostOrder(){
        this.printPostOrder(this.root);
        System.out.println();
    }
}
