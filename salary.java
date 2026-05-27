import java.util.Scanner;

public class salary
{
public static void main(String args[])
{
Scanner EmployeeName = new Scanner(System.in);
System.out.println("Enter the name");
String text1 = EmployeeName.nextLine();

Scanner EmployeeSalary = new Scanner(System.in);
System.out.println("Enter the salary");
String text2 = EmployeeSalary.nextLine();

Scanner EmployeeDA = new Scanner(System.in);
System.out.println("Enter the DA");
String text3 = EmployeeDA.nextLine();

Scanner EmployeeHRA = new Scanner(System.in);
System.out.println("Enter the HRA ");
String text4 = EmployeeHRA.nextLine();

System.out.println("The DA is Rs." +(1000));
System.out.println("The HRA is Rs." +(1800));
System.out.println("Total Gross Salary is Rs." +(10000 + 1000 + 1800));
}
}