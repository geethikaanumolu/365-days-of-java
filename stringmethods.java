public class stringmethods
{
public static void main(String[] args)
{
String str1 = "Hello";
String str2 = "hello";
String str3 = "World";
String str4 = "Hello";
String str = new String("Hello");

System.out.println(str1.compareTo(str4));
System.out.println(str1.compareTo(str2));
System.out.println(str3.compareTo(str1));

System.out.println(str1.equals(str));
System.out.println(str1.equals(str2));
System.out.println(str1.equals(str3));

System.out.println(str1.concat(str3));

System.out.println(str1.charAt(3));
System.out.println(str1.toUpperCase());
System.out.println(str1.length());
}
}