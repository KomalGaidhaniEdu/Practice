public class CheckForVowels {

    public static void main(String[] args) {
        boolean isVowelPresent = isVowelPresent("tyhgrwq");
        if (isVowelPresent) System.out.println("Vowel is Present");
        else System.out.println("Vowel is not Present");
    }

    private static boolean isVowelPresent(String string) {
        char[] array = {'a', 'e', 'i', 'o', 'u'};
        char[] chars = string.toLowerCase().toCharArray();
        for (char aChar : chars) {
            for (char c : array) {
                if (aChar == c) return true;
            }
        }
        return false;
    }

}