import java.util.Scanner;
public class oddevennum
{
public static void oddEven(int x)
{
if (x % 2 == 0)
System.out.println(x + " is even");
else
System.out.println(x + " is odd");
}
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = obj.nextInt();
oddEven(num);
}
}
