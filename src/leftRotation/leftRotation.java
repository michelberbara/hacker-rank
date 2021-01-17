package leftRotation;

import java.io.IOException;

public class leftRotation {

	static int[] rotLeft(int[] a, int d) {

		for (int i = 0; i < d; i++) {
			int j, first;
			first = a[0];
			for (j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[j] = first;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		return a;

	}

	public static void main(String[] args) throws IOException {

		int[] array = { 1, 2, 3, 4, 5 };

		rotLeft(array, 4);

	}
}
