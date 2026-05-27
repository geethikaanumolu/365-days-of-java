import java.time.LocalDate;  
import java.time.Period;
import java.util.Locale;
import java.util.Scanner;

public class websitedesignUser
{
public static void main(String args[])
{
Scanner StudentName = new Scanner(System.in);
System.out.println("Enter name");
String Name = StudentName.nextLine();
System.out.println("Student Name: " + Name);
//Name of student is entered

Scanner scanner = new Scanner(System.in);  
System.out.print("Enter date of birth in YYYY-MM-DD format: ");  
String input = scanner.nextLine();  
scanner.close();    
LocalDate dob = LocalDate.parse(input);  
System.out.println("You are "+calculateAge(dob)+" years old.");  
}
//the method calculates the age  
public static int calculateAge(LocalDate dob)   
{
LocalDate curDate = LocalDate.now();  
//calculates the amount of time between two dates and returns the years  
if ((dob != null) && (curDate != null))   
{  
return Period.between(dob, curDate).getYears();  
}  
else  
{  
return 0;  
}  

Boolean b;
do 
{
System.out.println("Please enter your email address eg :xyz@gmail.com");
Scanner name = new Scanner(System.in);
String emailaddress=name.nextLine();
String email_regex = "[A-Z]+[a-zA-Z_]+@\b([a-zA-Z]+.){2}\b?.[a-zA-Z]+";
//to enter the user's email address
String testString = emailaddress;
b = testString.matches(email_regex);
System.out.println("String: " + testString + " :Valid = " + b);
System.out.println("Email address is " +emailaddress);
//to verify if the email address is valid or not 
}
while(false);

Scanner StudentCountry = new Scanner(System.in);
System.out.println("Enter Country");
String Country = StudentCountry.nextLine();
System.out.println("Country: " + Country);

Scanner StudentState = new Scanner(System.in);
System.out.println("Enter State");
String State = StudentState.nextLine();
System.out.println("State: " + State);


Scanner StudentCity = new Scanner(System.in);
System.out.println("Enter City");
String City = StudentCity.nextLine();
System.out.println("City: " + City);

Scanner StudentSchool = new Scanner(System.in);
System.out.println("Enter School or College");
String Institute = StudentSchool.nextLine();
System.out.println("School or College: " + Institute);


Scanner StudentNumber = new Scanner(System.in);
System.out.println("Enter Phone Number");
Float Phone = StudentNumber.nextFloat();
System.out.println("Student Phone Number: " + Phone);
//optional

Scanner StudentUsername = new Scanner(System.in);
System.out.println("Enter Username");
String Username = StudentUsername.nextLine();
System.out.println("Username: " + Username);
//Username for the website


Scanner StudentPassword = new Scanner(System.in);
System.out.println("Enter Password \n password must have atleast 8 characters");
String Password = StudentPassword.nextLine();
System.out.println("Password: " + Password);
//Password for the website

do
{
System.out.println("Do you want to continue y or n");
}
char = 'Y';
while(y.equalsIgnoreCase("Y"));
//Loop to see if you want to continue to next or not
}
}
