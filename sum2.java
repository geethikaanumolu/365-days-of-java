import java.util.Scanner;
public class sum2
{
public static void main(String args[])
{
int nom;
int sum = 0;
char sum2;
Scanner nini=new Scanner(System.in);
do
{
System.out.println("enter numbers");
nom= nini.nextInt();
sum = sum + nom;
System.out.println("if u want to continue enter y or if u dont want to continue n");
sum2= nini.next().charAt(0);
}
while((sum2 =='y'|| sum2=='Y'));
System.out.println("sum of numbers is " +sum);
}
}