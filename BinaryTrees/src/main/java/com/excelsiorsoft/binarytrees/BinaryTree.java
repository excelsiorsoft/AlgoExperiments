package com.excelsiorsoft.binarytrees;

import java.util.*;

public class BinaryTree {
	private static final String NULL_SYMBOL = "@";
	TreeNode root;

	public BinaryTree() {
		root = null;
	}

	public BinaryTree(Scanner in) {
		root = buildTree(in);
	}

	private static TreeNode buildTree(Scanner in) {
		String str = in.next();
		if (NULL_SYMBOL.equals(str))
			return null;
		TreeNode p = new TreeNode(new NodeData(str));
		p.left = buildTree(in);
		p.right = buildTree(in);
		return p;
	}

	public void preOrder() {
		preOrderTraversal(root);
	}

	private void preOrderTraversal(TreeNode node) {
		if (node != null) {
			node.data.visit();
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}

	public void inOrder() {
		inOrderTraversal(root);
	}

	private void inOrderTraversal(TreeNode node) {
		if (node != null) {
			inOrderTraversal(node.left);
			node.data.visit();
			inOrderTraversal(node.right);
		}
	} 

	public void postOrder() {
		postOrderTraversal(root);
	}

	public void postOrderTraversal(TreeNode node) {
		if (node != null) {
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			node.data.visit();
		}
	} 

} 
