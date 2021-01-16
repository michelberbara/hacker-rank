package SalesByMath;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesByMatch {

	public static int salesByMatch(int n, int[] array) {
		int matchedPairs = 0;
		Arrays.sort(array);
		for (int i = 0; i < n; i++) {
			if (i + 1 < n) {
				if (array[i] - array[i + 1] == 0) {
					i++;
					matchedPairs++;
				}
			}
		}
		return matchedPairs;
	}

	public static void main(String[] args) throws IOException {
		int[] numbersArray = { 10, 20, 20, 10, 10, 30, 50, 10, 20,20,100,30 };

		int numberOfPairs = salesByMatch(numbersArray.length, numbersArray);
		System.out.println("numberOfPairs: " + numberOfPairs);
	}

}
