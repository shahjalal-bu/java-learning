import java.util.Scanner;

public class CheckPrimeNumber {
    public static boolean isPrime(int num) { 
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter range of prime number: ");
        int num = scanner.nextInt();
        int sumResult = 0;
        for (int i = 1; i <= num; i++) {
            boolean isPrimeResult = isPrime(i);
            if (isPrimeResult) {
                sumResult = sumResult + i;
            }

        }
        System.out.println("Sum of prime number " + sumResult);

    }
}