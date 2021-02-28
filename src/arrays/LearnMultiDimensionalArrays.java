package arrays;

public class LearnMultiDimensionalArrays {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		int rows = arr.length;
		System.out.println("Rows:" + rows);

		int cols = arr[0].length;
		System.out.println("Cols:" + cols);

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		int[][] arr1 = { { 1, 2, 3, 4 }, { 5, 6, 7 }, { 8, 9 } };

		rows = arr1.length;

		for (int i = 0; i < rows; i++) {
			int col = arr1[i].length;
			for (int j = 0; j < col; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

	}

}
