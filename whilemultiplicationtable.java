import java.util.Scanner;
public class whilemultiplicationtable
{
public static void main(String args[])
{
System.out.println("Enter an integer variable: ");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int i=1;
while(i<=10)
{
System.out.println(""+num+" x "+i+" = " +(num*i));
i++;
}
}
}