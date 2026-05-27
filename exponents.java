import java.util.Scanner;
public class exponents
{
public static void main(String args[])
{
int base, exponent, answer=1, num;
Scanner sc=new Scanner(System.in);
System.out.println("enter base number");
base=sc.nextInt();
System.out.println("enter exponent");
exponent=sc.nextInt();
for(num=1;num<=exponent; num++)
{
answer=answer*base;
}
System.out.println(""+base+" raised to "+exponent+" is " +answer );
}
}