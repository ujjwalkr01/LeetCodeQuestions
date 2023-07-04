package leetCodeProblems;

import java.util.HashMap;

public class CountCommonWords {

	public static void main(String[] args) {

		String arr[] = new String[] { "a","ab" };

		String arr1[] = new String[] { "a","a","a","ab" };

		System.out.println(countWords(arr, arr1));
	}

	private static int countWords(String[] arr, String[] arr1) {

		HashMap<String, Integer> map = new HashMap<>();

		for (String first : arr) {
			map.put(first, map.getOrDefault(first, 0) + 1);
		}
		HashMap<String, Integer> map1 = new HashMap<>();

		for (String sec : arr1) {
			map1.put(sec, map1.getOrDefault(sec, 0) + 1);
		}
		System.out.println(map);
		System.out.println(map1);

		int count = 0;
		for (String first : arr) {
			if ((map.containsKey(first) && map1.containsKey(first)) && (map.get(first) == 1 && map1.get(first) == 1)) {
				count++;
			}
		}
		return count;
		
//       	HashMap<String, Integer> map = new HashMap<>();
//
//		for (String word : words1) {
//			map.put(word, map.getOrDefault(word, 0) + 1);
//		}
//
//        for(String word : words2) {            
//            Integer freq = map.get(word); 
// 
//            if(freq != null && freq <= 1) {
//                map.put(word, freq - 1);
//            }
//        }
//        
//        int count = 0;
//        for(int val : map.values()) {
//            if(val == 0) {
//                ++count;
//            }
//        }        
//        return count;
	}

}
