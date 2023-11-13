package edu.training.lesson06.main;

import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {		
        int[] arr = new int[10];
        
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("ar[" + i + "] => ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] == 0) {
                zeroCount++;
            } else {
                negativeCount++;
            }
        }

        System.out.println("В массиве " + positiveCount + " положительных, " + negativeCount + " отрицательных и " + zeroCount + " нулевых элементов");

	}

}
