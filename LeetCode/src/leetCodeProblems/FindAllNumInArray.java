package leetCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindAllNumInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int nums[] = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

		findDisappearedNumbers(nums, n);
	}

	private static void findDisappearedNumbers(int[] nums, int n) {

		ArrayList<Integer> list=new ArrayList<>();
	    int freq[]=new int[n+1];
        for(int i=0;i<n;i++) {
        	//if(nums[i]<=n)
        	freq[nums[i]]++;
        }
        
        for(int i=1;i<freq.length;i++) {
        	System.out.print(freq[i]+" ");
        }
        
        for(int i=1;i<freq.length;i++) {
        	if(freq[i]==0) {
        		list.add(i);
        	}
        }
        System.out.println(list);
	}

}
