import java.util.Scanner;
public class assessment
{
public static void main(String args[]) 
{ 
float a,b; 
Scanner obj=new Scanner(System.in); 
System.out.print("Enter the first number: "); 
a=obj.nextFloat(); 
System.out.print("Enter the second number: "); 
b=obj.nextFloat(); 
System.out.println("The sum of " +a+ " and " +b+ " is: " +(a+b)); 
System.out.println("The difference between " +a+ " and " +b+ " is: " +( a-b)); 
System.out.println("The product of " +a+ " and " +b+ " is: "+( a*b)); 
System.out.println("The quotient after dividing " +a+ " by " +b+ " is: "+( a/b)); 
System.out.println("The remainder after dividng " +a+ " by " +b+ " is: "+( a%b));
}
} 