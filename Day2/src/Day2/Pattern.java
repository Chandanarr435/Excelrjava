
package Day2;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter");
		int n=obj.nextInt();
		
		//int p=1;

		for(int i=1;i<=n;i++) {
			
			
			//for(int j=1;j<n-1;j++) {
				//System.out.print(" ");
			//}

			for(int j=1;j<=i;j++) {
				if(j==1||j==i) {
				System.out.print("*");
			}
				else 
					System.out.print(" ");}
			
			for(int j=i;j<n;j++) {

					System.out.print(" ");}
			for(int j=i;j<=n;j++) {

				System.out.print(" ");}
			for(int j=1;j<=i;j++) {
				if(j==1||j==i) {
				System.out.print("*");
			}
				else 
					System.out.print(" ");}
		
			
			

			
				//if(i==1||i==n||j==1||j==n) {
				System.out.println();
		}
for(int i=n;i>=1;i--) {
			
			
			//for(int j=1;j<n-1;j++) {
				//System.out.print(" ");
			//}

			for(int j=i;j<=n;j++) {
				if(j==1||j==i) {
				System.out.print("*");
			}
				else 
					System.out.print(" ");}
			
			for(int j=1;j<i;j++) {

					System.out.print(" ");}
			for(int j=1;j<=i;j++) {

				System.out.print(" ");}
			for(int j=i;j<=n;j++) {
				if(j==1||j==i) {
				System.out.print("*");
			}
				else 
					System.out.print(" ");}
			
		
			
			

			
				//if(i==1||i==n||j==1||j==n) {
				System.out.println();
		}
		
		}}			