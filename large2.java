import java.util.Scanner;
public class large2
{
public static void main(String args[])
{
Scanner numbers = new Scanner(System.in);
System.out.println("Enter your 1st number");
float word1 = numbers.nextFloat();
System.out.println("Enter your 2nd number");
float word2 = numbers.nextFloat();
System.out.println("Enter your 3rd number");
float word3 = numbers.nextFloat();
if (word1>word2 && word1>word3)
{
System.out.println("the greatest number is " +word1);
}
else if (word2>word1 && word2>word3)
{
System.out.println("the greatest number is " +word2);
}
else 
{
System.out.println("the greatest number is " +word3);
}
}
}