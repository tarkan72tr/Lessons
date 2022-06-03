public class nIncrementDecrement5 {

    public static void main(String[] args) {


        // pre-increment -> increment the variable first and use it
        // post-increment -> use it and THEN increment it

        int number = 4;

        number--;

        char str = '#';
        str++;


//         6++;

        int result =   number-- - number++ + number - --number + number--;


        System.out.println(result); // 6 ,5, 9, 10, 4
        System.out.println(number); // 3, 2, 6, 7, 1
        System.out.println(str);






    }
}
