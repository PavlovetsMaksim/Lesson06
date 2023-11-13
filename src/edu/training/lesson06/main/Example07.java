package edu.training.lesson06.main;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		double[] arr = new double[10];
        double num = 5.5;
        
        int count = 0;

        System.out.println("Z = " + num);
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("ar[" + i + "] => ");
            arr[i] = sc.nextDouble();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
            	arr[i] = num;
                count++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("ar[" + i + "] = " + arr[i]);
        }
        
        System.out.println("Количество замен: " + count);
        System.out.println();

	}

}
