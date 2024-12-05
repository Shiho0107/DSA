import java.util.LinkedList;

class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    // Push an item onto the stack
    public void push(T item) {
        list.addFirst(item);
    }

    // Pop an item from the stack
    public T pop() {
        if (list.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.removeFirst();
    }

    // Peek at the top item of the stack without removing it
    public T peek() {
        if (list.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.getFirst();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Get the size of the stack
    public int size() {
        return list.size();
    }
}