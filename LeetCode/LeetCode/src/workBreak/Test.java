package workBreak;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String LeetCode = "LeetCode";
		HashSet<String> dict = new HashSet<String>();
		dict.add("Leet");
		dict.add("Code");
		Solution_aborted solution = new Solution_aborted();
		System.out.println(solution.wordBreak(LeetCode, dict));
	}

}
