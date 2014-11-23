package searchRotatedArray;

class Solution {
    public int search(int[] A, int target) {
    	
        int head = 0, tail = 0, length = A.length;
        
        if (length == 0) {
			return -1 ;
		}
        else if (length == 1) {
			if (A[0] == target) {
				return 0;
			}
			return -1 ;
		}
        
        for (int findPivot = 0; findPivot < length ; findPivot++) {
        	int findPivotPlus = (findPivot+1) % length;
			if (A[findPivot] > A[findPivotPlus]) {
				head = findPivotPlus;
				tail = findPivot;
				break;
			}
		}
        
        int headBound, tailBound;
        for (headBound = head, tailBound = tail; (tailBound - headBound + length) % length != 1 ;	) {
			int midUnit = ((length + tailBound - headBound) % length / 2 + headBound) % length;
			
			if (A[midUnit] >= target)
				tailBound = midUnit;
			else
				headBound = midUnit;
		}
        
        if (A[headBound] == target)
			return headBound;
        else if (A[tailBound] == target) 
        	return tailBound;
        else
        	return -1 ;
    }
}

public class TestBench {

	public static void main(String[] args) {
		int[] A = {1,2,3,5,6,9,0};
		System.out.println(new Solution().search(A, 0));
	}

}
