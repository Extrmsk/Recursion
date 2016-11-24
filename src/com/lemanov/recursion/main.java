package com.lemanov.recursion;

// Towers of Hanoi example

public class main {
	
	private static int stepCount;

	public static void main(String[] args) {
		stepCount = 0;
		hanoi(3,1,3);
	}
	
	public static void hanoi(int diskCount, int from, int to) {
		if (diskCount == 1) {
			move(from, to);
		} else {
			hanoi(diskCount - 1, from, getFree(from, to));
			move(from, to);
			hanoi(diskCount - 1, getFree(from, to), to);
		}
	}
	
	public static int getFree(int from, int to) {
		return (6 - from - to);
	}
	
	public static void move(int from, int to) {
		stepCount++;
		System.out.println("Step=" + stepCount + "   Move: " + from + " ---> " + to);
	}

}
