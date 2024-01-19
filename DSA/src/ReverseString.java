public class ReverseString {

    public static void main(String[] args) {
        String str = "komal";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println("i: " + i + "Char: " + str.charAt(i));
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reversed String: " + reverse);
    }
}
