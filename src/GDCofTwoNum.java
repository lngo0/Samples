public class GDCofTwoNum {
    public static void main(String[] args) {

        // Find GCD (Greatest Common Divisor) or Highest Common Factor (HCF) between n1 and n2
        int n1 = 81, n2 = 153;

        // Initially set to gcd
        int gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; ++i) {

            // check if i perfectly divides both n1 and n2
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }
        /*
         * Using while loop
         *     int n1 = 81, n2 = 153;
         *     while(n1 != n2) {
         *       if(n1 > n2) {
         *         n1 -= n2;
         *       }
         *       else {
         *         n2 -= n1;
         *       }
         *     }
         */

        /* positive and negative numbers
         * int n1 = 81, n2 = -153;
         *     // Always set to positive
         *     n1 = ( n1 > 0) ? n1 : -n1;
         *     n2 = ( n2 > 0) ? n2 : -n2;
         *
         *     while(n1 != n2) {
         *
         *       if(n1 > n2) {
         *         n1 -= n2;
         *       }
         *
         *       else {
         *         n2 -= n1;
         *       }
         *     }
         */

        System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
    }
}
