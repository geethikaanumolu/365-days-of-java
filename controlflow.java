import java.util.Scanner;

class controlflow
{
public static void main(String args[])
{
Scanner obj = new
Scanner(System.in);
System.out.println("enter your age");
int age= obj.nextInt();
if (age>=18)
{
System.out.println("you are eligible to vote");
}
else
{
System.out.println("you are not eligible to vote.sorry!");
}
}
}