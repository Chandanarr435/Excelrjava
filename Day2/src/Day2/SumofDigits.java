package Day2;

import java.util.Scanner;

public class SumofDigits {

	
 

		// TODO Auto-generated method stub

	


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int a=sc.nextInt();
        //int b=sc.nextInt();
        //int c=sc.nextInt();
        //
        //if(a>b) {//a<b
        	//if(a>c) {
        		//System.out.println(a);
        	//}//
        	//else {
        		//System.out.println(c);
        	//}}
        	//else {
        	//	if(b>c){
        		//	System.out.println(b);
        		//}//
        		//else {
        	//		System.out.println(c);
        	//
        		//}
        		//}}}
int num=sc.nextInt();
int sum=0;
sum=num%10;
num/=10;
sum+=num%10;
num/=10;
sum+=num%10;
num/=10;
sum+=num%10;
num/=10;
sum+=num%10;

System.out.print(sum);}}


