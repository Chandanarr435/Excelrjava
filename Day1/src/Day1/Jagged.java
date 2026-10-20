package Day1;

import java.util.Scanner;

public class Jagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int row=obj.nextInt();
		//int col=obj.nextInt();
		int arr[][]=new int[row][];
		for(int i=0;i<row;i++) {
			int col=obj.nextInt();
			
			arr[i]=new int[col];
			for(int j=0;j<col;j++) {
				arr[i][j]=obj.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<arr[i].length;j++) {
				//if(i>j) {
				System.out.print(arr[i][j]+" ");}
				System.out.println();
			
		
		
		
		// TODO Auto-generated method stub

	}

	

	}

}
class Main {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 3, 2, 1};
        int i;

        for (i = 0; i < a.length / 2; i++) {
            if (a[i] != a[a.length - 1 - i])
                break;
        }

        if (i == a.length / 2)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
