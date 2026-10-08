package com.madhav.testapi.controllers;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int x;
     Scanner sc =new Scanner(System.in);
     System.out.println("ENTER THE INPUT");
     x=sc.nextInt();
     System.out.println("ENTER THE FIRST NUMBER");
     int a=sc.nextInt();
     System.out.println("ENTER THE SECOND NUMBER");
     int b=sc.nextInt();
     
     switch (x) {
	case 1: 
		System.out.println("sum:"+ (a+b));
		break;
	case 2:
		System.out.println("difference :"+ (a-b));
		break;
	case 3:
		System.out.println("multiplication:"+ (a*b));
		break;
	case 4:
		System.out.println("devide:"+ (a/b));
		break;
	default:
		System.out.println("invalid input");
		
		}

}
}
