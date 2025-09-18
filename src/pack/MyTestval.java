package pack;
import java.util.*;
public class MyTestval {
	int x = 10;
	int y = 5;
	int r = 0;
	public static void main(String args[]) {
		int arr[] = new int[5];
		MyTestval m1 = new MyTestval();
//		System.out.println(m1.x);
//		System.out.println(m1.y);
//		System.out.println(m1.r);
//		try {
//			m1.r = m1.x/m1.y;
//		}catch(ArithmeticException e){
//			System.out.println("you cannot divide");
//		}
		
		
		try {
			m1.r = m1.x/m1.y;
			for(int i=0;i<=10;i++) {
				System.out.println(arr[i]);
			}
			
		}
		catch(ArithmeticException e){
		System.out.println("you cannot divide");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index Out of bound bro");
		}
		finally{
			System.out.println("you cannot divide");
		}
		System.out.println(m1.r);
		
	}
}
