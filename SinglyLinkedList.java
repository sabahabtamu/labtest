package com.itsc;

public class SinglyLinkedList {
	
	// An attribute of a class SinglyLinkedList
	private Node head;
	
	// Constructor to initialize an empty singly linked list.
	public SinglyLinkedList() {
		head = null;
	}
	
	/* A method to insert a new node at a specified position.
	 * @param newData The data to be stored in the new node.
	 * @param pos The position at which the new data is going to be inserted.  
	 */
	
	public void insertAtPos(int dataIn, int pos) {
		Node newNode = new Node(dataIn);
		if(pos == 1) {
			newNode.next = head;
			head = newNode;
			return;
		}
		Node temp = head;
		int count = 0;
		while(temp != null && count < pos - 1) {
			temp = temp.next;
			count = count + 1;
		}
		if(count == pos) {
			newNode.next = temp.next;
			temp.next = newNode;
			return;
		}
	}
	
	/* A method to delete a node at a given position.
	 * @param pos The position of the node to be deleted.
	 */
	public void deleteAtPosition(int pos){
		
		if(head == null) {
			System.out.println("Empty list");
			return;
		}
		if(pos < 1) {
			System.out.println("No such position");
			return;
		}
		if(pos == 1) {
			head = head.next;
			return;
		}
		int count = 1;
		Node temp = head;
		while(temp != null && pos != count + 1) {
			temp = temp.next;
			count = count + 1;
		}
		temp.next = temp.next.next; 
	}
	
	/* A method to delete a node after a given node.
	 *  @param newDate The data of the node after which the next node will be deleted.
	 */
	public void deleteAfterNode(int dataIn) {
		
		if(head == null) {
			System.out.println("Empty list");
			return;
		}
		Node temp = head;
		if(temp.next == null) {
			System.out.println("No node after this node");
			return;
		}
		while(temp != null && temp.next.data != dataIn) {
			temp = temp.next;
		}
		
		temp.next = temp.next.next;
	}
	
	/* A method to search a node with a given data.
	 * @param dataIn The data of the node which is going to be searched.
	 */
	public int searchNode(int dataIn) {
		
		if(head == null) {
			System.out.println("Empty list");
			return -1;
		}
		int index = 1;
		Node temp = head;
		while(temp != null && temp.data != dataIn) {
			temp = temp.next;
			index = index + 1;
		}
		return index;
	}

}
