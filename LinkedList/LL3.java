//reverse linkedlist
//space complexity=O(n)

import java.util.*;

class LL3 {
    Node head;
    private int size;

    LL3() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public int getSize() {
        return size;
    }

    // Add element at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
    }

    // Print linked list
    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // Reverse the linked list iteratively
    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = prevNode;
    }

    public static void main(String[] args) {
        LL3 list = new LL3();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        System.out.println("Original List:");
        list.printList();

        list.reverseIterate();

        System.out.println("Reversed List:");
        list.printList();
    }
}
/*
1 -> 2 -> 3 -> 4 -> null
Reversed List:
4 -> 3 -> 2 -> 1 -> null
*/