public class QueueS { 
    private Stack stack1; 
    private Stack stack2; 
 
    public QueueS(int size) { 
        stack1 = new Stack(size); 
        stack2 = new Stack(size); 
    } 
 
    public void enqueue(int value) { 
        while (!stack1.isEmpty()) { 
            stack2.push(stack1.pop()); 
        } 
        stack1.push(value); 
        while (!stack2.isEmpty()) { 
            stack1.push(stack2.pop()); 
        } 
    } 
 
    public int dequeue() { 
        if (stack1.isEmpty()) { 
            System.out.println("Queue is empty"); 
            return -1; 
        } 
        return stack1.pop(); 
    } 
 
    public int peek() { 
        if (stack1.isEmpty()) { 
            System.out.println("Queue is empty"); 
            return -1; 
        } 
        return stack1.peek(); 
    } 
}