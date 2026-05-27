public class arrayoddeven
{
public static void main(String [] args)
{
int x[ ] = {10,25,30,35,40,50,60};
System.out.println("even numbers");
for (int i=x.length-1; i>=0; i--)
{
if (x[i]%2==0)
System.out.println(x[i]);
}
System.out.println("odd numbers");
for (int i=x.length-1; i>=0; i--)
{
if (x[i]%2!=0)
System.out.println(x[i]);
}
}
}