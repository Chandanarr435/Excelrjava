package Day1;

public class format {

	public static void main(String[] args) {
		String name="Alice";
		int age=19;
		double height=5.6;
		System.out.println(String.format("my name is %s i am %d years old and my height is %.2f feet",name,age,height));
		System.out.println(String.format("%-10s%d","tie",9));
		System.out.println(String.format("%-10s%d","tieple",90));
		System.out.println(String.format("%-10s%d","tieploooooo",9000));
		
		// TODO Auto-generated method stub

	}

}
