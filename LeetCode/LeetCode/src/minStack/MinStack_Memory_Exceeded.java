//aborted due to memory limit exceeded 

package minStack;

public class MinStack_Memory_Exceeded {
	static StackUnit stackHead = null;
	class StackUnit{
		int val;
		StackUnit next;
		int minVal;
	}
    public void push(int x) {
        StackUnit xUnit = new StackUnit();
        xUnit.val = x;
        xUnit.next = stackHead;
        if(stackHead != null)
        {
	        if (x < stackHead.minVal)
				xUnit.minVal = x;
	        else
	        	xUnit.minVal = stackHead.minVal;
        }
        else {
			xUnit.minVal = x;
		}
        
        stackHead = xUnit;
        return;
    }

    public void pop() {
    	stackHead = stackHead.next;
    }

    public int top() {
        return stackHead.val;
    }

    public int getMin() {
        return stackHead.minVal;
    }
}