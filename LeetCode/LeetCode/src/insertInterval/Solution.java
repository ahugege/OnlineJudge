package insertInterval;

import java.util.List;

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
    	int insert = 0;
    	while(insert < intervals.size()){
    		Interval current = intervals.get(insert);
    		//Four and only cases that intervals may overlap are listed belows
    		if(current.start <= newInterval.start && current.end >= newInterval.start){
    			newInterval.start = current.start;
    			if(current.end >= newInterval.end)
    				newInterval.end = current.end;
    			intervals.remove(insert);
    			continue;
    		}
    		if(current.start <= newInterval.end && current.end >= newInterval.end){
    			newInterval.end = current.end;
    			if(current.start <= newInterval.start)
    				newInterval.start = current.start;
    			intervals.remove(insert);
    			continue;
    		}
    		if(current.start >= newInterval.start && current.end <= newInterval.end){
    			intervals.remove(insert);
    			continue;
    		}
    		if(current.start <= newInterval.start && current.end >= newInterval.end){
    			insert = -1;
    			break;
    		}
    		//if current and newInterval never overlap, we should try move current forward
    		if(newInterval.start >= current.start){
    			insert ++;
    			continue;
    		}
    		break;
    	}
    	if(insert != -1)
    		intervals.add(insert, newInterval);
    	return intervals;
    }
}