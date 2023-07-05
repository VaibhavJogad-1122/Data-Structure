package com.app;

public class LinkedList {

	private Node head;
	
	public LinkedList()
	{
		this.head = null;
	}
	
	public boolean insert(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			return true;
		}
		Node last = head;
		while(last.getNext() != null)
		{
			last = last.getNext();
		}
		last.setNext(newNode);
		return true;
	}

	public void display() {
		// TODO Auto-generated method stub
		Node last = head;
		while(last != null)
		{
			System.out.print(last.getData()+" ");
			last = last.getNext();
		}
		System.out.println();
	}
}
