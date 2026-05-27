import java.util.Scanner;
public class email
{
public static void main(String args[])
{
boolean b;
do 
{
System.out.println("Please enter your email address eg :xyz@gmail.com");
Scanner name = new Scanner(System.in);
String emailaddress=name.nextLine();
String email_regex = "[A-Z]+[a-zA-Z_]+@\b([a-zA-Z]+.){2}\b?.[a-zA-Z]+";
String testString = emailaddress;
b = testString.matches(email_regex);
System.out.println("String: " + testString + " :Valid = " + b);
System.out.println("Email address is " +emailaddress);
}
while(false);
}
}