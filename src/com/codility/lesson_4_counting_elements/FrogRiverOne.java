package com.codility.lesson_4_counting_elements;

public class FrogRiverOne {
	public int solution(int X, int[] A) {
		boolean[] B = new boolean[X + 1];
		int count = 0;

		for (int i = 0; i < A.length; i++) {
			if (!B[A[i]]) {
				B[A[i]] = true;
				count++;
				if (count == X) {
					return i;
				}
			}
		}

		return -1;
	}
}
