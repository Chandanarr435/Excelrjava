package Day1;

import java.util.Scanner;

public class Excep {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String obj1=obj.nextLine();
		try {
			if(obj1.contains(" ")) {
				System.out.println("accept");
			}
			else {
				throw new Inv1("no");
			}
		}
		catch(Inv1 ex) {
			System.out.println(ex.getMessage());
		}
		

		// TODO Auto-generated method stub

	}

}
