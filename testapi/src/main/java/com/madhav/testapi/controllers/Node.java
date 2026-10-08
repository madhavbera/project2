package com.madhav.testapi.controllers;

public class Node {
	int data;
	Node next;
	
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}

	public static void main(String[] args) {
	Node first=new Node(10);
	Node second =new Node(20);
	Node third =new Node(30);
	first.next=second;
	second.next=third;
	third.next=null;
	Node content=first;
	int count=0;
	int sum=0;
	while(content!=null)
	{
		System.out.println(content.data);
		sum=sum+content.data;
		count=count+1;
		content=content.next;
	}
	int mean=sum/count;
	System.out.println("null");
	System.out.println("Number of node exist:"+count);
	System.out.println("Mean:"+mean);
	
	}

}
