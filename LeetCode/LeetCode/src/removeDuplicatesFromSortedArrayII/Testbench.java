package removeDuplicatesFromSortedArrayII;

class Solution {
    public int removeDuplicates(int[] A) {
        if(A.length == 0)
        	return 0;
        int countTimes = 1, index = 0, countLimit = 2;
        for (int i = 1; i < A.length; i++) {
			if(A[i] == A[index] && countTimes < countLimit){
				A[++index] = A[i];
				countTimes ++;
			}
			else if (A[i] != A[index]) {
				A[++index] = A[i];
				countTimes = 1;
			}
		}
        return index + 1;
    }
}

public class Testbench {

	public static void main(String[] args) {
		Solution testModule = new Solution();
		int[] A = {1,1,1,2,2,3};
		System.out.println(testModule.removeDuplicates(A));
	}

}
