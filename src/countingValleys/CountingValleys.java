package countingValleys;

import java.io.IOException;

public class CountingValleys {

	public static int countingValleys(int steps, String path) {
		// Write your code here
		int valleyCount = 0;
		int preStep = 0;
		int postStep = 0;
		for (int i = 0; i < steps; i++) {
			preStep = postStep;
			char pathStepChar = path.charAt(i);
			String pathStepString = Character.toString(pathStepChar);
			if (pathStepString.equals("D")) {
				postStep--;
			} else {
				postStep++;
			}

			if ((preStep < 0 && postStep >= 0) || ((postStep < 0) && i == steps - 1)) {
				valleyCount++;
			}

		}

		return valleyCount;
	}

	public static void main(String[] args) throws IOException {
		String stepsTaken = "UDDDUDUUUUDDDDUUDUDUD";
		int stepsCount = stepsTaken.length();

		System.out.println(countingValleys(stepsCount, stepsTaken));
	}
}
