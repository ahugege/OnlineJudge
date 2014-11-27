package removeNthNode;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
}

public class Solution {


    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(findBackwardIndex(null,head,n) == -1)

        return head.next;

        return head;

    }

    

     int findBackwardIndex(ListNode father, ListNode current, int backTarget){

    if(current == null)

    return 0;

    int selfNum = findBackwardIndex(current, current.next, backTarget) + 1;

    if(selfNum==backTarget){

    if(father == null) //target happens to be head

    return -1;

    else

    father.next = current.next;

    }

    return selfNum;

    }

}

