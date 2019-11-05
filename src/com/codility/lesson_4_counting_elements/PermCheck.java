package com.codility.lesson_4_counting_elements;

public class PermCheck {
	public static int solution (int[] A) {
		int len = A.length;

		// check if any element is bigger than number of elements
		for (int i : A) {
			if (i > len) {
				return 0;
			}
		}

		// check all elements one by one
		int[] B = new int[len + 1];
		for (int i : A) {
			B[i] = i;
		}
		for (int i = 1; i <= len; i++) {
			if (B[i] == 0) {
				return 0;
			}
		}

		return 1;
	}
}
