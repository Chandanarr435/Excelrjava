package Day1;

import java.util.Scanner;

public class Prime {
	static boolean prime(int n){
		if(n<2) {
			return false;
		}
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	static void prime1(int arr[]){
		for(int i=0;i<arr.length;i++) {
			if(prime(arr[i])) {
				System.out.print(arr[i]+ " ");
			}
		}
	}

	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	int n=obj.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=obj.nextInt();
	}
	prime1(arr);
		
		// TODO Auto-generated method stub

	}

}
