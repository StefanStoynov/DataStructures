package Tree;

import java.util.*;

public class Tree<T> {
    private TreeNode<T> root;

    public Tree(T value) {
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null");
        }
        this.root = new TreeNode<T>(value);
    }

    public Tree(T value, Tree<T>... children) {
        this(value);

        for (Tree<T> child : children) {
            this.root.addChild(child.root);
        }
    }

    public TreeNode<T> getRoot() {
        return this.root;
    }

    public List<TreeNode<T>> getChildrenNodes() {
        if (this.root != null) {
            return this.getChildrenNodes();
        }
        return new ArrayList<>();
    }

    private void printDFS(TreeNode<T> root, String spaces) {
        if (this.root == null) {
            return;
        }

        TreeNode<T> child = null;

        for (int i = 0; i < root.getChildrenCount(); i++) {
            child = root.getChildByIndex(i);
            printDFS(child, spaces + " ");
        }

        System.out.println(spaces + root.getValue());
    }

    public void printDFS() {
        this.printDFS(this.root, new String());
    }

    private List<T> orderBFS(TreeNode<T> root) {

        Queue<TreeNode<T>> queue = new ArrayDeque<>();
        queue.offer(this.root);
        List<T>output = new ArrayList<>();

       while (!queue.isEmpty()){
           TreeNode<T> current = queue.poll();
           for (TreeNode<T> child : current.getChildren()) {
              queue.offer(child);
           }
           output.add(current.getValue());
       }

       return output;

    }

    public void printBFS() {
        List<T> print = this.orderBFS(this.root);
        for (T t : print) {
            System.out.print(t+" ");
        }
    }
}
