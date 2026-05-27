public class dowhileoddeven {
    public static void main(String[] args) {
        int i  = 50;
        System.out.println("do while even loop");

        do{
            if (i %2 == 0)
            {
                System.out.println(i);
            }
            i++;
        } 
        while(i<=100);
        System.out.println("do while odd loop");

        i = 100;
        do{
            if (i %2 == 1)
            {
                System.out.println(i);
            }
            i--;
        } 
        while(i>=50);
    }
}