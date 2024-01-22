import java.util.HashMap;

public class Anagrams {

    public static boolean anagrams(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        } else {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < str1.length(); i++) {
                if (map.containsKey(str1.charAt(i)))
                    map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
                else map.put(str1.charAt(i), 1);
            }

            for (int i = 0; i < str2.length(); i++) {
                if (map.containsKey(str2.charAt(i)))
                    map.put(str1.charAt(i), map.get(str1.charAt(i)) - 1);
                else return false;
            }

            for (Character key : map.keySet()) {
                if (map.get(key) != 0)
                    return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(anagrams("listen", "silent"));

    }
}