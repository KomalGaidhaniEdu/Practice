public class PrimeNumber {

    public static void main(String[] args) {
        boolean isPrime = isPrime(444243);
        if (isPrime) System.out.println("Number is prime");
        else System.out.println("Number is not prime");
    }

    private static boolean isPrime(int num) {
        return num % 2 == 0;
    }

}