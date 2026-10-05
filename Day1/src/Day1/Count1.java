package Day1;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Count1 {
	static void count(String s){
		LinkedHashMap<Character,Integer>map =new LinkedHashMap<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(map.containsKey(ch)) {
				int c=map.get(ch);
				map.put(ch, c+1);
			}
			else
				map.put(ch,1);
			
		}
	
	String res="";
	Set<Character>keys=map.keySet();
	for(Character key:keys) {
		res+=key+""+map.get(key);}
		System.out.print(res);
	}
	

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String s=obj.next();
		count(s);
obj.close();
		
	
		
		// TODO Auto-generated method stub

	}

}
