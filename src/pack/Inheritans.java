package pack;
import java.util.*;
public class Inheritans {
	//multilevel yes
	//multiple no
// parent == super == base
	
static class Person{
	int aadharId;
	String Name;
	void eat() {
		System.out.print("eat");
	}
	void sum(int n) {
		System.out.print(n+10);
	}
}
//child == sub == derive
static class Person2{
	void sum(int n) {
		System.out.print(n+10);
	}
	
}
static class Student extends Person,Person2{
	int ID;
	public static void main(String[] s) {
		Student v = new Student();
		v.eat();
		
	}
}


}
