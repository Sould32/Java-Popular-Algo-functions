/**
 * 
 */
package recursion;

/**
 * @author Souleymane
 * @version 10/09/2015
 */
public class ReverseStringGenerator {

    private static String newString = "";

   
    public static String reverse(String str) {
        int count = str.length();
        String reverse = reverseHelp(count, str);
        newString = "";
        return reverse;
    }

   
    private static String reverseHelp(int count, String str) {
        if (count == 0) {
            return str;
        }
        count--;
        newString += "" + str.charAt(count);
        reverseHelp(count, str);
        str = newString;
        return str;
    }
}
