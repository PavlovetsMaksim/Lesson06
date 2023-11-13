package edu.training.lesson06.main;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		int[] array = new int[3];

		int countZero = 0;

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.print("ar[" + i + "] => ");
			array[i] = sc.nextInt();
			if (array[i] == 0) {
				countZero++;
			}
		}

		int[] newArray = new int[countZero];
		for (int j = 0, k = 0; j < array.length; j++) {
			if (array[j] == 0) {
				newArray[k] = j;
				k++;
			}
		}

		System.out.println("Новый массив:");

		for (int t = 0; t < newArray.length; t++) {
			System.out.println("ar[" + t + "] = " + newArray[t]);
		}

	}

}
