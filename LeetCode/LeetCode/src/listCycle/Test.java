package listCycle;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		b.next = a;
		a.next = b;
		ListNode c = null;
		Solution solution = new Solution();
		System.out.println(solution.hasCycle(a));
		System.out.println(solution.hasCycle(c));
	}

}
