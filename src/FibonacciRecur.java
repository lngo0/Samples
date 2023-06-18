public class FibonacciRecur {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series: ");
        //Printing the first two values
        System.out.print("0 1 ");

        //Calling Method to print the fibonacci for length 10
        printFibonacci(0, 1, 10);

        /**
         *         InputStreamReader obj=new InputStreamReader(System.in);
         *         BufferedReader br=new BufferedReader(obj);
         *         System.out.println("enter last number");
         *         int n=Integer.parseInt(br.readLine());
         *         Demo ob=new Demo();
         *         System.out.println("fibonacci series is as follows");
         *         int res=0;
         *         for(int i=1;i<=n;i++) {
         *             res=ob.fib(i);
         *             System.out.println(" "+res);
         *         }
         *         System.out.println();
         *         System.out.println(n+"th value of the series is "+res);
         */
        int n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }
    public static void printFibonacci(int val_1, int val_2, int num){
        //Base Case
        if (num == 0) {
            return;
        }
        //Printing the next Fibonacci number
        System.out.print( val_1 + val_2 + " ");
        //Recursively calling for printing Fibonacci for remaining length
        printFibonacci(val_2, val_1+val_2, --num);
    }

    int fib(int n) {
        if (n==1)
            return (1);
        else if(n==2)
            return (1);
        else
            return (fib(n-1)+fib(n-2));
    }
}
