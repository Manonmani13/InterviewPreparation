package com.leetcode;

import com.leetcode.RemoveNthNode.ListNode;

public class MergeTwoSoretedList {
	public static void main(String[] args) {
		 ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
	        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
	        ListNode mergedList = mergeTwoLists(list1, list2);
	        while (mergedList != null) {
	            System.out.print(mergedList.val + " ");
	            mergedList = mergedList.next;
	        }
	}

	private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		 ListNode dummy = new ListNode(-1);
	        ListNode current = dummy;
	         while (list1 != null && list2 != null) {
	            if (list1.val < list2.val) {
	                current.next = list1;
	                list1 = list1.next;
	            } else {
	                current.next = list2;
	                list2 = list2.next;
	            }
	            current = current.next;
	        }
	         if (list1 != null) {
	            current.next = list1;
	        }
	        if (list2 != null) {
	            current.next = list2;
	        }
	                return dummy.next;

	}

}
