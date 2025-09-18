package pack;
import java.util.*;
public class StaticPlay {
	static int v;
	public static void main(String args[]) {
		StaticPlay obj = new StaticPlay();
		obj.v = 18;
		System.out.println(v);
		StaticPlay obj1 = new StaticPlay();
//		obj.v = 10;
		System.out.println(obj1.v);
	}
}
