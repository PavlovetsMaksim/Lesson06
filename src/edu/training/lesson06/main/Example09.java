package edu.training.lesson06.main;

import java.util.Scanner;

public class Example09 {

	public static void main(String[] args) {
		int[] arr = new int[10];

		int minIndex = 0;
		int maxIndex = 0;

		int min;
		int max;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.print("ar[" + i + "] => ");
			arr[i] = sc.nextInt();
		}

		min = arr[0];
		max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				minIndex = i;
			} else if (arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}
		}

		int temp = arr[minIndex];
		arr[minIndex] = arr[maxIndex];
		arr[maxIndex] = temp;

		for (int i = 0; i < arr.length; i++) {
            System.out.println("ar[" + i + "] = " + arr[i]);
        }

	}

}
