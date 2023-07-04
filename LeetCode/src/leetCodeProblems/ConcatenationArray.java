package leetCodeProblems;

public class ConcatenationArray {

	public static void main(String[] args) {

		int arr[]=new int[] {1,2,1,3};
		
		concatinateArray(arr);
	}

	private static void concatinateArray(int[] arr) {

		int res[]=new int[2*arr.length];
		
		int j=0;
		for(int i=0;i<arr.length;i++) {
			res[j++]=arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			res[j++]=arr[i];
		}
		
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}

}
