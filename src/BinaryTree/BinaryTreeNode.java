package BinaryTree;

public class BinaryTreeNode<T> {
    private T value;
    private boolean hasParent;
    private BinaryTreeNode<T> leftTree;
    private BinaryTreeNode<T> rightTree;

    public BinaryTreeNode(T value, BinaryTreeNode<T> left, BinaryTreeNode<T> right ){
        if (value==null){
            throw new IllegalArgumentException("Value cannot be null!");
        }
        this.value = value;
        this.leftTree = left;
        this.rightTree = right;
    }

    public BinaryTreeNode(T value) {
        this(value,null,null);
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public BinaryTreeNode<T> getLeftTree() {
        return this.leftTree;
    }

    public void setLeftTree(BinaryTreeNode<T> leftTree) {
        if (leftTree == null || leftTree.hasParent){
            throw new IllegalArgumentException();
        }
        leftTree.hasParent = true;
        this.leftTree = leftTree;
    }

    public BinaryTreeNode<T> getRightTree() {
        return this.rightTree;
    }

    public void setRightTree(BinaryTreeNode<T> rightTree) {
        if (rightTree == null || rightTree.hasParent){
            throw new IllegalArgumentException();
        }
        rightTree.hasParent = true;
        this.rightTree = rightTree;
    }
}
