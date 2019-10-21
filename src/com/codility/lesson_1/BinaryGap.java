package com.codility.lesson_1;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {
	public static int solution (int N) {
		// convert dec to bin
		List<Integer> binary = new ArrayList<>();
		while (N > 0) {
			if (N % 2 == 0) {
				binary.add(0);
			} else {
				binary.add(1);
			}
			N /= 2;
		}

		// seek largest gap
		int maxGap = 0;
		int currGap;
		int ptr = 0;
		while (ptr < binary.size() - 1) {
			if (binary.get(ptr) == 1) {
				currGap = 0;
				ptr++;
				while (binary.get(ptr) == 0) {
					currGap++;
					ptr++;
				}
				if (currGap > maxGap) {
					maxGap = currGap;
				}
			}
		}

		return maxGap;
	}
}
