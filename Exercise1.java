package gr.aueb.cf.Exercises_Exceptions;

/**
 * exception for div
 */
public class Exercise1 {
    /**
     * use try catch
     * @param args
     */
    public static void main(String[] args) {

        try{
            int result = divideNumbers(5,0);
            System.out.println("result is : " +result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Error " + e.getMessage());
        }
    }

    /**
     * method throws an exception
     * @param divided
     * @param divisor can not be zero
     * @return the result of div between two numbers
     */
    public static int divideNumbers (int divided, int divisor){
        if ( divisor == 0) {
            throw new ArithmeticException("divisor can not be zero");
        }
        return divided/divisor;
    }
}
