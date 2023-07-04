package leetCodeProblems;

public class FindDuplicateNumber {
	
	public static void main(String[] args) {
		int arr[]=new int[] {1,3,4,2,2};
		
		for(int i=0;i<arr.length;i++){ //i=0
		       if(arr[Math.abs(arr[i])]<0){ //4<0 //1<0 //4<0 //3<0 //3<0
		           System.out.println(Math.abs(arr[i]));
		           break;
		       }else{
		    	   arr[Math.abs(arr[i])]*=-1; //-4 //-1 //-4 //-3
		       }
		   }
		   //return 0;		
	}
	   
}

