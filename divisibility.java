import java.util.Scanner;
public class divisibility
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number to be divided");
float num1=sc.nextInt();
System.out.println("enter number to divide with");
float num2=sc.nextInt();
if(num1%num2==0)
{
System.out.println(""+num1+" is exactly divisible by "+num2+"");
}
else
{
float answer= num1 / num2;
float remainder= num1%num2;
System.out.println(""+num1+" is not exactly divisible by "+num2+" and gives quotient as " +answer+" and remainder as " +remainder);
}
}
}