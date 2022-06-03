public class aCompatibility1 {
    public static void main(String[] args) {


//        int x = 89.0;


        // byte -> short -> int -> long -> float -> double

        // smaller data types can be assigned to larger dat types without any issue
        // larger data types cannot be assigned to smaller one

        short sh = 67;
//        byte b = sh;
        byte b2 = 34;

        short sh1 = b2;


        int intNum = 55;

//       short sh3 = intNum;

//        float f = 67.8F;
//       int i = f;

        int i = 56;
        float f = i;  // when smaller types are assigned to larger types
        // they are first converted to larger type and then assigned

        System.out.println(f);

    }
}
