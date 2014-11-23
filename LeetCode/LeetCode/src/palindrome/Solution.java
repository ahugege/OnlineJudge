package palindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        int head = 0;
        int tail = s.length() - 1;
        while (head <= tail) {
        	char atHead = s.charAt(head);
        	char atTail = s.charAt(tail);
        	if(!Character.isLetterOrDigit(atHead)){
        		head ++ ;
        		continue;
        	}
        	if(!Character.isLetterOrDigit(atTail)){
        		tail -- ;
        		continue;
        	}
        	///lalala
        	if (Character.isLowerCase(atHead)) 
        		atHead = Character.toUpperCase(atHead);

        	if (Character.isLowerCase(atTail)) 
        		atTail = Character.toUpperCase(atTail);
        	
			if(atHead != atTail)
				return false;
			head++;
			tail--;
		}
        return true;
    }
}