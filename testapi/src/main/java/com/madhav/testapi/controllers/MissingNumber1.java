package com.madhav.testapi.controllers;
class FindKthnumber{
	public static int FindNumber(int a[],int k)
	{
		int MissingNumber=0;
		int count=1;
		int i=0;
		while(MissingNumber<k) {
			if(i<a.length && a[i]==count) {
				i++;
				
			}
			else {
				k--;
				if(k==0)
					return count;
				}
			count++;
		}
	return -1;
		
	}
}
public class MissingNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {2,3,4,7,11};
      int k=5;
   System.out.println(FindKthnumber.FindNumber(a,k));
      
      
	}

}
