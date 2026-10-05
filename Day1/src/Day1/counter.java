package Day1;

import java.util.Scanner;

public class counter {

	public static void main(String[] args) {
		Scanner obj  =new Scanner(System.in);
String str=obj.nextLine();
int count=0;
for (int i = 0; i <str.length()-1; i++) {

	

if(str.charAt(i)==' '&& str.charAt(i+1)!=' ') {
	count++;}}

System.out.print(str.charAt(0)==' '?count:count+1);
	
}


		
		// TODO Auto-generated method stub

	}

