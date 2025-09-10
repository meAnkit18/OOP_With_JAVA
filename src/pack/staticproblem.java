package pack;
import java.util.*;
public class staticproblem {
	public static void main(String s[]) {
		Student s1 = new Student("Ankit");
		s1.roll = 01;
		System.out.print(s1.name +" " + s1.roll);
			
	}
}
class Student{
	static String  collegename="KIET";
	String name ;
	int roll;
	Student(String name) {
		this.name= name;
	}
}
