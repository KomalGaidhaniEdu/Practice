import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 4, 5, 6, 6, 6, 6, 7, 7, 8, 8, 8, 9};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && arr[i] == arr[i + 1])
                continue;
            arr[count] = arr[i];
            count++;
        }

        System.out.println(count + " : " + Arrays.toString(arr));
    }
}