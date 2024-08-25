package com.leetcode;

public class RemoveNthNode {

    public static void main(String[] args) {
        // Create sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        // Instantiate RemoveNthNode and call the method
        RemoveNthNode solution = new RemoveNthNode();
        ListNode newHead = solution.removeNthFromEnd(head, 2);

        // Print the resulting linked list
        printList(newHead);
    }

    // Method to remove the nth node from the end of the list
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        // Advance the first pointer so that the gap between first and second is n nodes
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move the first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Skip the desired node
        second.next = second.next.next;

        // Return the head node, which might be different if the head was removed
        return dummy.next;
    }

    // Helper method to print the linked list
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
