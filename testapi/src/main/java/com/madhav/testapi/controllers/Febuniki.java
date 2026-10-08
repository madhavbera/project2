package com.madhav.testapi.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Febuniki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int n=sc.nextInt();
//   int a[]= {0,1};
		List<Integer> list=new ArrayList<Integer>();
		list.add(0);
		list.add(1);
   for(int i=2;i<n;i++)
   {
//	 list[i]=list[i  
	   int next=list.get(i-1)+list.get(i-2);
	   list.add(next);
	   
   }
   System.out.println("fabunici:"+list);
	}

}
