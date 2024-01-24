public class SwappingNumbers {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap--> a: " + a + " b: " + b);
    }

    public static void main(String[] args) {
        int a = 123;
        int b = 56;
        System.out.println("Before Swap--> a: " + a + " b: " + b);
        swap(a, b);
        swapWithoutTempVariable(a, b);
    }

    private static void swapWithoutTempVariable(int a, int b) {
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("After Swap--> a: " + a + " b: " + b);
    }
}