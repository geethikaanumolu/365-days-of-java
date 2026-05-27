import java.util.Scanner;
public class calls
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter no of calls in a month"); 
double calls= sc.nextFloat();
double calls1= calls-100;
double bill1= 200 + (0.60 * calls);
double calls2 = calls - 150;
double bill2 = 200 + (0.60 * 50) + (0.50 * calls);
double calls3 = calls - 200;
double bill3 = 200 + (0.60 * 50) + (0.50 * 50) + (0.40 * calls);
if (calls == 100)
{
System.out.println(""+calls+" calls bill is 200 rupees" ); 
} 
else if (calls > 100 && calls <= 150)
{
System.out.println(""+calls1+" calls is "+bill1+" rupees");
}
else if (calls > 150 && calls <= 200)
{
System.out.println(""+calls2+" calls is "+bill2+" rupees");
}
else if (calls >= 200)
{
System.out.println(""+calls3+" calls is "+bill3+" rupees");
}
else
{
System.out.println("Total bill amount cannot be calculated because no of calls are too less");
}
}
}

