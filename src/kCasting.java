public class kCasting {

    public static void main(String[] args) {


        int num = 67;

        double d = num;

        System.out.println(d);

        double num2 = 45.6;

        int intNum = (int)num2; // casting does not change the variable being cast

        System.out.println(intNum);

        System.out.println(num2);


        int num3 = (int)67.8;
        System.out.println(num3);


//        double d4 = (short)56; //upcasting/widening is implicitly done by the compiler
        // we can also explicitly add it

        int num4 = (int)4378L;

        System.out.println(num4);

    }
}
