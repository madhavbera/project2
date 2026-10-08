package com.madhav.testapi.controllers;

public class SeletionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,2,9,1};
		System.out.println("DISPLAY THE SORTED ARRAY");
		for(int i=0;i<a.length;i++)
		{
			int mid=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[mid]) {
					mid=j;
				
//				 another logic
//				 int temp=a[i];
//				 a[i] =a[j];
//				 a[j]=temp;
				}
			}
			int temp=a[i];
			a[i]=a[mid];
			a[mid]=temp;
		}
		for(int n:a)
		{
			System.out.print(n+" ");
		}

	}

}
