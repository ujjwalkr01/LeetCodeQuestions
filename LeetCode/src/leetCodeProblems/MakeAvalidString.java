package leetCodeProblems;

import java.util.HashMap;
import java.util.Map;

public class MakeAvalidString {

	public static void main(String[] args) {

		String word = "aaaaab";
		makeaValidString(word);
	}

	private static void makeaValidString(String word) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < word.length(); i++) {
			map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0) + 1);
		}
		System.out.println(map);
//	      int max=0;
//	       for(Map.Entry<Character,Integer> mp:map.entrySet()) {
//	       if(map.size()==1) {
//	    	   System.out.println(mp.getValue()*2);
//	    	   return;
//	       }
//	       if(map.size()==3) {
//	    	   System.out.println("valid string");
//	    	   return;
//	       }
//	       if(map.size()==2) {
//	    	 if(max<map.size()) 
//	       }
	}
}
