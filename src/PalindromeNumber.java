import java.util.Scanner;

public class PalindromeNumber {

    static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int number = x;
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return x == reverse;
    }

    static boolean isPalindromeOneLine(int x) {
        return String.valueOf(x).contentEquals(new StringBuilder(String.valueOf(x)).reverse());
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.println("Is "+ x +" palindrome: " + isPalindrome(x));
        System.out.println("Is "+ x +" palindrome 1 line: " + isPalindromeOneLine(x));
    }
}
