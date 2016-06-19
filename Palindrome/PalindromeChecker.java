/**
 * 
 */
package recursion;

/**
 * @author Souleymane
 * @version 10/09/2015
 */
public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        str = cleanString(str);
        if (str.length() <= 1) {
            return true;
        }
        else if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        }
        else {
            return false;
        }
       
    }

  
    private static String cleanString(String str) {
        str = str.replaceAll("[^a-z]+", "");
        return str;
    }

}
