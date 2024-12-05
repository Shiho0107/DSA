import java.util.LinkedList;
// Queue implementation
class Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    // Enqueue an item at the end of the queue
    public void enqueue(T item) {
        list.addLast(item);
    }

    // Dequeue an item from the front of the queue
    public T dequeue() {
        if (list.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list.removeFirst();
    }

    // Peek at the front item of the queue without removing it
    public T peek() {
        if (list.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list.getFirst();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Get the size of the queue
    public int size() {
        return list.size();
    }
}