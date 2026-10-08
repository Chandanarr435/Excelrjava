package Day1;

public class Longest {

	public static void main(String[] args) {
		String str="how r yous";
		String w[]=str.split(" ");
		String longs="";
		for(String x:w) {
			if(x.length()>=longs.length()) {
				longs=x;
			}
		}
		
		System.out.println(longs);
		// TODO Auto-generated method stub

	}

}
//longs=x,length();
//for(x:w)//if(x.length()==l