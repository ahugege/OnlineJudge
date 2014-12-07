package workBreak;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Solution_aborted {
    public boolean wordBreak(String s, Set<String> dict) {
    	HashSet<String> allStrings= new HashSet<String>();
    	allStrings.add(s);
    	for (Iterator<String> iterator = dict.iterator(); iterator.hasNext();) {
    		if (allStrings.isEmpty())
    			return true;
			String dictUnit = (String) iterator.next();
			for (Iterator<String> iterator2 = allStrings.iterator(); iterator2.hasNext();) {
				String currentString = (String) iterator2.next();
				allStrings.remove(currentString);
				allStrings.addAll( Arrays.asList(currentString.split(dictUnit)) );
			}
		}
    	return false;
    }
}
