public class Main {
    public static void main(String[] args) {
        // Stack demonstration
Stack stack = new Stack();  // Create a new stack

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Is stack empty? " + stack.isEmpty());

        // Queue demonstration
        System.out.println("\nQueue Operations:");
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Dequeued from queue: " + queue.dequeue()); // Outputs 1
        System.out.println("Peek queue: " + queue.peek()); // Outputs 2
        System.out.println("Queue size: " + queue.size()); // Outputs 2
    }
}
