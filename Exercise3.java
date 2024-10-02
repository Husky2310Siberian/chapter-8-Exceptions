package gr.aueb.cf.Exercises_Exceptions;

/**
 * SECOND WAY
 * method takes an integer as a parameter and
 * throws an exception if the number is odd
 */
public class Exercise3 {

    public static void main(String[] args) {

        int n = 18;
        trynumber (n);

        n = 7;
        trynumber (n);
    }

    private static void trynumber(int n) {

        try {
            if( n % 2 == 0) {
                System.out.println(n + " is even");
            } else System.out.println( n + " is odd");
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
