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

    public BinarySearchTreeNode<T> insert(T value, BinarySearchTreeNode<T> parent, BinarySearchTreeNode<T> node) {
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

    public BinarySearchTreeNode<T> find(T value) {
        BinarySearchTreeNode<T> node = this.root;

        while (node != null) {
            int compareTo = value.compareTo(node.getValue());
            if (compareTo < 0) {
                node = node.getLeftTree();
            } else if (compareTo > 0) {
                node = node.getRightTree();
            } else {
                break;
            }
        }

        return node;
    }

    public void remove(T value){
        BinarySearchTreeNode<T> nodeToDelete= find(value);
        if (nodeToDelete==null){
            return;
        }

        remove(nodeToDelete);
    }

    public void remove(BinarySearchTreeNode<T> node){
        if (node.getLeftTree()!=null && node.getRightTree()!=null){
            BinarySearchTreeNode<T> replacement = node.getRightTree();
            while (replacement.getLeftTree()!=null){
                replacement = replacement.getLeftTree();
            }
            node.setValue(replacement.getValue());
            node = replacement;
        }

        BinarySearchTreeNode<T> theChild = node.getLeftTree()!= null ? node.getLeftTree() : node.getRightTree();

        if (theChild != null){
            theChild.setParent(node.getParent());
            if (node.getParent() == null){
                root = theChild;
            }else{
                if (node.getParent().getLeftTree()==node){
                    node.getParent().setLeftTree(theChild);
                }else{
                    node.getParent().setRightTree(theChild);
                }
            }

        }else{
            if (node.getParent() == null){
                root = null;
            }else{
                if (node.getParent().getLeftTree()==null){
                    node.getParent().setLeftTree(null);
                }else{
                    node.getParent().setRightTree(null);
                }
            }
        }

    }
}
