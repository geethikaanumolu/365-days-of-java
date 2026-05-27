import java.util.Scanner;
public class greaterorequal
{
public static void main(String args[])
{
Scanner nini= new Scanner(System.in);
System.out.println("enter your first number");
float num1= nini.nextFloat();
System.out.println("enter your second number");
float num2= nini.nextFloat();
if (num1>num2)
{
System.out.println(""+num1+" is greater");
}
else if (num1<num2)
{
System.out.println(""+num2+" is greater");
}
else
{
System.out.println(""+num1+" is equal to "+num2+"");
}
}
}