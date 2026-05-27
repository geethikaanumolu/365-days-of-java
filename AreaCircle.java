import java.util.Scanner;
public class AreaCircle
{ 
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.println("Enter radius of your circle:");
int r= in.nextInt();
System.out.println("Area of the circle " + (3.14*r*r));
}
}