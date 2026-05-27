import java.util.Scanner;
public class array5
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
int x[ ] = new int [5]; 
System.out.println("enter 5 elements in the array");
for (int i=0; i<x.length; i++)
x[i]=sc.nextInt();
System.out.println("the 5 elements in the array are");
for (int i=0; i<x.length; i++)
System.out.println(x[i]);
}
}
