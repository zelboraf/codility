package com.codility.lesson_4_counting_elements;

import java.util.ArrayList;
import java.util.List;

public class FrogRiverOne {
	public class Leaf {
		public int time;
		public int position;

		public Leaf(int time, int position) {
			this.time = time;
			this.position = position;
		}
	}

	public int solution(int X, int[] A) {
		List<Leaf> Leafs = new ArrayList<>();

		for (int i = 0; i < A.length; i++) {
			if (Leafs.isEmpty()) {
				Leafs.add(new Leaf(i, A[i]));
			}
		}

		return -1;
	}
}
