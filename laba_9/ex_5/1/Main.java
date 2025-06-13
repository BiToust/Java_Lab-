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

        // Создание списка с головы
        for (int i = 5; i >= 1; i--) {
            Node newNode = new Node(i);
            newNode.next = head;
            head = newNode;
        }

        // Вывод списка
        System.out.println("Список, созданный с головы:");
        Node current = head;
        while (current != null) {
            System.out.println("Значение узла: " + current.value);
            current = current.next;
        }
    }
}