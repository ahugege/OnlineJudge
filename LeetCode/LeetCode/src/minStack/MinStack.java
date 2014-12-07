package minStack;

import java.util.Stack;

public class MinStack {
	Stack<Integer> totalStack = new Stack<Integer>();
	int minMum;
	//the idea is that if the current input integer is less than the last minmum, than push the last minmum first into the stack, than the current
    public void push(int x) {
    	if (totalStack.empty()) {
    		totalStack.push(x);
			totalStack.push(x);
			minMum = x;
		}
    	else {
			if (x <= minMum) {
				totalStack.push(minMum);
				totalStack.push(x);
				minMum = x;
			}
			else
				totalStack.push(x);
		}
    }

    public void pop() {
    	if (minMum == totalStack.pop()) {
        	minMum = totalStack.pop();
		}
    }

    public int top() {
    	return totalStack.peek();
    }

    public int getMin() {
    	return minMum;
    }
}
