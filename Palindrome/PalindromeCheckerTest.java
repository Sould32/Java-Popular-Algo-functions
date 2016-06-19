/**
 * 
 */
package recursion;

import student.TestCase;

/**
 * @author Souleymane
 * @version 10/09/2015
 */
public class PalindromeCheckerTest extends TestCase {

    /**
     * (non-Javadoc)
     * 
     * @see student.TestCase#setUp()
     */
    public void setUp() {
        new PalindromeChecker();
        new PalindromeChecker();
    }

    /**
     * sdfdfvd
     */
    public void testPalandrome() {
        assertTrue(PalindromeChecker.isPalindrome("Anna"));
        assertFalse(PalindromeChecker.isPalindrome("onna"));
        assertTrue(PalindromeChecker.isPalindrome(""));
        assertTrue(PalindromeChecker.isPalindrome("A"));
        assertFalse(PalindromeChecker.isPalindrome("Anfgna"));
        assertFalse(PalindromeChecker.isPalindrome("Tnna"));
        assertTrue(PalindromeChecker.isPalindrome("aba"));
    }

    /**
     * sdfdvfdv
     */
    public void testPalandromeSent() {
        String str = "Go" + " hang " + "a salami, I’m a lasagna hog.";
        assertTrue(PalindromeChecker.isPalindrome(str));
        String a = "A " + "Toyota! Race fast, safe car. A Toyota.";
        assertTrue(PalindromeChecker.isPalindrome(a));
        String b = "“Tie" + " Mandie,” I’d name it.";
        assertTrue(PalindromeChecker.isPalindrome(b));
        assertTrue(PalindromeChecker.isPalindrome("Wonton? Not now."));
    }
}
