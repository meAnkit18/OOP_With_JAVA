package pack;
import java.util.*;
public class LS_in_Array {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= in.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Smallest in array : " + arr[0]);
		System.out.println("Largest in array : "+ arr[n-1]);
	}
}
