package leetCodeProblems;

import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfPairs {

	public static void main(String[] args) {

		int arr[] = new int[] { 1,1};
		findMaxPair(arr);
	}

	private static void findMaxPair(int[] nums) {

	     HashMap<Integer,Integer> map=new HashMap<>();

	        for(int num:nums){
	            map.put(num,map.getOrDefault(num,0)+1);
	        }
	        System.out.print(map);
	        int countEven=0, countOdd=0;
	        
	        for(Map.Entry<Integer, Integer> mp:map.entrySet()){
	        	//System.out.println(mp.getValue());
	            if(mp.getValue()%2==0) {
	            	//map.remove(n1);
	            	countEven++;
	            }else {
	            	//map.remove(n1);
	            	countEven++;
	            	countOdd++;
	            }
	        }
	        
	        System.out.println(countEven+" "+countOdd);

	}

}
