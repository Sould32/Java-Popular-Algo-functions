/**
 * 
 */
package recursion;

import student.TestCase;

/**
 * @author Souleymane
 * @version 10/09/2015
 */
public class FibonacciGeneratorTest extends TestCase {
    private FibonacciGenerator number;

    /**
     * (non-Javadoc)
     * 
     * @see student.TestCase#setUp()
     */
    public void setUp() {
        number = new FibonacciGenerator();
    }

    /**
     * test the sequence
     */
    public void testFib() {
        FibonacciGenerator.fib(5);
        assertEquals(0, number.array[0]);
        assertEquals(1, number.array[1]);
        assertEquals(1, number.array[2]);
        assertEquals(2, number.array[3]);
        assertEquals(3, number.array[4]);
        assertEquals(5, number.array[5]);
    }
}
