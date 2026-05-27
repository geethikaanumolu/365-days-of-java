import java.util.Scanner;
public class tennumberssum
{ 
  public static void main(String[] args)

{       
    int i,no=0,sum=0;
	double num;
	{
	   
        System.out.println("Input the 10 numbers : ");  
         
	}
		for (i=0;i<10;i++)
		{
		    Scanner in = new Scanner(System.in);
		    no = in.nextInt();
		    
  		sum +=no;
	}
System.out.println("The sum of 10 numbers is : " +sum);
 
}
}