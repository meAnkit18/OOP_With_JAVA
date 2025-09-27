package Practicebro;
import java.util.*;
public class Pelindrome {
	public static void main(String sjfij[]) {
		String s = "ankna";
		StringBuilder sb = new StringBuilder(s);
		String v = sb.reverse().toString();
		if(s.equals(v)) {
			System.out.println("Is pelendrome");
		}else {
			System.out.println("Not pelendrome");
		}
	}
}
