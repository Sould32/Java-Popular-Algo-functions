/**
 * 
 */
package recursion;

import student.TestCase;

/**
 * @author Souleymane
 * @version 10/09/2015
 */
public class ReverseStringGeneratorTest extends TestCase {


    /**
     * (non-Javadoc)
     * jkj
     * @see student.TestCase#setUp()
     */
 
    public void setUp() {
        @SuppressWarnings("unused")
        ReverseStringGenerator  string1 = new ReverseStringGenerator();
        string1 = new ReverseStringGenerator();
    }

    
    public void testReverseString() {
        assertEquals("olleH", ReverseStringGenerator.reverse("Hello"));
    }

    
    public void testReverseNewString() {
        assertEquals("avaJ", ReverseStringGenerator.reverse("Java"));
    }

   
    public void testReverseAgainString() {
        assertEquals("dlroW", ReverseStringGenerator.reverse("World"));
    }
}
