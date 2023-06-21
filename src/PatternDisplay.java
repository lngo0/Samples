public class PatternDisplay {
    public static void main(String[] args) {
        int rows = 5;
        /*
            Figure out the "Pattern"
            1. Number of lines = number of rows = number of times the outer loop will run
            2. Identify for every row number:
                - How many columns are there
                - Type of elements in column
            3. What do you need to print: star, number
               for (int row = 1; row <= n; row++) {
                    //For every row, run the col
                    for (int col = 1; col <= row; col++) {

                    }
               }
               - Try to find the formula relating row & col
         */
//        halfPyramidStar(rows);

//        halfPyramidNum(rows);

//        halfPyramidNum2(rows);

        halfPyramidNum3(rows);

    }

    private static void emptyLine() {
        System.out.println();
    }

    /*
    Half pyramid Star pattern
                 *
                 * *
                 * * *
                 * * * *
                 * * * * *
     */
    private static void halfPyramidStar(int n) {
        for (int i = 1; i <= n; ++i) {
            for (int col = 1; col <= i; ++col) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    Half pyramid Number pattern
                1
                1 2
                1 2 3
                1 2 3 4
                1 2 3 4 5
     */
    private static void halfPyramidNum(int n) {
        for (int row = 1; row <= n; ++row) {
            for (int col = 1; col <= row; ++col) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    /*
    Half pyramid Number pattern
                1
                2 2
                3 3 3
                4 4 4 4
                5 5 5 5 5
     */
    private static void halfPyramidNum2(int n) {
        for (int row = 0; row < n; ++row) {
            for (int col = 0; col < row; ++col) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    /*
    Half pyramid Number pattern
                1
                0 1
                1 0 1
                0 1 0 1
                1 0 1 0 1
     */
    private static void halfPyramidNum3(int n) {
        for (int row = 0; row < n; row++) {
            int num = row % 2 == 0 ? 0 : 1;
            for (int col = 0; col < row; col++) {
                System.out.print(num + " ");
                num = 1 - num;
            }
            System.out.println();
        }
    }
}
