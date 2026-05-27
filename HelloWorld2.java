import java.util.Scanner;
public class HelloWorld2
{
public static void main (String args[])
{
Scanner my = new Scanner(System.in); 
System.out.println("Enter Your 1st angle: ");
float angle1= my.nextFloat();
System.out.println("Enter Your 2nd angle: ");
float angle2= my.nextFloat();
System.out.println("Enter Your 3rd angle: ");
float angle3= my.nextFloat();
float triangle = (angle1 + angle2 + angle3);
if (triangle==180)
{
System.out.println("Your triangle is valid");
}
else
{
System.out.println("Your triangle is not avlid");
}
}
}