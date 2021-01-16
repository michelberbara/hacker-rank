package jumpingOnTheClouds;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JumpingOnTheClouds {

	static int jumpingOnClouds(int[] c) {
		int steps = 0;
		System.out.println(c.length);
		for (int i = 0; i < c.length - 1; i++) {
			int number = c[i];
			if (number == 0)
				i++;
			steps++;
		}
		return steps;
	}

	public static void main(String[] args) throws IOException {
		int[] path = { 0, 1, 0, 0, 0, 1, 0 };
		int[] path2 = { 0, 0, 1, 0, 0, 1, 0 };
		int[] path3 = { 0, 0, 0, 0, 1, 0 };
		int[] path4 = { 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0 };
		int[] path5 = { 0, 1, 1, 1, 1, 0 };
		int[] path6 = { 0, 0, 0, 1, 0, 0 };
		// jumpingOnClouds(path);
		System.out.println();
		System.out.println(jumpingOnClouds(path));
	}
}
