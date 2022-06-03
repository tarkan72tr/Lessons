public class fInterviewQuestion2 {

    public static void main(String[] args) {


        int i = 66;
        int j = 44;

        // Swap their values without using third temporary variable
        i = i + j; // i stores both i and j values -> 110
        j = i - j; // 110 - 44 => 66
        i = i - j; // 110 - 66 = 44


        // To comment and uncomment multiple lines at once
        //Select those lines
        // Ctrl + /  -> Windows
        // Command + / -> Mac

        System.out.println("i is :" + i);
        System.out.println("j is :" + j);

    }
}
