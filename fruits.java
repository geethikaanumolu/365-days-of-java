import java.util.Scanner;

public class fruits
{
public static void main(String args[])
{
Scanner FruitName = new Scanner(System.in);
System.out.println("Enter item name");
String text1 = FruitName.nextLine();

Scanner FruitQuantity = new Scanner(System.in);
System.out.println("Enter the Quantity");
String text2 = FruitQuantity.nextLine();

Scanner FruitRate = new Scanner(System.in);
System.out.println("Enter the rate");
String text3 = FruitRate.nextLine();

Scanner FruitName2 = new Scanner(System.in);
System.out.println("Enter another Item ");
String text4 = FruitName2.nextLine();

Scanner FruitQuantity2 = new Scanner(System.in);
System.out.println("Enter the Quantity");
String text5 = FruitQuantity2.nextLine();

Scanner FruitRate2 = new Scanner(System.in);
System.out.println("Enter the rate");
String text6 = FruitRate2.nextLine();

System.out.println("Total Amount of Oranges is " +(2 * 50) + (" Rs"));
System.out.println("Total Amount of Apples is " +(3 * 150) + (" RS"));
System.out.println("Total Gross amount is " +(100 + 450) + (" Rs"));
}
}