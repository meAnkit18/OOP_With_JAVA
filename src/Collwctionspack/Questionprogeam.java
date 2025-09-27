package Collwctionspack;
import java.util.*;
public class Questionprogeam {
	public static void main(String args[]) {
		HashMap<String,String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
		map.put(sc.next(), sc.next());	
		}
		for(String k: map.keySet()) {
			if(map.get(k).equals("Delhi")) {
				
				System.out.print(k);
			}
		}
	}
}
