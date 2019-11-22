package com.codility.lesson_4_counting_elements;

public class MissingInteger {
	public int solution (int[] A) {
		int N = A.length;
		boolean[] B = new boolean[N + 1];

		for (int i : A) {
			if (i > 0 && i <= N) {
				B[i - 1] = true;
			}
		}

		for (int i = 0; i < N; i++) {
			if (!B[i]) {
				return i + 1;
			}
		}

		return N + 1;
	}
}
