import java.util.Scanner;
public class RectangleAreaandPerimeter 
{
public static int perimeter(int l, int b) 
{
int result= 2*(l+b);
return result;
}
public static int area(int l, int b) 
{
int result= l*b;
return result;
}
public static void main (String[] args)
{
Scanner in = new Scanner(System.in);
System.out.print("Enter length of rectangle in cm ");
int l= in.nextInt();
System.out.print("Enter breadth of rectangle in cm");
int b= in.nextInt();
int p= perimeter(l,b);
System.out.println("Perimeter of rectangle is " + p + " cm.");
int a= area(l,b);
System.out.println("Area of rectangle is " + a + " sq. cm.");
}
}