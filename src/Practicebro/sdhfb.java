package Practicebro;
import java.util.*;
public class sdhfb {
	public static void main(String arfs[]) {
		Student n1 = new Student("Ankit",99);
		n1.dis(n1);
		Student n2 = new Student("Aman",22);
		try {
			n2.myException(n2);
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
		
	}
}

class Student{
	private String name;
	private int marks;
	Student(String name, int marks){
		this.name = name;
		this.marks = marks;
	}
	
	void dis(Student ob) {
		System.out.println(ob.name);
		System.out.println(ob.marks);
	}
	void myException(Student ob)  throws Exception{
		if(ob.marks <40) {
			throw new ArithmeticException("fsdj");
		}
	}
}

//write a program to create a class  which shows the name of the student and its marks as private member 
//use constructer to initlize at least thee values create a display method to show the student
//data finally show a custom exception if marks is less than 0