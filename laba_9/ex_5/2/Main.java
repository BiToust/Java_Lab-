package org.example;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Node head = null;
        Node tail = null;

        for (int i = 1; i <= 5; i++) {
            Node newNode = new Node(i);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.println("Список, созданный с хвоста:");
        Node current = head;
        while (current != null) {
            System.out.println("Значение узла: " + current.value);
            current = current.next;
        }
    }
}