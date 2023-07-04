package BinarySearchQuestions;

public class FindMinElementinSorted_rotated_II {

	public static void main(String[] args) {

		int arr[] = { 10,1,10,10,10 };

		System.out.println(findMINelement(arr));
	}

	private static int findMINelement(int[] arr) {

		int n = arr.length;
		int low = 0, high = n - 1;

        while(low<high) {
        	int mid=(low+high)/2;
        	
        	if(arr[mid]>arr[high]) {
        		low=mid+1;
        	}else if(arr[mid]<arr[high]) {
        		high=mid;
        	}else {
        		high--;
        	}
        }
        return arr[low];
	}

}
