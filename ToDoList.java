package com.itsc;

public class ToDoList {

	// Attribute of the class.
	Node head;
	
	// Constructor  to initialize an empty class.
	public ToDoList() {
		head=null;
	}
	
	/* A method to add task.
	 * @param task The task to be added.
	 */
	public void addToDo(Task task) {
		Node newNode = new Node(task);
		if(head == null) {
			head = newNode;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	/* A method to mark a task with a specific title.
	 * @param title The title of which the task should be marked.
	 */
	public void markToDoAsCompleted(String title) {
		Node temp = head;
		while(temp != null) {
			if(temp.task.getTitle() == title) {
				temp.task.markCompleted();
				return;
			}
			temp = temp.next;
		}
		System.out.println("Task not found");
	}
	
	// A method to view a list of tasks.
	public void viewToDoList() {
		if(head == null) {
			System.out.println("Empty list");
		}
		Node temp = head;
		while(temp != null) {
			System.out.println("Title: " + temp.task.getTitle());
			System.out.println("Description: " + temp.task.getDescription());
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
ToDoList doList = new ToDoList();
		
	// Adding task list.
	doList.addToDo(new Task("Clean the house", "the compound, Salon, Guest house, kitchen"));
	doList.addToDo(new Task("Go to market", "buy fruits, buy vegetables, buy cereals"));
	doList.addToDo(new Task("Complete courses","DSA, Database, OOP"));
	
	// viewing task in the list.
	doList.viewToDoList();
		
	// Marking task.
	doList.markToDoAsCompleted("Complete courses");
	
		
	System.out.println("To do list after tasks marked as completed");
		
	// Viewing task in the list.
	doList.viewToDoList();

	}

}
