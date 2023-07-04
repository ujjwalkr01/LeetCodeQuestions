package leetCodeProblems;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[]=new int[] {10,20,30,40};
		
		int target=50;
		
		System.out.println(binarySearch(arr,target));
	}

	private static int binarySearch(int[] arr, int target) {

		int low=0,high=arr.length-1;
		
		while(low<=high) {
			int mid=(low+high)/2;
			
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]>target) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return -1;
	}

}
