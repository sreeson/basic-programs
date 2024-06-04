package com.ILP_BATCH4_ASSIGNMENT.utility;

import java.util.Scanner;

public class series5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("enter the limit");
		int n = s.nextInt();

		long sum = 0;

		for (int i = 0; i < n; i++) {
			int num = 2 * i + 1;
			int exp = i + 1;
			long val = (long) Math.pow(num, exp);

			if (i % 2 == 1) {
				val = -val;
			}

			sum += val;
		}

		System.out.println("The sum is: " + sum);

//			if(i%2==1) {
//				if(flag==0) {
//					sum=sum+Math.pow(i, i);
//					flag=1;
//					
//				}
//				else {
//					sum=sum-(Math.pow(i, i));
//					flag=0;
//				}
//				
//			}

	}

}
