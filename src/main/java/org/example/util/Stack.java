package org.example.util;

public class Stack<E> {
    private int capacity;
    private Object[] elements;
    private int top;

    public Stack(int size) {
        this.elements = new Object[size];
        this.capacity = size;
        this.top = -1;
    }

    /**
     *
     * @param element
     */
    public void push(E element) {
        if (this.isFull()) {
            throw new RuntimeException("Stack is full");
        }
        this.top++;
        this.elements[top] = element;
    }

    /**
     * get and remove the top element of stack
     * @return
     */
    public Object pop() {
        this.top--;
        return this.peek();
    }

    /**
     * return the top element of stack the stack
     * @return
     */
    public Object peek() {
        if (this.isEmpty()) {
            throw new RuntimeException("the stack is empty");
        }
        return this.elements[top];
    }

    /**
     * check if the stack is empty or not
     * @return
     */
    public boolean isEmpty() {
        return this.top == -1;
    }

    /**
     *
     * @return
     */
    public int size() {
        return this.top + 1;
    }

    private boolean isFull() {
        return this.top == this.capacity -1;
    }
}
