import java.util.Scanner;

public class IsSumOfTwoPrime {
    // Method to Check Prime Number
    private static int check_prime(int num){
        int flag = 0;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                flag = 1;
                return 1;
            }
        }
        return 0;
    }
    // Method to get print the prime sum
    private static void find (int num) {
        for (int i = 2; i <= num/2; i++) {
            if (check_prime(i) == 0) {
                if (check_prime(num-i) == 0)
                    System.out.println(num + " = "+ (num-i) + " "+ i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        find(n);
        sc.close();
    }
}
