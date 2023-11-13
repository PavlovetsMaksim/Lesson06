package edu.training.lesson06.main;

import java.util.Random;

public class Example06 {

	public static void main(String[] args) {        
        int[] arr = new int[10];
        
        int max;
        int min;
        int len;
        
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        
        max = arr[0];
        min = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] > max) {
        		max = arr[i];
        	}
        	if (arr[i] < min) {
        		min = arr[i];
        	}
        }
        
        len = max - min;
        
        System.out.println("Наименьшая длина числовой оси = " + len);

	}

}
