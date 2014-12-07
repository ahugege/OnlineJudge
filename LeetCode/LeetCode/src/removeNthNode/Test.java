package removeNthNode;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(10);
		ListNode temp = head;
		for(int i=0;i<0;i++){
			temp.next = new ListNode(11+i);
			temp = temp.next;
		}
		Solution solution = new Solution();
		temp = solution.removeNthFromEnd(head, 1);
		
		while(temp != null){
			System.out.print(temp.val);
			temp =temp.next;
		}
	}

}
