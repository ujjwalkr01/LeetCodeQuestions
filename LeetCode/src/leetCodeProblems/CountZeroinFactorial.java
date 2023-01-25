package leetCodeProblems;

import java.math.BigInteger;
import java.util.Scanner;

public class CountZeroinFactorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");

		int num = sc.nextInt();
//		BigInteger pro=BigInteger.valueOf(1);
//
//		for (int i = num; i > 0; i--)
//			pro = pro.multiply(BigInteger.valueOf(i));
//        System.out.println(pro);
//		int count = 0;
//		while (pro.remainder(BigInteger.valueOf(10))== 0) {
//			count++;
//			pro /= 10;
//		}
//		System.out.println(count);
		int res=trailingzero(num);
		System.out.println(res);

		
	}
	public static int trailingzero(int n){
		 if (n < 0) // Negative Number Edge Case
	            return -1;
	 
	        // Initialize result
	        int count = 0;
	 
	        // Keep dividing n by powers
	        // of 5 and update count
	        for (int i = 5; n / i >= 1; i *= 5)
	            count += n / i;
	        return count;
	}

}
