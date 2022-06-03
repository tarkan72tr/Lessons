import java.util.Scanner;

public class oMethodParameters {

    public static void main(String[] args) {

        calculateSumOfSquares(2,3);


    //    createPassword("John", 23432, 123456789); // we can call a method by passing literal values


        Scanner scan = new Scanner(System.in);

        String firstName = scan.next();
        int someID = scan.nextInt();
        long social = scan.nextLong();




        createPassword(firstName, someID, social); // we can call a method by passing literal values

    }

    public static void createPassword(String name, int id, long ssn){
        System.out.println(name + id + ssn);
    }



    public static void calculateSumOfSquares(int num1, int num2){
        System.out.println(num1*num1 + num2*num2);
    }

//    public static void calculateSumOfSquares(int , int ){}
//  public static void calculateSumOfSquares(56 , 67){}

}
