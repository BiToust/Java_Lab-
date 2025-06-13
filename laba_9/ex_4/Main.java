package org.example;

class Node {
    int value;
    Node next;

    // Конструктор узла
    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        Node head = node1;

        System.out.println("Содержимое однонаправленного списка:");
        Node current = head;
        while (current != null) {
            System.out.println("Значение узла: " + current.value);
            current = current.next;
        }
    }
}