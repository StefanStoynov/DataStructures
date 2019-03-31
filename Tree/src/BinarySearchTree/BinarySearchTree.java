package BinarySearchTree;

public class BinarySearchTree<T extends Comparable<T>> {
    private BinarySearchTreeNode<T> root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(T value) {
        if (value == null) {
            throw new IllegalArgumentException();
        }

        this.root = insert(value, null, root);
    }

    private BinarySearchTreeNode<T> insert(T value, BinarySearchTreeNode<T> parent, BinarySearchTreeNode<T> node) {
        if (node == null) {
            node = new BinarySearchTreeNode<T>(value);
            node.setParent(parent);
        } else {
            int compareTo = value.compareTo(node.getValue());
            if (compareTo < 0) {
                node.setLeftTree(insert(value, node, node.getLeftTree()));
            } else if (compareTo > 0) {
                node.setRightTree(insert(value, node, node.getRightTree()));
            }
        }
        return node;
    }
}
