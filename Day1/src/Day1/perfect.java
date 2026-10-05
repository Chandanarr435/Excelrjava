package Day1;

import java.util.Scanner;

public class perfect {
	static boolean Perfect(int n) {
		if(n<2) {
			return false;
			
		}
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum+=i;
				
			}
		}
		return sum==n;
	}
	static void prime1(int arr[]){
		for(int i=0;i<arr.length;i++) {
			if(Perfect(arr[i])) {
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
		// TODO Auto-generated method stub
prime1(arr);
	}

}
