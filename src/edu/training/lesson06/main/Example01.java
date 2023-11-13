package edu.training.lesson06.main;

import java.util.Random;

public class Example01 {

	public static void main(String[] args) {
		int k = 2;
		int[] a = new int[10];
		int sum = 0;

		Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100);
        }

		for (int j = 0; j < a.length; j++) {
			if (a[j] % k == 0) {
				sum += a[j];
			}
		}
		
		for (int t = 0; t < a.length; t++) {
            System.out.println("ar[" + t + "] = " + a[t]);
        }
		
		System.out.println();

		System.out.println("Сумма элементов, которые кратны k равна " + sum);

	}

}
