public class nestedif
{
public static void main(String args[])
{
// declaring double type variables
int n1 = 23, n2 = 45, n3 = 53, largest;
// check if n1 is greater than or equal to n2
if(n1 >= n2) 
{
// if...else statement inside the if block
// check if n1 is greater than or equal to n3
if(n1 >=n3)
{
largest = n1;
}
else
{
largest = n3;
}
}
else
{
// if...else statement inside else block
//checks if n2 is greater than or equal to n3
if(n2 >= n3)
{
largest = n2;
}
else
{
largest = n3;
}
}
System.out.println("Largest number is: " + largest);
}
}