import java.util.Scanner;
public class positiveornegativeorzero
{
public static void main(String args[])
{
Scanner num = new Scanner(System.in);
System.out.println("Enter your number:");
float number = num.nextFloat();
num.nextLine();
if( number>0)
{
System.out.println("Your number is " +number);
System.out.println("Your number is positive ");
}
else if(number<0)
{
System.out.println("Your number is " +number);
System.out.println("Your number is negative ");
}
else
{
System.out.println("Your number is " +number);
System.out.println("Your number is zero ");
}
}
}