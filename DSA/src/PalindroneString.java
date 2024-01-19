public class PalindroneString {

    public static void main(String[] args) {
        isPalindrome("madam");
        isPalindrome("komal");
        isPalindrome("racecar");
    }

    private static void isPalindrome(String string) {
        //Reverse the String
        //If str and reverse is equal --> palindrome
        if (string.equals(reverseStringWithStringBuilder(string)))
            System.out.println(string + " is Palindrome");
        else System.out.println(string + " is Not Palindrome");
    }

    public static String reverseStringWithStringBuilder(String str) {
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        return reverse.toString();
    }

    public static String reverseStringWithStringBuilderWithBuiltInReverseFunction(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }
}
