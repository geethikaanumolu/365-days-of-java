import java.util.Scanner; // show them as code

public class ListCountry {

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
String c = "";
do
{
    System.out.println("How much money do you want to have? ");
    double money = input.nextDouble();

    System.out.println("Ok, here is yours $" + money);

    System.out.println("Do you want to continue y or n");
    c = input.nextLine();

}
while(c.equalsIgnoreCase("Y"));
}
}