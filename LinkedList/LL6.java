// Definition for singly-linked list node
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LL6 {

    // Floyd’s Cycle Detection Algorithm
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode hare = head;
        ListNode turtle = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (hare == turtle) {
                return true;
            }
        }

        return false;
    }

        public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(9);
        ListNode node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; 

        LL6 obj = new LL6();
        System.out.println("Cycle detected: " + obj.hasCycle(node1));
    }
}


//Cycle detected: true