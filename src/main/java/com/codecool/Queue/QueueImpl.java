package com.codecool.Queue;

public class QueueImpl {

    private static class Node {
        private String data;
        private Node next;

        private Node(String data) {
            this.data = data;
        }
    }

    private Node first;
    private Node last;

    public boolean isEmpty() {
        return first == null;
    }

    public String peek() {
        return first.data;
    }

    public void enqueue(String data) {

        Node node = new Node(data);
        if(first == null) {
            first = node;
        }

        if(last != null) {
            last.next = node;
        }
        last = node;
    }

    public String dequeue() {
        String data = first.data;

        first = first.next;
        if(this.first == null) {
            this.last = null;
        }

        return data;
    }

    public int queueSize() {
        int size = 0;
        if(this.first == null) {
            return size;
        }
        size++;

        Node actual = this.first;
        while(actual.next != null) {
            size++;
            actual = actual.next;
        }
        return size;
    }
}
