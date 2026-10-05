package Day1;



public class Linked {
	
	Node head;
	private int size;
	Linked(){
		this.size=0;
	}
	public int getsize() {
		return size;
	}
	class Node{
		String data;
		Node next;
		Node(String data){
			this.data=data;
			this.next=null;
		}
		
	}
  void addFirst(String data) {
	 Node newNode=new Node(data);
	 if(head==null) {
		 head=newNode;
		 return;
		 
	 }
	 newNode.next=head;
	 head=newNode;
		
	}
  void addLast(String data) {
	  Node newNode=new Node(data);
		 if(head==null) {
			 head=newNode;
			 return;
			 
		 }
		 Node cur=head;
		 while(cur.next!=null) {
			 cur=cur.next;
		 }
	  cur.next=newNode;
  }
  void printlist() {
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

  void deleteFirst() {
	  if(head==null) {
		  System.out.print("Empty");
		  return;
	  }
	  head=head.next;
  }
  void deleteLast() {
	  if(head.next==null) {
		  head=null;
		  return;
	  }
	  Node cur=head;
	  Node last=head.next;
	  while(last.next!=null) {
		  cur=cur.next;
		  last=last.next;
	  }
	  cur.next=null;
  }
  
	public static void main(String[] args) {
		Linked obj=new Linked();
		obj.addFirst("a");
		obj.addFirst("b");
		//obj.printlist();
		obj.addLast("c");
		obj.printlist();
		obj.deleteFirst();
		obj.printlist();
		obj.deleteLast();
		obj.printlist();
		
		// TODO Auto-generated method stub

	}

}
