import BinaryTree.BinaryTree;
import Tree.Tree;

public class Main {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<Integer>(7,
                new Tree<Integer>(19,
                        new Tree<Integer>(1),
                        new Tree<Integer>(12),
                        new Tree<Integer>(31)),
                new Tree<Integer>(21),
                new Tree<Integer>(14,
                        new Tree<Integer>(23),
                        new Tree<Integer>(26))
        );

        tree.printBFS();
        tree.printDFS();

        BinaryTree<Integer> binaryTree = new BinaryTree<Integer>(1,
                new BinaryTree<Integer>(2,
                        new BinaryTree<Integer>(4),
                        new BinaryTree<Integer>(5,
                                new BinaryTree<Integer>(6),
                                new BinaryTree<Integer>(7))),
                new BinaryTree<Integer>(3,
                        new BinaryTree<Integer>(8),
                        null
                ));
        System.out.println("PreOrder:");
        binaryTree.printPreOrder();
        System.out.println("InOrder:");
        binaryTree.printInOrder();
        System.out.println("PostOrder:");
        binaryTree.printPostOrder();

    }
}
