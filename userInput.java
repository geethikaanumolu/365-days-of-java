cmdimport java.util.Scanner;
public class userInput
{
public static void main(String args[])
{
System.out.println("example for runtime input");
Scanner myObj = new Scanner(System.in);
System.out.println("enter your name");
String name = myObj.nextLine();
System.out.println("my name is " +name);
System.out.println("enter your age");
byte num=myObj.nextByte();
System.out.println("my age is " +num);
}
}