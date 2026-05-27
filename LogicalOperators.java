public class LogicalOperators
{
public static void main(String args[])
{
// declaring double type variables
int n1 = 23, n2 = 45, n3 = 53, largest;
// check if n1 is greater than or equal to n2
if((n1==n2)&&(n1==n3)) 
{
System.out.println("all the numbers are equal");
}
else if((n1 > n2)&&(n1 > n3))
{
System.out.println("Largest number is: " + n1);
}
else if (n2 > n3)
{
System.out.println("Largest number is: " + n2);
}
else
{
System.out.println("Largest number is: " + n3);
}
}
}