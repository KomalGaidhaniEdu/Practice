public class AllPairsOfSum {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 5, 8, 5, 1, 7, 7, 0};
        printPairs(arr, 10);
    }

    private static void printPairs(int[] arr, int sum) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum)
                    System.out.println(arr[i] + " & " + arr[j]);
            }
        }
    }
}