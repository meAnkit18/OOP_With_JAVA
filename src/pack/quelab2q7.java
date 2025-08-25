package pack;
import java.util.*;
public class quelab2q7 {
	public static void main(String[] s) {
	check z = new check(151);
	System.out.println("isZero "+z.isZero());
	System.out.println("isPrime "+z.isPrime());
	System.out.println("isPositive "+z.isPositive());
	System.out.println("isNegative "+z.isNegative());
	System.out.println("isOdd "+z.isOdd());
	System.out.println("isEven "+z.isEven());
	System.out.println("isAmstrong "+z.isAmstrong());
	}
	static class check{
		double n;
		check(double n){
			this.n = n;
		}
		boolean isZero() {
			if(n == 0.00d) {
				return true;
			}else {
				return false;
			}
		}
		boolean isPositive() {
			if(n >0) {
				return true;
			}else {
				return false;
			}
		}
		boolean isNegative( ) {
			if(n <0) {
				return true;
			}else {
				return false;
			}
		}
		boolean isOdd( ) {
			if(n%2!=0) {
				return true;
			}else {
				return false;
			}
		}
		boolean isEven( ) {
			if(n%2==0) {
				return true;
			}else {
				return false;
			}
		}
		boolean isPrime() {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					return false;
				}
				
			}
			return true;
		}
		boolean isAmstrong() {
			String s = String.valueOf(n);
			int l = s.length();
			int s1=0;
			int v= (int) n;
			while (v!=0) {
				int r = v%10;
				int p = (int )Math.pow(r, l);
				s1+= p;
				v = v/10;
			}
			if(v == n) {
				return true;
			}else {
				return false;
			}
		}
	}
}
