package leetCodeProblems;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		sc.nextLine();
//		String s=sc.nextLine();
//		int age=sc.nextInt();
		
		System.out.println(n);
//		System.out.println(s);
//		System.out.println(age);
		
	   name(n);
	   name(n,n);
	   String str1="abc";
	   String str2="abc";
	   String str3=new String("abc");
	   System.out.println(str1==str3);
	   
	}
	public static void name(int n) {
		System.out.println("hi"+n);
	}
	public static void name(int n,int x) {
		System.out.println("hello"+n);
	}

}
