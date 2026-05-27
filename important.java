import java.util.Scanner;
public class important
{
public static void main(String[] args)
{
Scanner my=new Scanner(System.in);
System.out.println("Enter Math marks");
float a = my.nextFloat();
System.out.println("Enter English marks");
float b = my.nextFloat();
System.out.println("Enter Science marks");
float c = my.nextFloat();
System.out.println("your average mark is " +((a+b+c)/3));
if(((a+b+c)/3)>=90 && ((a+b+c)/3)<=100)
System.out.println("you got an A");
else if(((a+b+c)/3)>=80 && ((a+b+c)/3)<=89)
System.out.println("you got a B");
else if(((a+b+c)/3)>=70 && ((a+b+c)/3)<=79)
System.out.println("You got a C");
else if(((a+b+c)/3)>=60 && ((a+b+c)/3)<=69)
System.out.println("You got a D");
else
System.out.println("You got E");
}
}