package Day1;

import java.util.Stack;

public class collect {
	static void pushAt(Stack<Integer>obj,int data) {
		if(obj.isEmpty()) {
			obj.push(data);
			return;
		}
		int top=obj.pop();
		pushAt(obj,data);
		obj.push(top);
	}
	static void rev(Stack<Integer>obj) {
		if(obj.isEmpty()) {
			return;
		}
		int top=obj.pop();
		rev(obj);
		pushAt(obj,top);
	}

	public static void main(String[] args) {
		Stack<Integer>obj=new Stack<>();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
	//pushAt(obj,50);
		System.out.println(obj);

		rev(obj);
		System.out.println(obj);
		
		
		
				//for(int x:obj) {
		//System.out.println(obj);
		// TODO Auto-generated method stub
		
	}

}
