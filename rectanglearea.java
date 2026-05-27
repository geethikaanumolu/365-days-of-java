import java.util.Scanner;
public class rectanglearea
{
public static void main(String args[])
 {
   Scanner myObj = new Scanner(System.in);
     System.out.println("enter length of rectangle");
     int length = myObj.nextInt();
     
     System.out.println("enter breadth of rectangle");
     int breadth = myObj.nextInt();
     
     int area = length * breadth;
     System.out.println("Area = " + area);

}
}

