package countAndSay;

public class Solution {
    public String countAndSay(int n) {
    	String array = "1";
        while(--n > 0){
        	int count = 0;
        	String tempArray = "";
        	char mark = array.charAt(0);
        	for (int i = 0; i < array.length(); i++) {
				if(mark == array.charAt(i)){
					count ++ ;
					continue;
				}
				tempArray = tempArray.concat(Integer.toString(count));
				count = 1;
				tempArray = tempArray.concat(Character.toString(mark));
				mark = array.charAt(i);				
			}

			tempArray = tempArray.concat(Integer.toString(count));
			tempArray = tempArray.concat(Character.toString(mark));
        	array = tempArray;
        }
        return array;
    }
}