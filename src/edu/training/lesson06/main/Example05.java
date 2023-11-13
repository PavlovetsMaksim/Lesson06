package edu.training.lesson06.main;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		int[] array = new int[10];
        
        int countEven = 0;

        Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.print("ar[" + i + "] => ");
			array[i] = sc.nextInt();
			if (array[i] % 2 == 0) {
				countEven++;
            }
		}

		int[] newArray = new int[countEven];
        for (int j = 0, k = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                newArray[k] = array[j];
                k++;
            }
        }

        if (countEven > 0) {
        	for (int t = 0; t < newArray.length; t++) {
                System.out.println("ar[" + t + "] = " + newArray[t]);
            }
        } else {
            System.out.println("Последовательность не содержит четных чисел");
        }

	}

}
