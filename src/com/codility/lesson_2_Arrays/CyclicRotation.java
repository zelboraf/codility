package com.codility.lesson_2_Arrays;

public class CyclicRotation {
	public static int[] solution(int[] A, int K) {
		int lng = A.length;
		int tmp;

		if (lng <= 1 || K == 0 || K % lng == 0) {
			return A;
		}

		do {
			tmp = A[lng - 1];
			for (int i = lng - 1; i > 0; i--) {
				A[i] = A[i - 1];
			}
			A[0] = tmp;
			K--;
		} while (K > 0);

		return A;
	}
}
