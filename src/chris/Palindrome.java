package chris;

public class Palindrome {

    public boolean isPalindrome(String stringToTest) {

        StringBuilder builder = new StringBuilder(stringToTest);

        String reverseString = builder.reverse().toString();


        if(stringToTest.equals(reverseString)) {
            return true;
        } else {
            return false;
        }
    }
}
