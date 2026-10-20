package Day1;

import java.util.Scanner;

public class Invalid {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String s=obj.nextLine();
		try
		{
			if(s.contains(" ")) {
				throw new InvalidNameException("yes");
			}
			System.out.println(s);
		}
		catch(InvalidNameException e) {
			System.out.println(e.getMessage());
		}
		
		// TODO Auto-generated method stub

	}

}
