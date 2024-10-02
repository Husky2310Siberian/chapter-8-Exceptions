package gr.aueb.cf.Exercises_Exceptions;

/**
 * method takes an integer as a parameter and
 * throws an exception if the number is odd
 */
public class Exercise2 {

    public static void main(String[] args) {

        int n = 18;
        trynumber (n);

        n = 7;
        trynumber (n);
    }

    private static void trynumber(int n) {

        try {
            checknumber(n);
            System.out.println(n + " is even");
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    private static void checknumber(int number) {

        if (number % 2 != 0){
            throw new IllegalArgumentException(number + " is odd ");
        }
    }
}
