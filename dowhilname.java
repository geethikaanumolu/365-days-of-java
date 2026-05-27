import java.util.Scanner;
public class dowhilname
{
public static void main(String args[])
{
System.out.println("Enter your name ");
Scanner sc = new Scanner(System.in);
String name= sc.nextLine();
int i=1;
do
{
System.out.println(""+name+"");
i++;
}
while(i<=50);
}
}