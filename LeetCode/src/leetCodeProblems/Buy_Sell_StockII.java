package leetCodeProblems;

public class Buy_Sell_StockII {

	public static void main(String[] args) {

		int arr[] = new int[] { 1,2,3,4,5 };
		System.out.println(maxProfit(arr));
	}

	private static int maxProfit(int[] arr) {

		int profit = 0, buy = 0, sell = 0;

		if (arr[0] <= arr[1]) {
			buy = arr[0];
		}
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] < arr[i - 1] && arr[i] <= arr[i + 1]) {
				buy = arr[i];
				System.out.println("buy" + buy);
			}
			if (arr[i] >= arr[i - 1] && arr[i] > arr[i + 1]) {
				sell = arr[i];
				profit += (sell - buy);
				System.out.println("sell" + sell);
			}

		}

		if (arr[arr.length - 1] >= arr[arr.length - 2]) {
			sell = arr[arr.length - 1];
			profit += (sell - buy);
		}

		// System.out.println("buy" + buy + " sell " + sell);

		return profit;

		/*-----alternate method-----------*/
//		  if(prices.length==1 || prices==null){
//			   return 0;
//		   }
//	   
//		 for(int i=1;i<prices.length;i++){
//			 if(prices[i-1]<prices[i]){
//				 profit+=prices[i]-prices[i-1];
//			 }
//		 }
//
//		return profit;
	}

}
