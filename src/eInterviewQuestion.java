public class eInterviewQuestion {

    public static void main(String[] args) {


        int i = 66;
        int j = 23;

        // use a temporary third variable
        int temp = i;  // storing i's value (66) into temp
        i = j;  // assign j's value(23) to i
        j = temp; // assign stored i's value in temp (66) to j

        System.out.println("i is :" + i);
        System.out.println("j is :" + j);

    }


}
