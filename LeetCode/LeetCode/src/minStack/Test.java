package minStack;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack minStack = new MinStack();
		int ans;
		minStack.push(2147483646);
		minStack.push(2147483646);
		minStack.push(2147483647);
		ans = minStack.top();
		minStack.pop();
		ans = minStack.getMin();
		minStack.pop();
		ans = minStack.getMin();
		minStack.pop();
		minStack.push(2147483647);
		ans = minStack.top();
		ans = minStack.getMin();
		minStack.push(-2147483648);
		ans = minStack.top();
		ans = minStack.getMin();
		minStack.pop();
		ans = minStack.getMin();
	}

}
