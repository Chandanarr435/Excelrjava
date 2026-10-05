package Day1;

import Day1.Linked.Node;

public class Stack1 {
	Node head;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}}void push(int data){
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
		
	}
	void pop() {
		if(head==null) {
			System.out.println("underflow");
			return;
		}
		System.out.println(head.data);
		head=head.next;
	}
	void peek() {
		if(head==null) {
			System.out.println("underflow");
			return;
		}
		System.out.println(head.data);
	}
	boolean  isEmpty() {
		return head==null;
	}
	void display() {
		 if(head==null) {
			  System.out.println("Empty");
		  }
		  Node cur=head;
		  while(cur!=null) {
			 System.out.print(cur.data+"->");
			 cur=cur.next;
		  }
		  System.out.print("NULL");
	  }
	

	public static void main(String[] args) {
		Stack1 obj=new Stack1();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		//obj.display();
		obj.pop();
		obj.display();
		obj.peek();
		
		// TODO Auto-generated method stub

	}

}
