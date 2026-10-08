package com.madhav.testapi.controllers;

public class MissingNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,5,9,10,11,12};
		int k=5;
	    int MissingNumber=0;
	    int count=1;
	    int i=0;
	    while(MissingNumber<k) {
	    	if(i<a.length && a[i]==count) {
	    		i++;
	    		
	    	}
	    	else{
	    		k--;
	    		if(k==0)
	    		{
	    			System.out.println(count);
	    		}
	    	}
	    	count++;
	    }
		}

	}


