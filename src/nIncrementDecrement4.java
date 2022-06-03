public class nIncrementDecrement4 {


        public static void main(String[] args) {


            // pre-increment -> increment the variable first and use it
            // post-increment -> use it and THEN increment it

            int number = 5;



            int result =   ++number  +  ++number + --number + number--;


            System.out.println(result); // 24, 13, 25
            System.out.println(number); // 4 , 5,  5




        }
}
