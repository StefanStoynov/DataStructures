package BinarySearchTree;

public class BinarySearchTreeNode<T extends Comparable<T>> {
    private T value;
    private BinarySearchTreeNode<T> parent;
    private BinarySearchTreeNode<T> leftTree;
    private BinarySearchTreeNode<T> rightTree;

    public BinarySearchTreeNode(T value) {
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null!");
        }
        this.value = value;
        this.parent = null;
        this.leftTree = null;
        this.rightTree = null;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        BinarySearchTreeNode<T> other = (BinarySearchTreeNode<T>) obj;
        return this.compareTo(other) == 0;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }

    public BinarySearchTreeNode<T> getParent() {
        return this.parent;
    }

    public void setParent(BinarySearchTreeNode<T> parent) {
        this.parent = parent;
    }

    public int compareTo(BinarySearchTreeNode<T> other) {
        return this.value.compareTo(other.value);
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public BinarySearchTreeNode<T> getLeftTree() {
        return this.leftTree;
    }

    public void setLeftTree(BinarySearchTreeNode<T> leftTree) {
        this.leftTree = leftTree;
    }

    public BinarySearchTreeNode<T> getRightTree() {
        return this.rightTree;
    }

    public void setRightTree(BinarySearchTreeNode<T> rightTree) {
        this.rightTree = rightTree;
    }
}
