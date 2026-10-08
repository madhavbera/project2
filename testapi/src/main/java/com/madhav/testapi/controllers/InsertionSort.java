package com.madhav.testapi.controllers;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,9,1,4};
		System.out.println("DISPLAY THE SORTED ARRAY");
		for (int i = 1; i < a.length; i++) {
			int temp=a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
			
		}
		for(int n:a)
		{
			System.out.print(n+" ");
		}

	}

}
