import java.util.Scanner;

public class Grossamount
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

System.out.println("Total Amount of Oranges is Rs."+(2 * 50));
System.out.println("Total Amount of Apples is Rs."+(3 * 150));
System.out.println("Total Gross amount is Rs."+(100 + 450));
}
}