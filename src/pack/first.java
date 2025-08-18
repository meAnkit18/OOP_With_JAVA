package pack;
import java.util.*;
public class first {
	public static void main(String[] args) {
		int n = 5739;
		int arr[]= {500,200,100,50,20,10,5,2,1};
		int c =0;
		int i=0;
		while(n!=0) {
			if(arr[i]<=n) {			
				int d = n/arr[i++];
				c = c+d;
				n = n%arr[i];
			}else {
				i++;
			}
			
		}
		System.out.print(c);
		
	}

}
