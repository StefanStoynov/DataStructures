package Tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> {
    private T value;
    private boolean hasParent;
    private List<TreeNode<T>> children;


    public TreeNode(T value) {
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null!");
        }
        this.value = value;
        this.children = new ArrayList<>();
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void addChild(TreeNode<T> child) {
        if (child == null) {
            throw new IllegalArgumentException("Cannot insert null value!");
        }

        if (child.hasParent) {
            throw new IllegalArgumentException("The node has already a parent!");
        }

        child.hasParent = true;
        this.children.add(child);
    }

    public TreeNode<T> getChildByIndex(int index) {
        return this.children.get(index);
    }

    public int getChildrenCount() {
        return this.children.size();
    }

    public List<TreeNode<T>> getChildren() {
        return this.children;
    }
}
