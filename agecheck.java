import java.util.Scanner;
public class agecheck
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter the age of person");
int age=sc.nextInt();
System.out.println("The age of person is " +age);
if(age >= 18)
{
System.out.println("access granted");
}
else
{
System.out.println("acecess denied");
}
}
}

