package edu.training.lesson06.main;

import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {        
        int[] arr = new int[10];

        Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.print("ar[" + i + "] => ");
			arr[i] = sc.nextInt();
		}

        System.out.println("Числа, для которых а[i] > i: ");
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                System.out.println("ar[" + i + "] = " + arr[i]);
            }
        }
	}

}
