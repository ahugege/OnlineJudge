package palindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        int y = 0;
        int origin = x;
        while (x > 0) {
        	y *= 10;
			y += x % 10;
			x /= 10;
		}
        return origin==y;
    }
}
