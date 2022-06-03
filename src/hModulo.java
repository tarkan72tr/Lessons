public class hModulo {
    public static void main(String[] args) {


//        System.out.println( 10 %  3);
//        System.out.println( 15 %  2);
//        System.out.println( 15 %  4);
//        System.out.println( 15 %  3);

        // Given a 3 digit integer, print it in reverse order
        // 368 -> 863

        int num = 368;

        int third = num % 10;  // 8

        int temp =  num / 10; // 36

        int second = temp % 10; // 6

        int first =  temp / 10; // 3


        System.out.println("" + third + second + first); // print each digit in reverse order
    }

}
