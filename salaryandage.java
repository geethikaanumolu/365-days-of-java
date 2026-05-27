import java.util.Scanner;
public class salaryandage
{
public static void main(String args[])
{
Scanner EmployeeName = new Scanner(System.in);
System.out.println("Enter the name");
String text1 = EmployeeName.nextLine();

Scanner EmployeeAge = new Scanner(System.in);
System.out.println("Enter employee's age");
String text2 = EmployeeAge.nextLine();

Scanner EmployeeSalary = new Scanner(System.in);
System.out.println("Enter employee's salary ");
String text3 = EmployeeSalary.nextLine();

System.out.println("The name of employee is " +text1);
System.out.println("The age of the employee is " +text2);
System.out.println("Salary of employee is Rs." +text3);
}
}