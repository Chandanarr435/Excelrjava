package Day1;

import java.util.Scanner;

public class counter {

	public static void main(String[] args) {
		Scanner obj  =new Scanner(System.in);
String str=obj.nextLine();
String arr[]=str.split(" ");
String x=obj.next();
int count=0;
for (int i = 0; i <arr.length; i++) {

	

if(arr[i].equals(x)) {
	count++;}}

System.out.print(count);
	
}


		
		// TODO Auto-generated method stub

	}

