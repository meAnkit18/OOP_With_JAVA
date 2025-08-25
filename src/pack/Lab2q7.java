package pack;
import java.util.*;
public class Lab2q7 {
	public static void main(String[] s) {
		RoomClass v =new RoomClass();
		v.setData("E-209", "1st Class",20, true);
		v.displayData();
	}
	static class RoomClass{
		String roomno;
		String roomtype;
		double area;
		boolean ACmachine;
		void setData(String roomno,String roomtype,double area,boolean ACmachine) {
			this.roomno = roomno;
			this.roomtype = roomtype;
			this.area = area;
			this.ACmachine = ACmachine;
		}
		void displayData() {
			System.out.println("Roomno: "+ roomno);
			System.out.println("Room Type: "+ roomtype);
			System.out.println("Area: "+ area);
			System.out.println("AC machine: "+ ACmachine);
		}
	}
}
