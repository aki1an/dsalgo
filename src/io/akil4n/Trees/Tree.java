package io.akil4n.Trees;

import java.util.ArrayList;
import java.util.List;

public class Tree {

  public Node root = null;

  public Node insert(Node root, int data) {
    if (root == null) {
		return new Node(data);
	} else {
		if(data < root.data){
			root.left = insert(root.left, data);
		} else {
			root.right = insert(root.right, data);
		}
		return root;
	}
  }

  public static void findMax(Node root){
		while(root.right!=null){
			root = root.right;
		}
		System.out.println(root.data);
  }

  public static void findMin(Node root){
	while(root.left!=null){
		root = root.left;
	}
	System.out.println(root.data);
  }

  public static void inOrderTraversal(Node node){
	if(node == null) return;
	inOrderTraversal(node.left);
	System.out.print(node.data+" ");
	inOrderTraversal(node.right);
  }

  public static void preOrderTraversal(Node node){
	if(node == null) return;
	System.out.print(node.data+" ");
	preOrderTraversal(node.left);
	preOrderTraversal(node.right);
  }

  public static void postOrderTraversal(Node node){
	if(node == null) return;
	postOrderTraversal(node.left);
	postOrderTraversal(node.right);
	System.out.print(node.data+" ");
  }

  public static void inOrderTraversalIterative(Node node){
	Node copy1 = node;
	Node copy2 = node;
	List<Integer> left = new ArrayList<>();
	List<Integer> right = new ArrayList<>();
	while(copy1.left!=null){
		left.add(copy1.data);
		copy1 = copy1.left;
	}
	while(copy2.right!=null){
		right.add(copy2.data);
		copy2 = copy2.right;
	}
	System.out.println(left);
	System.out.println(right);
 }

  public static void main(String[] args) {
    Tree tree = new Tree();
	tree.root = tree.insert(tree.root, 4);
	tree.root = tree.insert(tree.root, 2);
	tree.root = tree.insert(tree.root, 5);
	tree.root = tree.insert(tree.root, 1);
	tree.root = tree.insert(tree.root, 7);
	tree.root = tree.insert(tree.root, 9);
	tree.root = tree.insert(tree.root, 12);
	Node copy = tree.root;
	Node copy2 = tree.root;
	 findMin(copy);
	 findMax(copy2);
	 System.out.println("IN ORDER TRAVERSAL : ");
	inOrderTraversal(copy);
	 System.out.println("\nPRE ORDER TRAVERSAL : ");
	 preOrderTraversal(copy);
	 System.out.println("\nPOST ORDER TRAVERSAL : ");
	 postOrderTraversal(copy);
//	inOrderTraversalIterative(tree.root);
  }
}

