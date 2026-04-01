import java.util.*;
class Rectangle{
    int width;
    int length;
    
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rectangle width");
        width = sc.nextInt();
        System.out.println("Enter the Rectangle length");
        length = sc.nextInt();
         }
    void CalculateArea(){
        int Area = width*length;
        System.out.println("Area Of Rectangle : " + Area);
    }
}
public class Main{
public static void main(String[]args){
    Rectangle r1 = new Rectangle();
    r1.getData();
    r1.CalculateArea();
    
}
}
