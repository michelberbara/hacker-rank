package twoDArrayDs;

import java.io.IOException;

public class TwoDArrayDs {

	static int hourglassSum(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

		int sum = Integer.MIN_VALUE;
		for (int i = 0; i <= arr.length / 2; i++) {
			for (int j = 0; j <= arr[i].length / 2; j++) {
				int top = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
				int middle = arr[i + 1][j + 1];
				int bottom = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
				
				int currentSum = top + middle + bottom;
				sum = Math.max(sum, currentSum);
			}
		}
		return sum;
	}

	public static void main(String[] args) throws IOException {
		int[][] table = new int[6][6];
		table[0][0] = 1;
		table[0][1] = 1;
		table[0][2] = 1;
		table[0][3] = 0;
		table[0][4] = 0;
		table[0][5] = 0;

		table[1][0] = 0;
		table[1][1] = 1;
		table[1][2] = 0;
		table[1][3] = 0;
		table[1][4] = 0;
		table[1][5] = 0;

		table[2][0] = 1;
		table[2][1] = 1;
		table[2][2] = 1;
		table[2][3] = 0;
		table[2][4] = 0;
		table[2][5] = 0;

		table[3][0] = 0;
		table[3][1] = 0;
		table[3][2] = 2;
		table[3][3] = 4;
		table[3][4] = 4;
		table[3][5] = 0;

		table[4][0] = 0;
		table[4][1] = 0;
		table[4][2] = 0;
		table[4][3] = 2;
		table[4][4] = 0;
		table[4][5] = 0;

		table[5][0] = 0;
		table[5][1] = 0;
		table[5][2] = 1;
		table[5][3] = 2;
		table[5][4] = 4;
		table[5][5] = 0;

		hourglassSum(table);

	}
}
