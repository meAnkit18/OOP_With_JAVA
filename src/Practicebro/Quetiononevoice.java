package Practicebro;
import java.util.*;
public class Quetiononevoice {
	public class Overriding {

	}

	public static void main(String args[]) {
		Book b = new Book();
		System.out.println(b.amount(1));
		
		Magazine m = new Magazine();
		System.out.println(m.amount(1));
		
		newspaper n = new newspaper();
		System.out.println(n.amount(1));
		
	}
}
class Library{
	float LateFee = 100.00f;
	
}
class Book extends Library{
	float bookcharg  = 10.00f;
	
	float amount(int day) {
		System.out.print("Book late fee is: ");
		return (LateFee+bookcharg)*day;
	}
}
class Magazine extends Library{
	float bookcharg  = 20.00f;
	float amount(int day) {
		System.out.print("Magazine late fee is: ");
		return (LateFee+bookcharg)*day;
	}
}
class newspaper extends Library{
	float bookcharg  = 5.00f;
	float amount(int day) {
		System.out.print("newspaper late fee is: ");
		return (LateFee+bookcharg)*day;
	}
}

//In a library management system, you have a book, magazine and a newspaper as items
//that can be checked out. Each item type has a different policy for late fee.
//Design the class structure to handle the calculation of late fees using inheritance

//Add static methods biggest and thinnest to the Quantifiable interface.
//These methods should return the object with the biggest and thinnest 
//quantification from an array of Quantifiable objects.


//you are given a likendlist of string you need to remove all elements with lenght <=3