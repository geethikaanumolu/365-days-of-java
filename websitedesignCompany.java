import java.time.LocalDate;  
import java.time.Period;
import java.util.Locale;
import java.util.Scanner;

public class websitedesignCompany
{
public static void main(String args[])
{
Scanner companyname = new Scanner(System.in);
System.out.println("Enter company name");
String Name = companyname.nextLine();
System.out.println("company name: " + Name);
}

Boolean b;
do 
{
System.out.println("Please enter your email address eg :xyz@gmail.com");
Scanner name = new Scanner(System.in);
String emailaddress=name.nextLine();
String email_regex = "[A-Z]+[a-zA-Z_]+@\b([a-zA-Z]+.){2}\b?.[a-zA-Z]+";
//enter the email address of the company
String testString = emailaddress;
b = testString.matches(email_regex);
System.out.println("String: " + testString + " :Valid = " + b);
System.out.println("Email address is " +emailaddress);
//to verify if the email address is valid or not 
}
while(false);

Scanner CompanyCountry = new Scanner(System.in);
System.out.println("Enter Country");
String Country = CompanyCountry.nextLine();
System.out.println("Country: " + Country);

Scanner CompanyState = new Scanner(System.in);
System.out.println("Enter State");
String CompanyState = CompanyState.nextLine();
System.out.println("State: " + State);


Scanner CompanyCity = new Scanner(System.in);
System.out.println("Enter City");
String City = CompanyCity.nextLine();
System.out.println("City: " + City);


Scanner CompanyNumber = new Scanner(System.in);
System.out.println("Enter Phone Number");
Float Number = CompanyNumber.nextFloat();
System.out.println("Phone number: " + Number);


Scanner CompanyPassword = new Scanner(System.in);
System.out.println("Enter Password \n password must have atleast 8 characters");
String Password = CompanyPassword.nextLine();
System.out.println("Password: " + Password);

do
{
System.out.println("Do you want to continue y or n");
}
while(y.equalsIgnoreCase("Y"));

}
}