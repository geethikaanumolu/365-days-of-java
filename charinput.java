import java.util.Scanner;
public class charinput
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Input a character:");
String str = sc.next();
char ch= str.charAt(0);
System.out.println("You have entered " +ch);
final float pi= 3.14f;
System.out.println("pi= " +pi);
}
}