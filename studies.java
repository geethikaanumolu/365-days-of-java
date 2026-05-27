import java.util.Scanner;
public class studies
{
public static void main(String args[])
{
Scanner info = new Scanner(System.in);
System.out.println("Enter your name");
String text1 = info.nextLine();
System.out.println("your name is " +text1);
System.out.println("Enter your marks in math");
float text2 = info.nextFloat();
System.out.println("Enter your marks in english");
float text3 = info.nextFloat();
System.out.println("Enter your marks in science");
float text4 = info.nextFloat();
System.out.println("your total marks are " + (text2 + text3 + text4));
System.out.println("your Average marks are " + (text2 + text3 + text4)/3 );
System.out.println("enter your study time ");
float text5 = info.nextFloat();
if (text5==10)
{
System.out.println("you study for " +text5 + " minutes");
System.out.println("you have gotta study a lot more dude. You can do this!");
}
else if (text5==20)
{
System.out.println("you study for " +text5 + " minutes");
System.out.println("you have gotta study just a little more dude. You can do this!");
}
else if (text5==30)
{
System.out.println("you study for " +text5 + " minutes");
System.out.println("you are doing good but please concentrate your best in these 30 minutes. You will do great!");
}
else if (text5>30)
{
System.out.println("you study for " +text5 + " minutes");
System.out.println("you are doing great dude but dont stress yourself too much. You will do great!");
}
else
{
System.out.println("you study for " +text5 + " minutes");
System.out.println("you are doing horrible dude put in a little effort. You will do great!");
}
}
}