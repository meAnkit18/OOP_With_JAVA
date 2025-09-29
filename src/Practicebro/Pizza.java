package Practicebro;
import java.util.*;
public class Pizza {
	public static void main(String dsf[]) {
		System.out.println("1.Menu, 2.exit");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		switch(x){
			case 1:{
				System.out.println("1.100 2.200 3.300");
				int p = sc.nextInt();
				
				
			
				switch(p) {
				case 1: System.out.println("100 rs pizza added to cart");
				break;
				case 2: System.out.println("200 rs pizza added to cart");
				break;
				case 3: System.out.println("300 rs pizza added to cart");
				break;
				default: System.out.println("wrong select");
				
				};
				
			};
			
			case 2:{
				break;
		}
		
	};
	}
}
