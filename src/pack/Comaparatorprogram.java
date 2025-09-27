package pack;
import java.util.*;
public class Comaparatorprogram {
	public static void main(String args[]) {
		List<Studentb>  stu = new ArrayList<>();
		stu.add(new Studentb("Ankit",100));
		stu.add(new Studentb("Aman",5));
		stu.add(new Studentb("Virat",82));
		stu.add(new Studentb("Kohli",118));
		stu.add(new Studentb("Ashrit",100));
		for(Studentb v: stu) {
			System.out.println(v.name+" "+v.marks);
		}
		stu.sort((a,b)->a.marks - b.marks);
		System.out.println("After sorted: ");
		for(Studentb v: stu) {
			System.out.println(v.name+" "+v.marks);
		}
	}
}
class Studentb{
	String name;
	int marks;
	Studentb(String name, int marks){
		this.name = name;
		this.marks = marks;
	}
}
