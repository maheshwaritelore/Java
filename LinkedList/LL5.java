// Definition for singly-linked list node
class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class LL5 {

    // Function to reverse a linked list
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Function to find the middle node
    public ListNode findMiddle(ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        //  Find the middle
        ListNode middle = findMiddle(head);

        // Reverse the second half
        ListNode secondHalfStart = reverse(middle.next);

        //  Compare both halves
        ListNode firstHalfStart = head;
        ListNode secondPointer = secondHalfStart;

        while (secondPointer != null) {
            if (firstHalfStart.val != secondPointer.val) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondPointer = secondPointer.next;
        }

        return true;
    }
    public static void main(String[] args) {

        ListNode n4 = new ListNode(1);
        ListNode n3 = new ListNode(2, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        LL5 obj = new LL5();
        boolean result = obj.isPalindrome(n1);

        System.out.println("Is Palindrome: " + result);
    }
}

//o/p-> Is Palindrome: true
