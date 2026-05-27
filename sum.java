import java.util.Scanner;
public class sum 
{
public static void main(String[] args) 
{
Scanner in = new Scanner(System.in);
char num;
do
{
System.out.println("Enter 1st Number");
int  num1 = in.nextInt();
System.out.println("Enter 2nd Number");
int  num2 = in.nextInt();
System.out.println("Enter 3rd Number");
int  num3 = in.nextInt();
System.out.println("Sum is " + (num1 + num2 + num3));
System.out.println("Do you wish to continue ? (y/n)");
num = in.next().charAt(0);
}
while(num == 'y' || num == 'Y');
}
}