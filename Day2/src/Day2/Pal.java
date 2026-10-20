package Day2;

public class Pal {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,5,4,3,2};
		int i;
		for(i=0;i<arr.length/2;i++) {
			if(arr[i]!=arr[arr.length-1-i]) {
				break;
			}
		}
		
		if( i==arr.length/2) {
			System.out.println("pal");
			
		}
		else
			System.out.println("not");
		// TODO Auto-generated method stub

	}
}


