package leetCodeProblems;

public class Recursion {

	public static void main(String[] args) {

		int num=456;
		
		System.out.println(get(num));
	}

	private static int get(int num) {

	  if(num<10) {
		  return num;
	  }
	  
	  int sum=0;
	  while(num!=0) {
		  sum+=(num%10);
		  num/=10;
	  }
	  
	  return get(sum);
	}

}
