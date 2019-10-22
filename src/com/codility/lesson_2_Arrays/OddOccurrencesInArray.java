package com.codility.lesson_2_Arrays;

public class OddOccurrencesInArray {
	public static int solution(int[] A) {
		int s = 0;
		for (int i = 0; i < A.length; i++) {
			s ^= A[i];
		}

		return s;
	}
}
