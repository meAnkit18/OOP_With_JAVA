package pack;
import java.util.*;
public class Ques4 {
 public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 String str = in.nextLine();
	 
	 StringTokenizer st = new StringTokenizer(str," ");
	 System.out.println(st.countTokens());
	while(st.hasMoreElements()) {
		String w=st.nextToken();
		StringBuilder sb = new StringBuilder();
		sb.append(w);
		sb.reverse();
//		System.out.print(sb.toString()+" ");
	}
	StringBuilder tsb = new StringBuilder();
	tsb.append(str);
	tsb.reverse();
	System.out.println(tsb);
	if(str.equals(tsb)) {
		System.out.println("Is Palindrome");
	}else {
		System.out.println("Is not Palindrome");
	}
 }
}
