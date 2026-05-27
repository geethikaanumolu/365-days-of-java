public class whileoddeven {
    public static void main(String[] args) {
        int i = 50;
        System.out.println("While even loop");

        while (i<=100){
            if(i%2 == 0){
                System.out.println(i);
            }
            i++;
        }
        System.out.println("while odd loop");
        i=100;
        while (i>=50){
            if(i%2 == 1){
                System.out.println(i);
            }
            i--;
        }
    }
}