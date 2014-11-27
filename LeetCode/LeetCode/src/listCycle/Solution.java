package listCycle;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */


class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
}

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode iter1 = head;
        ListNode iter2 = head;
        while( ( iter1 != null) && (iter2 != null) ){
        	iter1 = iter1.next;
        	iter2 = iter2.next;
        	if(iter2 == null)
        		return false;
        	iter2 = iter2.next;
        	if(iter1 == iter2)
        		return true;
        }
        return false;
    }
}