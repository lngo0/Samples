import java.math.BigInteger;

public class CheckPrimeNum {
    public static void main(String[] args) {

        int num = 29;
        boolean flag = isPrimeOld(num);

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
    static boolean isPrimeOld(int num) {
        for (int i = 2; i <= num / 2; ++i) {
            // Check for a non-prime number
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
    static boolean isPrimeOneLine(int num) {
        return BigInteger.valueOf(num).isProbablePrime(1);
    }
}
