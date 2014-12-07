package workBreak;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Solution_TimeLimitExceeded {
    public boolean wordBreak(String s, Set<String> dict) {
    	TreeSet<Integer> lengthSet = new TreeSet<Integer>();
    	for (Iterator<String> iterator = dict.iterator(); iterator.hasNext();) {
			String currentString = (String) iterator.next();
			lengthSet.add(currentString.length());
		}
    	return workBreakWithLengthRange(s, dict, lengthSet);
    }
    boolean workBreakWithLengthRange(String s, Set<String> dict,TreeSet<Integer> lengthSet){
    	if (dict.contains(s))
    		return true;
    	for (Iterator<Integer> iterator = lengthSet.descendingIterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			if(integer > s.length())
				continue;
			if(dict.contains(s.substring(0, integer - 1)))
				if(workBreakWithLengthRange(s.substring(integer), dict, lengthSet))
					return true;
		}
    	return false;
    }
}