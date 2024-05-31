package com.itsc;

public class Task {

	// Attributes of the class Task.
	private String title;
	private String description;
	private boolean completed;
	
	/* Constructor to initialize the class with a title and description.
	 * @param title @param description The title and description to be stored in the task.
	 */
	public Task(String title, String description) {
		this.title = title;
		this.description = description;
		this.completed = false;
	}
	
	// Getter method to read the title.
	public String getTitle() {
		return title;
	}
	
	// Getter method to read the description.
	public String getDescription() {
		return description;
	}
	
	// Method to check if task is completed.
	public boolean isCompleted() {
		return completed;
	}
	
	//Method to mark the task as completed.
	public void markCompleted() {
		completed = true;
	}
}
