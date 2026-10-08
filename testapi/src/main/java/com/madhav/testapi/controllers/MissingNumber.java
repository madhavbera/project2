package com.madhav.testapi.controllers;
class Find{
	public static int  FindNumber(int a[],int k) {
		int MissingNumber=0;
		int count=1;
		int i=0;
		while(MissingNumber<k) {
			if(i<a.length && a[i]==count)
			{
				i++;//element exist
				
			}
			else {
				MissingNumber++;//element missing
				
			
			if(MissingNumber==k) {
				return count;
			}
			}
			count++;
		}
		return -1;
	}
}
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {1,2,3};
     int k=2;
     System.out.println(Find.FindNumber(a,k));
	}

}
