package com.itsc.package1;

public class Stacks {
	private int top, maxSize;
	private int[] array;
	
	public Stacks(int size) {
		top = -1;
		maxSize = size;
		array = new int[maxSize];
		
		
	}
	
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return maxSize == array.length;
	}
	
	public void push(int element) {
		if(!isFull()) {
			array[++top] = element;
		    maxSize++;
		}
		else {
			System.out.println("Stack is full");
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			int item = array[top--];
			maxSize--;
			return item;
		}
		return -1;
		
	}
	
	public int peek() {
		if(top != -1) {
			return array[top];
		}
		else
			return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stacks num = new Stacks(7);
		num.push(10);
		num.push(22);
		num.push(15);
		num.pop();
		num.peek();
		for(int i = 0; i < num.maxSize; i++) {
			System.out.println(num.array[i]);
		}
		

	}

}
