//Write a Java program to find the missing number in an array of integers from 1 to n
public class MissingNumber {
    // Array of integers 1 to n --> cyclic sort

    //Step 1:  sort array
    private static int[] sortArray(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int j = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != i + 1)
                swap(arr, i, j);
            else i++;
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Step 2: Find Missing number --> if arr[index] != index + 1
    private static int findMissingNumber(int[] sortedArray) {
        for (int i = 0; i < sortedArray.length; i++) {
            if (sortedArray[i] != i + 1)
                return i + 1;
        }
        return sortedArray.length;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 2, 1, 7}; // 4 is missing
        int[] sortedArray = sortArray(arr);
        int missingNumber = findMissingNumber(sortedArray);
        System.out.println("Missing Number is " + missingNumber);

        // Finding missing number without cyclic sort
        System.out.println("Missing Number is " + findMissingNumberWithoutCyclicSort(arr));
    }

    private static int findMissingNumberWithoutCyclicSort(int[] arr) {
        int correctSum = (arr.length + 1) * (arr.length + 2) / 2;

        int actualSum = 0;
        for (int num : arr) {
            actualSum = actualSum + num;
        }
        System.out.println("Correct Sum :  " + correctSum);
        System.out.println("Actual Sum :  " + actualSum);
        return correctSum - actualSum;
    }


}