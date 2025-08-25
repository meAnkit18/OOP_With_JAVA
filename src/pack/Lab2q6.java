package pack;
import java.util.*;
public class Lab2q6 {
public static void main(String[] s) {
	SimpleObject s1 = new SimpleObject("Ankit Kumar");
	System.out.println(s1.name);
}
static class SimpleObject{
	String name;
	SimpleObject(String name){
		this.name=name;
//		System.out.println("Hello "+ name);
	}
}
}
