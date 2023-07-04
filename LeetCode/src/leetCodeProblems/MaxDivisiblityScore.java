package leetCodeProblems;

public class MaxDivisiblityScore {

	public static void main(String[] args) {

		int arr[] = new int[] { 16 };
		int div[] = new int[] { 10, 12 };

		System.out.println(findMaxDivScore(arr, div));
	}

	private static int findMaxDivScore(int[] arr, int[] div) {

		int maxCount = 0, res = 0,min=Integer.MAX_VALUE;
		boolean isGreater=false;

		for (int i = 0; i < div.length; i++) {
			int count = 0 ;
			//res = div[i];

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] % div[i] == 0) {
					count++;
				}
			}
			if (maxCount < count) {
				maxCount = count;
				res = div[i];
				isGreater=true;
			}
            if(maxCount == count) {
				if(res > div[i] && isGreater) {
					res = div[i];
				}
				if(min>div[i]) {
					min=div[i];
				}
			}
		}

		return (isGreater)?res:min;
	}

}
