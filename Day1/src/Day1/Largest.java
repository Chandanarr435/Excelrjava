package Day1;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int row=obj.nextInt();
		int col=obj.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=obj.nextInt();
			}
		}
		int max=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
					
				}}}
				System.out.println(max);
			
		
		
		// TODO Auto-generated method stub

	}

}
