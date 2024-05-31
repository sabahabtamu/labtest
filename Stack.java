package com.itsc;

public class Stack {
	
	private Node top;
	
	public Stack() {
		top = null;
	}
	
	public void push(int dataIn) {
		Node newNode = new Node(dataIn);
		newNode.next = top;
		top = newNode;
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		int pData = top.data;
		top = top.next;
		return pData;
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return top.data;
	}
	boolean isEmpty() {
		return top == null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack nStack = new Stack();
		nStack.push(5);
		nStack.push(0);
		nStack.push(8);
		nStack.push(6);
		
		int pData = nStack.pop();
		System.out.println(pData);
		int pkData = nStack.peek();
		System.out.println(pkData);

	}

}
