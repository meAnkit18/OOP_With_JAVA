package Practicebro;
import java.util.*;
public class Steinfplendtrom {
	public static void main(String efef[]) {
		String s  = "I am am I";
		String arr[] = s.split(" ");
		System.out.println(Arrays.toString(arr));
		Stack<String> st = new Stack<>();
		for(int i=0;i<arr.length;i++) {
			st.push(arr[i]);
		}
		int k=0;
		for(int i=0;i<arr.length;i++) {
			String v = st.pop();
			if(v.equals(arr[i])) {
				k++;
			}
		}
		if(k==arr.length) {
			
			System.out.println("Hai");
		}else {
			System.out.println("nahi Hai");
		}
	}
}
