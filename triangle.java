import java.util.Scanner;
public class triangle
{
public static void main(String args[])
{
Scanner my = new Scanner(System.in);
System.out.println("enter 1st angle");
int ang1 = my.nextInt();
System.out.println("enter 2nd angle");
int ang2 = my.nextInt();
System.out.println("enter 3rd angle");
int ang3 = my.nextInt();
int result = ang1+ang2+ang3;
if(result==180)
{
System.out.println("it is a triangle");
System.out.println("enter height in cm");
int height = my.nextInt();
System.out.println("enter base in cm");
int base = my.nextInt();
System.out.println("area of triangle= "+(height*base*1/2) + "sq cm");
}
else
System.out.println("it is not a triangle");
}
}