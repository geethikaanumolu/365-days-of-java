import java.util.Scanner;
public class dowhilemultiplicationtable
{
public static void main(String args[])
{
System.out.println("Enter an integer variable: ");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int i=1;
do
{
System.out.println(""+num+" x "+i+" = " +(num*i));
i++;
}
while(i<=10);
}
}