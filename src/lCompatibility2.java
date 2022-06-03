public class lCompatibility2 {
    public static void main(String[] args) {



        float f = 8.0F; // 8.0 -> double
        // 8.0F -> float

        // floating-point numbers -> decimal number

        // Division operator

        System.out.println(10.0 / 3.0); // decimal division works as intended
        // Integer division

        System.out.println(10 / 3); // Integer division removes the decimal part


        System.out.println(368 / 10);

        // disvision by zero

//        System.out.println(10 / 0 ); // runtime error -> ArithmeticException

        System.out.println(10.5 / 0.0);  // decimal zero division results in Infinity

        System.out.println( 0 / 10); // 0

        System.out.println(0.0 / 0.0 ); //  Nan -> Not  a number


        // Modulo

        System.out.println(23 % 5); // 3
        System.out.println(5 % 5); // 0
        System.out.println(1 % 5); // 1
        System.out.println(34 % 89); // 34
        System.out.println(89 % 39); // 11







    }
}
