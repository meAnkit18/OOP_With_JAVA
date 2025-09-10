package pack;
import java.util.*;
//abstract class
// diffrace b/e inteface and abstact classs
abstract class Car {
 int tyers = 4;
 void engine() {};
 abstract void testphone();
}
class Maruti extends Car{
	void engine() {
		System.out.println("yoo");
	}
	public static void main(String srgs[]) {
		Maruti mw = new Maruti();
		System.out.println("Type " + mw.tyers);
	}
}
    