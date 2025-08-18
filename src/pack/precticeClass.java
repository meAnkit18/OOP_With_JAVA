package pack;
import java.util.*;
public class precticeClass {
	public static void main(String[] s) {
		Student first= new Student();
		first.percentage = 99.9f;
		first.section ='A';
		
		first.greet("Ankit Kumar");
		System.out.println(first.old(18));
		first.sec();
		System.out.println(first.pc());
		
	}
	static class Student{
		String name;
		int age;
		float percentage;
		char section;
		
		void greet(String name){
			System.out.println("Hello "+ name);
		}
		int old(int age) {
			return age;
		}
		void sec() {
			System.out.println(section);
		}
		float pc() {
			return percentage;
		}
		
	}
}
