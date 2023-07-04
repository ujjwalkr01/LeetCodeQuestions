package leetCodeProblems;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String arr[]=new String[] {"flower","flow","flight"};
		findcommon(arr);
	}

	private static void findcommon(String[] arr) {

		Arrays.sort(arr);
		String str1=arr[0];
		String str2=arr[arr.length-1];
		
		String bag="";
		int i=0;
		while(i<str1.length() && i<str2.length()){
			if(str1.charAt(i)==str2.charAt(i)) {
				i++;
			}else {
				break;
			}
		}
	 
		System.out.println(str1.substring(0,i));
	}

}
