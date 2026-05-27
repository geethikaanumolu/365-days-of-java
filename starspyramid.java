import java.util.Scanner;
public class starspyramid 
{
public static void main(String[] args)
{
System.out.println("Enter no. of rows you want to print");
System.out.println("Enter symbol");
Scanner sc= new Scanner(System.in);
int rows= sc.nextInt();
Scanner nini= new Scanner(System.in);
String symbol= nini.nextLine();
int x=0;
for (int i = 1; i <= rows; ++i, x = 0) 
{
for (int space = 1; space <= rows - i; ++space) 
{
System.out.print("  ");
}
while (x != 2 * i - 1)
{
System.out.print(" "+symbol+"");
++x;
}
System.out.println();
}
}
}