package Day1;

import java.util.Scanner;

public class Inv {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String obj1=obj.nextLine();
		String arr[]=obj1.split(" ");
		int count=0;
		for(String x:arr) {
			try {
				int n=Integer.parseInt(x);
				 count++;
			}
				catch (NumberFormatException ex) {
				}
			
				}
			
			System.out.println(count);
		// TODO Auto-generated method stub

	}
		}
		
		// TODO Auto-generated method stub

	


