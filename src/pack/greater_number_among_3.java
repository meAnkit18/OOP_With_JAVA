package pack;
import java.util.*;
public class greater_number_among_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int m =0;
		if(a>b) {
			if(a>c) {
				m=a;
			}else {
				m=c;
			}
		}else {
			if(b>c) {
				m=b;
			}else {
				m=c;
			}
		}
		System.out.println(m + " Greatest number");
	}

}
