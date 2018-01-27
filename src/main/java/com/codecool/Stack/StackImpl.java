package com.codecool.Stack;

public class StackImpl <T> {
    private int maxSize;
    private T[] elements;
    private int top;

    public StackImpl(int s) {
        maxSize = s;
        elements = (T[]) new Object[maxSize];
        top = 0;
    }
    public void push(T j) {
        elements[top++] = j;
    }
    public T pop() {
        return elements[--top];
    }
    public T peek() {
        return elements[top-1];
    }
    public boolean isEmpty() {
        return (top == 0);
    }
    public boolean isFull() {
        return (top == maxSize);
    }

}
