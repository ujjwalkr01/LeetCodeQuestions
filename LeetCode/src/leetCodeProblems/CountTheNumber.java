package leetCodeProblems;

import java.util.HashSet;
import java.util.Set;

public class CountTheNumber {

	public static void main(String[] args) {

		String allowed="ab";
		String words[]=new String[] {"ad","bd","aaab","baa","badab"};
		
		System.out.println(countConsistentStrings(allowed,words));
	}

	private static int countConsistentStrings(String allowed, String[] words) {
//		 int count = words.length;
//		   int[] store = new int[26];
//
//		for (char c : allowed.toCharArray()){
//			store[c-'a']++;
//		}
//
//		for (String word : words) {
//			
//			for (char c : word.toCharArray()) {
//				if (store[c-'a'] <= 0){
//					count--;
//					break;
//				}
//			}
//		}
//		return count;
	       int count = 0;
	   	Set<Character> set = new HashSet<>(); // added Set to search in O(1)

	   	for(char letter : allowed.toCharArray())
	   	{
	   		set.add(letter);
	   	}

	   	for(String word : words)
	   	{
	   		for(int i = 0; i < word.length(); i++)
	   		{
	   			if(!set.contains(word.charAt(i)))
	   			{
	   				break;
	   			}

	   			if(i == word.length() -1)
	   			{
	   				count++;
	   			}
	   		}
	   	}

	   	return count;
	}

}
