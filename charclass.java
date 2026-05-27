public class charclass
{
public static void main (String [] args)
{
char ch1, ch2, ch3, ch4;
ch1 = 'T';
ch2 = 'k';
ch3 = '\n';
ch4 = 'G';
boolean b1,b2,b3,b4;
b1 = Character.isLetter(ch1);
b2 = Character.isLowerCase(ch2);
b3 = Character.isSpace(ch3);
b4 = Character.isDefined(ch3);

String str1 = "The first character is a letter:" +b1;
String str2 = "The second character is a lowe-case:" +b2;
String str3 = "The third character is for space:" +b3;
String str4 = "the fourth character is defined in java identifier:" +b4;

System.out.println( str1 );
System.out.println( str2 );
System.out.println( str3 );
System.out.println( str4 );
}
}


