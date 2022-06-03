public class gLiterals {

    public static void main(String[] args) {

        System.out.println(56 + 67);

        int i = 2147483647;
//        short sh = 2147483647;

        int x = 2000;
//        short sh2 = x;

        short sh3 = 2000; // as long as the range of an int literal is within the range of short it works
//        short sh4 = 32768;

//        int x2 = 120;
//        byte b2 = x2;

//        byte b = 120;

//       float de =  37264326L;  // long literal

        long l1 =  3056554000L;  // L is used for lierals that are larger than int range (3056554000L)

        float f1 =  2056554000;  // int literal(2056554000)  is compatible with float


        System.out.println(56.3 + 8.6); // any decimal literal is considered double by default

 //        float i2 = 9.8; // 9.8 is considered double

        float r = 56.7F;

        double d2 = r;
        double d3 = 5.2F;

        long creditCardNo = 3456_7892_1234_5678L;
        System.out.println(creditCardNo);

        int ssn = 12_234_5678;

        // underscores in literals cannot come in the beginning and at the end
        // also cannot come before or after the . in decimal literals

//        int invalid1 = _43534_;

//        double invalid2 = 23_._8934;

        char ch1 = '@';

        String str = "vbfhdv";


        System.out.println( "Hello" + ' ' + 2 + 5.9 + true + false + null);


    }
}
