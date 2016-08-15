package com.tiy.prime;

import java.util.Scanner;

public class PrimeNumber {
	
	   public static void main(String[] args) {
	        System.out.print("Enter a positive number: ");
	        Scanner scanner = new Scanner (System.in);
	        printFactors(scanner.nextInt());
	    }
	    public static void printFactors(int product) {
	        for (int factor = 2; factor <= product; factor++) {
	            int exponent = 0;
	            while (product % factor == 0) {
	                product /= factor;
	                exponent++;
	            }
	            if (exponent > 0) {
	                System.out.println(factor+ "**" + exponent);
	            }
	        }
	    }
	}