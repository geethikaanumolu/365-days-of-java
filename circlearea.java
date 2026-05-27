import java.util.Scanner;

public class circlearea
{
public static void main(String args[])
{
Scanner myObj = new Scanner(System.in);
System.out.println("enter radius of circle");
double r = myObj.nextDouble();
double area = 3.14*r*r;
System.out.println("Area of the circle= " + area + "sq.cm");
}
}
