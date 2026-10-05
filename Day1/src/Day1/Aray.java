package Day1;

import java.util.ArrayList;

public class Aray {
ArrayList<Integer>obj	=new ArrayList<>();
void push(int data) {
obj.add(data);
}
int pop() {
	if(isEmpty()) {
		System.out.println("underflow");
		return -1;
	}
	int top=obj.get(obj.size()-1);
	obj.remove(obj.size()-1);
	return top;
}
int peek() {
	if(isEmpty()) {
		System.out.println("underflow");
		return -1;
	}
	return obj.get(obj.size()-1);
}

	 boolean isEmpty() {
	// TODO Auto-generated method stub
	return obj.size()==0;}
	void display() {
		if(isEmpty()) {
			System.out.println("Empty");
			return;
		}
		for(int i=obj.size()-1;i>=0;i--) {
			System.out.println(obj.get(i));
		}}
		//System.out.println();}
	

	public static void main(String[] args) {
		Aray obj1=new Aray();
		obj1.push(10);
		obj1.push(20);
		obj1.push(30);
		obj1.push(40);
		obj1.display();
		obj1.peek();
		obj1.pop();
		obj1.display();
		//while(!obj.)
		// TODO Auto-generated method stub

	}

}
