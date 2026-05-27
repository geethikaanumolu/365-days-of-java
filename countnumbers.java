import java.util.Scanner;
public class countnumbers
{
public static void main(String[] args)
{
Scanner num = new Scanner(System.in);
int number,          
positive = 0, 
negative = 0,
zero = 0;
char no;
do
{
System.out.println("Enter the number ");
number = num.nextInt();
if(number > 0)
{
positive++;
}
else if(number < 0)
{
negative++;
}
else
{
zero++;
}
System.out.println("Do you want to continue y/n? ");
no = num.next().charAt(0);
}
while(no=='y' || no == 'Y'); 
System.out.println("Positive numbers= " + positive);
System.out.println("Negative numbers= " + negative);
System.out.println("Zero numbers= " + zero);
}  
}