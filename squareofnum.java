import java.util.Scanner;
public class squareofnum
{
public static int square(int x)
{
return x * x;
}
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = obj.nextInt();
System.out.print("the square of " + num + " is" + square (num));
}
}
