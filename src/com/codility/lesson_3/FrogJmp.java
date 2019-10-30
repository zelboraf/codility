package com.codility.lesson_3;

public class FrogJmp {
	public static int Solution (int X, int Y, int D) {
		return (int)Math.ceil((Y - X) / (double)D);
	}
}
