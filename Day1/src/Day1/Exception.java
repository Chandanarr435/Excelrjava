package Day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		try {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int arr[]=new int[n];
	
		for(int i=0;i<arr.length;i++) {
			arr[i]=obj.nextInt();
		}
	
			int res=arr[1]/arr[0];
			try {
				int a=obj.nextInt();
				int b=obj.nextInt();
				int res1=arr[a]/arr[b];
				
				
			}
			catch(ArithmeticException ex) {
				System.out.println("enter valid number");
			}
			catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println("enter no in given range");
			}

			
		}
		catch(InputMismatchException ex) {
			System.out.println("yes2");
		}

		// TODO Auto-generated method stub

	}

}
