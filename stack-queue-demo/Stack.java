import java.util.LinkedList;

// Stack class using a linked list
class Stack {
    private Node top;  // Pointer to the top of the stack

    // Constructor to initialize the stack
    public Stack() {
        this.top = null;  // Stack is initially empty
    }

    // Push an element onto the stack
    public void push(int value) {
        Node newNode = new Node(value);  // Create a new node
        newNode.next = top;  // Link the new node to the current top
        top = newNode;  // Update top to the new node
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;  // Indicate stack is empty
        } else {
            int poppedValue = top.data;  // Get the top element
            top = top.next;  // Update top to the next node
            return poppedValue;  // Return the popped value
        }
    }

    // Peek at the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;  // Indicate stack is empty
        } else {
            return top.data;  // Return the top element
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;  // If top is null, stack is empty
    }
}// Stack class using a linked list
class Stack {
    private Node top;  // Pointer to the top of the stack

    // Constructor to initialize the stack
    public Stack() {
        this.top = null;  // Stack is initially empty
    }

    // Push an element onto the stack
    public void push(int value) {
        Node newNode = new Node(value);  // Create a new node
        newNode.next = top;  // Link the new node to the current top
        top = newNode;  // Update top to the new node
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;  // Indicate stack is empty
        } else {
            int poppedValue = top.data;  // Get the top element
            top = top.next;  // Update top to the next node
            return poppedValue;  // Return the popped value
        }
    }

    // Peek at the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;  // Indicate stack is empty
        } else {
            return top.data;  // Return the top element
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;  // If top is null, stack is empty
    }
}

class Stack {
    private int maxSize;  // Maximum size of the stack
    private int[] stackArray;  // Array to hold stack elements
    private int top;  // Index of the top element

    // Constructor to initialize the stack with a given size
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;  // Stack is initially empty
    }

    // Push an element onto the stack
    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;  // Increment top and add element
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    // Pop an element from the stack
    public int pop() {
        if (!isEmpty()) {
            return stackArray[top--];  // Return top element and decrement top
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;  // Indicate stack is empty
        }
    }

    // Peek at the top element without removing it
    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];  // Return top element
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;  // Indicate stack is empty
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Get the size of the stack
    public int size() {
        return top + 1;
    }
}

