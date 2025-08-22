package pack;
import java.util.*; 
public class CheckAdress {
public static void main(String[] s) {
	Student s1 = new Student();
	s1.name = "Ankit";
	s1.adress = "Delhi";
	Student s2 = new Student();
	s2.name = "Aman";
	s2.adress = "Delhi";
	Student s3 = new Student();
	s3.name = "Ankit";
	s3.adress = "Mumbai";
	Student s4 = new Student("Aman","Delhi");
	Student s5 = new Student("Ashrit","Up");
	Student s6 = new Student("Aryan","Ghaziabad");
	if(s4.adress == "Delhi") {
		System.out.println("Yes");
	}else {
		System.out.println("No");
	}
	
}
static class Student{
	String name;
	String adress;
	Student(String name,String adress){
		this.name = name;
		this.adress=adress;
	}
	Student(){
		
	}
}
}
