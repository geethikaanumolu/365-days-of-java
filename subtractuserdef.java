import java.util.Scanner;
public class subtractuserdef
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the value to num1: ");
int num1=sc.nextInt();
System.out.print("Enter the value to num2: ");
int num2=sc.nextInt();
System.out.print("subtraction of "+num2+"-"+num1+" :"+subtraction(num1,num2));
}
public static int subtraction(int l,int m)
{
return m-l;
}
}