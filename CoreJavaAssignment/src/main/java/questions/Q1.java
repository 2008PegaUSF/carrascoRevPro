package questions;

public class Q1 {
	/* Q1. Perform a bubble sort on the following integer array: 
	1,0,5,6,3,2,3,7,9,8,4 */
		public void bubbleSort(int arr[]) {
			int i,j;
			int temp = 0;
			for(i=0; i<arr.length - 1; i++) {
				for (j= 0; j < arr.length - 1 - i; j++) {
					if (arr[j]> arr[j + 1]) {
						temp = arr[j];
						arr[j] = arr[j+1];
						arr[j + 1] = temp;
					}
				}
			}
			
		} //Used to print bubbleSort array
		public void printArray(int arr[]) {
			int n = arr.length;
			for (int i = 0; i < n; ++i) {
				System.out.print(arr[i] + " ");
			} System.out.println();
		}
		
}
