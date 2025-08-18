package pack;
import java.util.*;
public class Sumbtwodd {
	public static void main(String[] args) {
		int s=0;
		int t=0;
		for(int i=1;i<100;i++) {
			if((i&(int)1)==1) {
				s+=i;
				t++;
				System.out.println(i);
				
			}
		}
		System.out.println("Number of Odds: "+t);
		System.out.println("Sum of it: "+s);
	}
}
