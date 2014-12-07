package combination;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution_aborted {
    public List<List<Integer>> combine(int n, int k) {

    	List<List<Integer>> resultArrayList = null;

        if(k > n)
        	return null;
        if(k == n)
        {
        	resultArrayList = new ArrayList<List<Integer>>();
        	List<Integer> temp = new ArrayList<Integer>();
        	for (int i = 1; i <=n ; i++) {
				temp.add(i);
			}
        	resultArrayList.add(temp);
        	return resultArrayList;
        }

    	List<List<Integer>> tempArrayList = combine(n - 1, k);
    	if(tempArrayList != null)
    	{
    		if(resultArrayList == null)
    			resultArrayList = new ArrayList<List<Integer>>();
    		resultArrayList.addAll(tempArrayList);
    	}
    	
        tempArrayList = combine(n - 1, k - 1);
    	if (tempArrayList != null) {
    		if(resultArrayList == null)
    			resultArrayList = new ArrayList<List<Integer>>();
    		
        	for (Iterator<List<Integer>> iterator = tempArrayList.iterator(); iterator.hasNext();) {
    			List<Integer> list = (List<Integer>) iterator.next();
    			list.add(k);
    			resultArrayList.add(list);
    		}
		}
    	return resultArrayList;
    }
}
