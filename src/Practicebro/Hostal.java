package Practicebro;
import java.util.*;
public class Hostal {
	public static void main(String dfdsf[]) {
		Student st = new Student("Ankit");
		System.out.print(st.name);
	}
}

class Student{
	String name;
	Student(String name){
		this.name = name;
	}
	void intro() {
		System.out.println("studnet");
	}
}
class sport extends Student{
	
	void intro() {
		System.out.println("sport");
	}
}