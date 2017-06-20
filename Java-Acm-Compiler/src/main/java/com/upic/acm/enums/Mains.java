package com.upic.acm.enums;

import java.util.Scanner;

public class Mains {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[] = new int[6];
		for (int i = 0; i < 6; i++) {
			a[i] = s.nextInt() + 1;
		}
		for (int j = 0; j < 6; j++) {
			System.out.println(a[j]);
		}
	}
}
