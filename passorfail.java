import java.util.Scanner;
public class passorfail
{
public static void main(String args[])
{
Scanner random = new Scanner(System.in);
System.out.println("Enter cost price");
int cp = random.nextInt();
System.out.println("enter selling price");
int sp = random.nextInt();
if (cp>sp)
{
System.out.println("a loss has been incurred");
}
else if (sp>cp)
{
System.out.println("a profit ahs been gained ");
}
else
{
System.out.println("neither profit nor loss has been occurred ");
}
}
}