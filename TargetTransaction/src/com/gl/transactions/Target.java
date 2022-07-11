package com.gl.transactions;

import java.util.Scanner;

public class Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the transaction count");
 int size = sc.nextInt();
 int arr[] = new int[size];
 System.out.println("enter the value ");
 
 for(int i=0; i<size; i++) {
	 
	 arr[i] = sc.nextInt();
 }
 System.out.println("enter the target value");
 int targetNo = sc.nextInt();
 
 while(targetNo--!=0) {
	 
	 int flag = 0;
	 long target;
	 System.out.println("enter a total target value");
	 target = sc.nextInt(); 
	 
	 long sum = 0;
	 for(int i=0; i<size; i++) {
		sum += arr[i];
		
		if(sum>=target) {
			
			System.out.println("Target reached");
			flag = 1;
			break;
		}
		 
	 }
	 
	 if(flag == 0) {
		 
		 System.out.println("Target not reached");
	 }
	 
 }
 
 
	}

}
