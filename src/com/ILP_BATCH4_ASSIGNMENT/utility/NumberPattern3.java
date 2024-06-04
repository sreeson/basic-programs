package com.ILP_BATCH4_ASSIGNMENT.utility;

import java.util.Scanner;

public class NumberPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1-3+5-7....n
		Scanner s=new Scanner(System.in);
		System.out.println("enter the limit");
		int n=s.nextInt();
		int sum=0;
		int flag=0;
		for(int i=0;i<=n;i++) {
			if(i%2==1) {
				if(flag==0) {
					sum=sum+i;
					flag=1;
				}
				else {
					sum=sum-i;
					flag=0;
				}
				
			}
			
		}
		System.out.println("Result :"+sum);

	}

}
