


import java.util.*;
class Student{
    String Name;
    int RollNo;
    int Marks;
    
    public void getData(){
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter The Name Of The Student");
        	Name = sc.nextLine();
        	System.out.println("Enter The RollNo Of The Student");
        	RollNo = sc.nextInt();
        	System.out.println("Enter The Mark Of The Student");
        	Mark = sc.nextInt();
        	
    public void display(){
    System.out.println("Student Name = " + Name);
        System.out.println("Student RollNo = " + RollNo);
            System.out.println("Student Mark = " + Mark);
    }
}

}
public class Main
{
	public static void main(String[] args) {

	Student s1 = new Student();
	s1.getData();
	s1.display();
	
	}
}
