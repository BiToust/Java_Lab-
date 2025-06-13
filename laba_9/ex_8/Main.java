package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        System.out.println("Создание списка с головы:");
        list.createHead(new int[]{1, 2, 3, 4, 5});
        System.out.println(list.toString());

        System.out.println("\nСоздание списка с хвоста:");
        LinkedList list2 = new LinkedList();
        list2.createTail(new int[]{1, 2, 3, 4, 5});
        System.out.println(list2.toString());

        System.out.println("\nДобавление элемента в начало:");
        list2.AddFirst(0);
        System.out.println(list2.toString());

        System.out.println("\nДобавление элемента в конец:");
        list2.AddLast(6);
        System.out.println(list2.toString());

        System.out.println("\nВставка элемента на позицию 3:");
        list2.Insert(3, 99);
        System.out.println(list2.toString());

        System.out.println("\nУдаление первого элемента:");
        list2.RemoveFirst();
        System.out.println(list2.toString());

        System.out.println("\nУдаление последнего элемента:");
        list2.RemoveLast();
        System.out.println(list2.toString());

        System.out.println("\nУдаление элемента на позиции 2:");
        list2.Remove(2);
        System.out.println(list2.toString());

        System.out.println("\nРекурсивное создание списка с головы:");
        LinkedList list3 = new LinkedList();
        list3.createHeadRec(new int[]{10, 20, 30, 40, 50});
        System.out.println(list3.toStringRec());

        System.out.println("\nРекурсивное создание списка с хвоста:");
        LinkedList list4 = new LinkedList();
        list4.createTailRec(new int[]{10, 20, 30, 40, 50});
        System.out.println(list4.toStringRec());
    }
}

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

class LinkedList {
    private Node head;
    private Node tail;

    public void createHead(int[] values) {
        head = null;
        tail = null;
        for (int i = values.length - 1; i >= 0; i--) {
            head = new Node(values[i], head);
            if (tail == null) {
                tail = head;
            }
        }
    }

    public void createTail(int[] values) {
        head = null;
        tail = null;
        for (int value : values) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
    }

    public void AddFirst(int value) {
        head = new Node(value, head);
        if (tail == null) {
            tail = head;
        }
    }

    public void AddLast(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void Insert(int index, int value) {
        if (index == 0) {
            AddFirst(value);
            return;
        }

        Node current = head;
        int count = 0;
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            AddLast(value);
        } else {
            Node newNode = new Node(value, current.next);
            current.next = newNode;
        }
    }

    public void RemoveFirst() {
        if (head != null) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }
    }

    public void RemoveLast() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
        tail = current;
    }

    public void Remove(int index) {
        if (index == 0) {
            RemoveFirst();
            return;
        }

        Node current = head;
        int count = 0;
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            return;
        }

        current.next = current.next.next;
        if (current.next == null) {
            tail = current;
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.value).append(" -> ");
            current = current.next;
        }
        result.append("null");
        return result.toString();
    }

    public void createHeadRec(int[] values) {
        if (values.length == 0) {
            return;
        }

        head = new Node(values[0], head);
        if (tail == null) {
            tail = head;
        }

        if (values.length > 1) {
            int[] newValues = new int[values.length - 1];
            System.arraycopy(values, 1, newValues, 0, newValues.length);
            createHeadRec(newValues);
        }
    }

    public void createTailRec(int[] values) {
        if (values.length == 0) {
            return;
        }

        if (head == null) {
            head = new Node(values[0]);
            tail = head;
        } else {
            tail.next = new Node(values[0]);
            tail = tail.next;
        }

        if (values.length > 1) {
            int[] newValues = new int[values.length - 1];
            System.arraycopy(values, 1, newValues, 0, newValues.length);
            createTailRec(newValues);
        }
    }

    public String toStringRec() {
        return toStringRecHelper(head);
    }

    private String toStringRecHelper(Node node) {
        if (node == null) {
            return "null";
        }
        return node.value + " -> " + toStringRecHelper(node.next);
    }
}