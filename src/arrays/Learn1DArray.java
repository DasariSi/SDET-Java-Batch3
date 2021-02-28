package arrays;

public class Learn1DArray {

	public static void main(String[] args) {

		/**
		 * Array Declaration and Initialisation
		 */
		int arr[] = { 1, 2, 3, 4, 5 };

		int ln = arr.length;
		System.out.println("Length of array is " + ln);

		/**
		 * Accessing through index
		 */
		System.out.println(arr[2]);

		for (int i = 0; i < arr.length; i++)
			System.out.println("Index:" + i + " Value:" + arr[i]);

		int arr2[] = new int[5];
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		arr2[3] = 40;
		arr2[4] = 50;
		// arr2[5] = 60;

		System.out.println("Length of Array2:" + arr2.length);

		for (int i : arr2) {
			System.out.println(i);
		}
		
		int arr3[] = { 15, 1, 8, 91, 105, 156, 100, 187, 253, 92, 82 };
		int max = arr3[0];//assume first no is max

		for (int i = 1; i < arr3.length; i++) { //run loop from 1 to length-1
			if (arr3[i] > max)        //compare if next element is larger
				max = arr3[i];        //swap if yes else go for next iteration

		}
		System.out.println("Largest no:" + max);

		
		/**
		 * Summation and Average
		 */
		int tot=0;
		for(int i=0;i<arr3.length;i++)
			tot+=arr3[i];
		
		System.out.println("Total:"+tot);
		System.out.println("Average:"+tot/arr3.length);
		
		
	}

}
