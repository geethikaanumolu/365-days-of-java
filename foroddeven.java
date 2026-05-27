public class foroddeven {
    public static void main(String[] args) {
      System.out.println("for even loop");
        for (int i = 50; i<=100 ; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("for odd loop");
        for (int i = 100; i>=50 ; i--){
            if (i%2==1){
                System.out.println(i);
            }
        }

    }
}