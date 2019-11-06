package com.codility.lesson_4_counting_elements;

public class MaxCounters {
	public int[] solution(int N, int[] A) {
		int[] B = new int[N];
		int prevMax = 0;
		int max = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] > N) {
				prevMax = max;
			} else {
				if (B[A[i] - 1] < prevMax) {
					B[A[i] - 1] = prevMax;
				}
				B[A[i] - 1]++;
				if (B[A[i] - 1] > max) {
					max = B[A[i] - 1];
				}
			}
		}

		for (int i = 0; i < B.length; i++) {
			if (B[i] < prevMax && B[i] < N) {
				B[i] = prevMax;
			}
		}

		return B;
	}
}

