package com.LinkedListQuestions;

public class CreateLinkList {

	private Node node=null;
	private Node head=null;
	
	class Node{
	      private Node next;
	      private int data ;
	      
	      Node(int data ){
	    	  this.data = data ;
	      }
	}	
	public  void insertNode(int data){
		if(node==null){
			node = new Node(data);
            node.next=null;
            head=node;
		}
		else{
			Node node = new Node(data);
			node.next=null;
            head.next=node;
			head=node;
		}
	}

	@Override
	public String toString() {
		StringBuffer linkList = new StringBuffer("LIST : "); 
		if(node==null){
			return "Empty Linked List";
		}
		else{
		//linkList.append(node.next.next.data);
		int count = 1;
			while(node!=null){
				linkList.append( +node.data + " " );
				node=node.next;
			}
		}
		return linkList.toString();
	}

	
	public void leftShift(int n){
		Node head = node; 
		Node tail = this.head;
		while (n > 0){
		Node shiftedNode = head.next; 
		tail.next=head;
		head.next=null;
		node=shiftedNode;
		tail =  head;
		head=shiftedNode;
		
		n--;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreateLinkList obj = new CreateLinkList();
		obj.insertNode(1);
		obj.insertNode(2);
		obj.insertNode(3);
		obj.insertNode(4);
		obj.insertNode(5);
		
		obj.insertNode(1);
		obj.insertNode(2);
		obj.insertNode(3);
		obj.insertNode(4);
		obj.insertNode(5);
		
		//left shift operation 
		
		obj.leftShift(9);

		//rght shift operation
		System.out.println(obj);
		
		
	}

}
