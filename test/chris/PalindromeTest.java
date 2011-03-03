package chris;

import junit.framework.Assert;
import org.junit.Test;

public class PalindromeTest {

    private Palindrome palindrome = new Palindrome();

    @Test
    public void shouldTestPalindrome() {
       Assert.assertFalse("test failed ", palindrome.isPalindrome("chris"));
       Assert.assertTrue("test failed ", palindrome.isPalindrome("rotator"));
       Assert.assertTrue("test failed ", palindrome.isPalindrome("malayalam"));
       Assert.assertFalse("test failed ", palindrome.isPalindrome("river"));
    }
}
