import java.util.HashMap;

public class DuplicateNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 7, 2, 5, 7, 8, 6, 9, 4, 2, 1, 5, 7, 6, 8, 9, 0};
        HashMap<Integer, Integer> map = findDuplicateNumbers(arr);

        System.out.println(map);
    }

    private static HashMap<Integer, Integer> findDuplicateNumbers(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j : arr) {
            if (map.containsKey(j))
                map.put(j, map.get(j) + 1);
            else map.put(j, 1);

        }
        return map;
    }

}