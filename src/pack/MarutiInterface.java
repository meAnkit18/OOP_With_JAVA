package pack;
import java.util.*;
//Interface
interface CAR{
	int tyre = 4;
	void engine();
}
public class MarutiInterface implements CAR{
	public void engine() {
		System.out.print("Inside engine");
	}
	public static void main(String s[]) {
		MarutiInterface h1 = new MarutiInterface();
		h1.tyre = 10;
		
	}
}
