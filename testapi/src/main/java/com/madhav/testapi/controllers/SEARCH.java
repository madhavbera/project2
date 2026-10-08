package com.madhav.testapi.controllers;

//import java.util.Iterator;
import java.util.Scanner;

public class SEARCH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[4];
		int c=0;
		Scanner sc= new Scanner(System.in);
//		int n;
		System.out.println("ENETR THE four ELEMENT IN AN ARRAY");
		for (int i = 0; i < a.length; i++) {
			 a[i]=sc.nextInt();
		}
		System.out.println("ENTER THE SEARCH ELEMENTFROM THE ARRAY");
		int search=sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			if(a[i]==search)
			{
				System.out.println("element exist at index :"+(i+1)); 
				c=1;
				break;
			}
		} 
		if(c==0)
			{
			System.out.println("not exist");
			}
			}

}
