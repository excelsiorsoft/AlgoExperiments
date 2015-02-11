package com.excelsiorsoft.binarytrees;

public class NodeData {

	String word;
	int freq;

	public NodeData(String w) {
		word = w;
		freq = 0;
	}

	public void visit() {
		System.out.printf("%s ", word);
	}

}
