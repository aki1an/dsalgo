package io.akil4n.Recursion;

import io.akil4n.Trees.Node;
import io.akil4n.Trees.Tree;

public class MaxHeightBTree {
    static int maxHeight(Node binaryTree) {
        return binaryTree == null ? 0 : Math.max(maxHeight(binaryTree.left) + 1, maxHeight(binaryTree.right) + 1);
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 2);
        tree.root = tree.insert(tree.root, 5);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 5);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 7);
        System.out.println(maxHeight(tree.root));
    }
}
