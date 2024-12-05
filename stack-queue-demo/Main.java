public class Main {
    public static void main(String[] args) {
        // Stack demonstration
        System.out.println("Stack Operations:");
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Popped from stack: " + stack.pop()); // Outputs 3
        System.out.println("Peek stack: " + stack.peek()); // Outputs 2
        System.out.println("Stack size: " + stack.size()); // Outputs 2

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