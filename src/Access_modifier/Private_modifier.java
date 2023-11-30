package Access_modifier;

class base{
  int stud_no=20; // Student name and student number = state
  String stud_name="Rameez";
 void display() // display() - bihaviour
 {
	 System.out.println("Student ID: "+stud_no);
	 System.out.println("Student Name: "+stud_name);
 }
}
public class Private_modifier{
	public static void main(String[] args) {
		base obj = new base();
		System.out.println("Calling the method");
		obj.display();
		System.out.println("calling the state");
		System.out.println(obj.stud_name);
	}
}
