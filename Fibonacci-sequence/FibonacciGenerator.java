/**
 * 
 */
package recursion;

/**
 * @author Souleymane
 * @version 10/09/2015
 */
public class FibonacciGenerator {

    static int[] array;
 
    static int arrayLength;

    
    public static int fib(int n) {
        array = new int[n + 1];
        array[0] = 0;
        array[1] = 1; // stores the 0th and 1st Fibonacci numbers
        arrayLength = 2;
        return (sequence(n));
    }

  
    private static int sequence(int n) {
        if (n < arrayLength) {
            return array[n];
        }
        else {
            array[n] = sequence(n - 1) + sequence(n - 2);
            arrayLength++;
            return array[n];
        }
    }

}
