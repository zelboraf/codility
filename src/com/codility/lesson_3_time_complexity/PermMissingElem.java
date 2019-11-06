package com.codility.lesson_3_time_complexity;

public class PermMissingElem {
	public static int Solution (int[] A) {
		int[] B = new int[A.length + 2];

		for (int i : A) {
			B[i] = i;
		}
		for (int i = 1; i < B.length; i++) {
			if (B[i] == 0) {
				return i;
			}

		}

		return -1;
	}
}
