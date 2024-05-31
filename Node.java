package com.itsc;

public class Node {

	// Attributes of the class Node.
	Task task;
	Node next;
	
	/* Constructor to initialize a Node.
	* @param task The task to be stored in the Node.
	*/
	public Node(Task task) {
		this.task = task;
		next = null;
	}
}
