package com.excelsiorsoft.binarytrees;

import java.util.Scanner;

import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public void test() throws Exception {
		
			
		Scanner in = new Scanner(this.getClass().getResourceAsStream("/btree.in"));
		BinaryTree bt = new BinaryTree(in);
		
		System.out.println("\nThe pre-order traversal: ");
		bt.preOrder();
		
		System.out.println("\nThe in-order traversal: ");
		bt.inOrder();
		
		System.out.println("\nThe post-order traversal: ");
		bt.postOrder();
	}

}
