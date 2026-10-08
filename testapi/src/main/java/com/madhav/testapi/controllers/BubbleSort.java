package com.madhav.testapi.controllers;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,1,9,5};
		System.out.println("DISPLAY THE SORTED ARRAY");
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			
			
		}
		for (int i : a) {
			System.out.print(i+" ");
		}

	}

}
