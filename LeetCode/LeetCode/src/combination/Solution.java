package combination;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> combine(int n, int k) {
    	List<List<Integer>> totalResults = new ArrayList<List<Integer>>();
    	addList(1, n, k, new ArrayList<Integer>(), totalResults);
    	return totalResults;
    }
    void addList(int headLimit, int tailLimit, int remain, List<Integer> currList, List<List<Integer>> totalList ){
    	if(tailLimit < remain) //not enough numbers to choose from
    		return;
    	if(remain == 0)
    	{
    		ArrayList<Integer> temp = new ArrayList<Integer>();
    		temp.addAll(currList);
    		totalList.add(temp);
    		return;
    	}
    	for (int i = headLimit; i <= tailLimit; i++) {
    		currList.add((Integer)i);
			addList(i + 1, tailLimit, remain - 1, currList , totalList);
			currList.remove((Integer)i);
		}
    	return;
    }
}
