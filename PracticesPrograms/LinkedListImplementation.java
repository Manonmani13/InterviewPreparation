package com.test;

import java.util.LinkedList;

public class LinkedListImplementation {
	Node head;
	public LinkedListImplementation()
	{
		head=null;
	
	}
	public void append(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		Node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=newNode;
	}
	public void prepend(int data)
	{
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
	}
	public void deleteNode(int key)
	{
		if(head==null)return;
		if(head.data==key)
		{
			head=head.next;
			return;
		}
		Node current=head;
		while(current.next!=null && current.next.data!=key)
		{
			current=current.next;
			
		}
		if(current.next!=null)
		{
			current.next=current.next.next;
		}
		
	}
	public void printList()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.println(current.data +" ");
			current=current.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		LinkedListImplementation list = new LinkedListImplementation();

	        // Add nodes to the list
	        list.append(10);
	        list.append(20);
	        list.append(30);

	        System.out.print("List: ");
	        list.printList();
	        // Add a node at the begin]ning
	        list.prepend(5);
	        System.out.print("List after prepending 5: ");
	        list.printList(); 
	        // Remove a node
	        list.deleteNode(20);
	        System.out.print("List after deleting 20: ");
	        list.printList(); 
	}
}
