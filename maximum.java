public class maximum

{

public static void main(String args[])

{

int num1=34, num2=54, num3=45,max;

if ((num1 > num2) && (num1 > num3))

{

max = num1;

}

else if (num2 > num3)

{

max = num2;

}

else

{

max = num3;

}

System.out.println("Maximum is " + max);

}

}