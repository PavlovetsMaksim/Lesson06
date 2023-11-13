package edu.training.lesson06.main;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		int[] array = new int[5];
		int flagNeg = 0;

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.print("ar[" + i + "] => ");
			array[i] = sc.nextInt();
		}

		if (array[0] < 0) {
			flagNeg++;
		}

		if (flagNeg > 0) {
			System.out.println("Отрицательное число встречается раньше. ");
		} else {
			System.out.println("Положительное число встречается раньше. ");
		}

	}

}
