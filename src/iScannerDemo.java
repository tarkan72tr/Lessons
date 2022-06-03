import java.util.Scanner;

public class iScannerDemo {

    public static void main(String[] args) {

        System.out.println("Enter a number and I will square it for you");
        Scanner scan = new Scanner(System.in);
//
        int x = scan.nextInt();

        System.out.println("The double d value is: " + (x * x));
    }
}
