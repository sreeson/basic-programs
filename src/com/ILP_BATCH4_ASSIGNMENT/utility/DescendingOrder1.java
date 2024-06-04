package com.ILP_BATCH4_ASSIGNMENT.utility;

import java.util.Scanner;

public class DescendingOrder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number =");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		System.out.println("Decending order ");
		if(a>b) {
			if(a>c) {
				System.out.println(a);
				if(b>c) {
					System.out.println(b);
					System.out.println(c);
				}
				else {
					System.out.println(c);
					System.out.println(b);
				}
			}
			else {
				System.out.println(c);
				System.out.println(a);
				System.out.println(b);
				
			}
		}
		else {
			if(b>c) {
				System.out.println(b);
				if(a>c) {
				System.out.println(a);
				System.out.println(c);
				}
				else {
					System.out.println(a);
					System.out.println(c);
				}
			}
			else {
				System.out.println(c);
				System.out.println(b);
				System.out.println(a);
			}
			
		}
		
		
		
	}

}
