package removeDuplicatesFromSortedArray;

class Solution {
    public int removeDuplicates(int[] A) {
    	
        if(A.length == 0)
            return 0;
            
        int num = 0;
    	for(int i=1;i<A.length;i++){
    		if (A[i] != A[num]) {
				A[++num] = A[i];
			}
    	}
    	return num + 1;
    }
}


public class Test {
	public static void main(String[] args) {
		int[] testArray = {1,1,2};
		
		Solution testModule = new Solution();
		System.out.println(testModule.removeDuplicates(testArray));
	}

}
