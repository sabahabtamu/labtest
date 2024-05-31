package com.itsc;

public class Node {
	
	// Creating attributes for the class Node.
	int data;
	Node next;
	
	/* 
	 * Creating a constructor to initialize a node with an input data.
	 * @param data The data to be stored in the node.
	 */
	public Node(int data) {
		this.data = data;
		next=null;
	}

}
