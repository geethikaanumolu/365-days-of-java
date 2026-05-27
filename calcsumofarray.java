public class calcsumofarray
{  
public static void main(String[] args) 
{      
int [] arr = new int [] {10, 20, 30};   
int sumofarr = 0;   
for (int i = 0; i < arr.length; i++)
{   
sumofarr = sumofarr + arr[i];  
}    
System.out.println("Sum of array elements = " + sumofarr);  
}  
}  