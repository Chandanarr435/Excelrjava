package Day1;

public class Countparticular {

	public static void main(String[] args) {
		String str="i like java very much bcz it is easy java java";
		String[]w=str.split(" ");
		String target="java";
		int count=0;
		for(String x:w)
			
		{
		if(x.equals(target)) {
			count++;
		}}
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
