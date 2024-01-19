public class ReverseString {

    public static void main(String[] args) {
        String str = "komal";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println("i: " + i + "Char: " + str.charAt(i));
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reversed String: " + reverse);
        System.out.println("Reversed String: " + reverseStringWithStringBuilder("Java"));
        System.out.println("Reversed String: " + reverseStringWithStringBuilderWithBuiltInReverseFunction("GeeksForGeeks"));
    }

    public static String reverseStringWithStringBuilder(String str) {
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println("i: " + i + "Char: " + str.charAt(i));
            reverse.append(str.charAt(i));
        }
        return reverse.toString();
    }

    public static String reverseStringWithStringBuilderWithBuiltInReverseFunction(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }
}
