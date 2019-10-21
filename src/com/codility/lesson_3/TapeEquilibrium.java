package com.codility.lesson_3;

public class TapeEquilibrium {

	public static int solution(int[] A) {
		int arrLength = A.length - 1;
		int minimum;
		int currMinimum;
		int[] rightSubSums = new int[arrLength];
		int[] leftSubSums = new int[arrLength];

		// create arrays with subSums
		leftSubSums[0] = A[0];
		for (int i = 1; i < arrLength; i++) {
			leftSubSums[i] = leftSubSums[i - 1] + A[i];
		}
		rightSubSums[arrLength - 1] = A[arrLength];
		for (int i = arrLength - 2; i >= 0; i--) {
			rightSubSums[i] = rightSubSums[i + 1] + A[i + 1];
		}

		// calculate diff
		minimum = Math.abs(leftSubSums[0] - rightSubSums[0]);
		for (int i = 1; i < arrLength; i++) {
			currMinimum = Math.abs(leftSubSums[i] - rightSubSums[i]);
			if (currMinimum < minimum) {
				minimum = currMinimum;
			}
		}

		return minimum;
	}
}
