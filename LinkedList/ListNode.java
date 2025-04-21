//find the n th node from last+ delete n th node
/*
Define for singly-linked list
public class ListNode{
int val;
ListNode next;
ListNode(){}
ListNode(int val){this.val=val;}
ListNode(int val,ListNode next){this.val=val;this.next=next;}
}
*/

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class LL4 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        if (head.next == null && n == 1) return null;

        // Find size
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }

        if (n == size) {
            return head.next;
        }

        //  Find (size - n)th node (previous of target)
        int indexToSearch = size - n;
        ListNode prev = head;
        for (int i = 1; i < indexToSearch; i++) {
            prev = prev.next;
        }

        //  Delete the node
        prev.next = prev.next.next;

        return head;
    }
}
