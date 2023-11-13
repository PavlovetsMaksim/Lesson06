package edu.training.lesson06.main;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		double[] array = new double[5];
		boolean flag = true;

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.print("ar[" + i + "] => ");
			array[i] = sc.nextDouble();
		}

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				flag = false;
				break;
			}
		}

		if (flag == false) {
			System.out.println("Последовательность не возрастающая");
		} else {
			System.out.println("Последовательность возрастающая");
		}

	}

}
