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
f
                    }
               }
               - Try to find the formula relating row & col
         */
//        halfPyramidStar(rows);

//        halfPyramidNum(rows);

//        halfPyramidNum2(rows);

//        halfPyramidNum3(rows);

//        halfPyramidChar(rows);

//        halfPyramidChar2(rows);

//        halfPyramidChar3(rows);

//        invHalfPyramidChar(rows);

//        invHalfPyramidStar(rows);

//        invHalfPyramidNum(rows);

//        invHalfPyramidStar(rows);

//        floydTriangle(rows);

//        invFloydTriangle(rows);

//        fullPyramidStar(rows);

//        invFullPyramidStar(rows);

//        fullPyramidChar(rows);

        halfDiamondStar(rows);

//        fullDiamondStar(rows, col);

//        emptyDiamondOuterStars(rows);

//        bowTieStars(rows);

//        squareStars(rows);

//        fullPyramidNum(rows, count1, count2);

//        fullPyramidNum2(rows);

//        invFullPyramidNum(rows, count1, count2);

//        fullPyramidNum(rows, col, count1, count2);

//        fullDiamondNum2(rows);

//        pascalTriangle(rows, coeff);
//        emptyLine();

//        invFullPascalTriangle(rows, coeff);

//        numSpaceNum(rows);

//        boxOfNumMin(4);

//        boxOfNumMax(4);


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

    /*
    Character triangle pattern
            A
            A B
            A B C
            A B C D
            A B C D E
     */
    private static void halfPyramidChar(int n) {
        for(int row = 0; row < n; row++) {
            for(char ch = 'A'; ch <= 'A' + row; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    /*
    Same Row Same Character triangle pattern
            A
            B B
            C C C
            D D D D
            E E E E E
     */
    private static void halfPyramidChar2(int n) {
        for(int row = 0; row < n; row++) {
            char ch = (char) ('A' + row);
            for(int col = 0; col <= row ; col++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    /*
    Same Row Same Character triangle pattern
            E
            D E
            C D E
            B C D E
            A B C D E
     */
    private static void halfPyramidChar3(int n) {
        for(int row = 0; row < n; row++) {
            for(char ch = (char) ('E' - row); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    /*
    Inverted Character triangle pattern
            A B C D E
            A B C D
            A B C
            A B
            A
     */
    private static void invHalfPyramidChar(int n) {
        for(int row = 0; row < n; row++) {
            for(char ch = 'A'; ch <= 'A' + (n - row - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    /*
    Inverted half pyramid Star pattern
                * * * * *
                * * * *
                * * *
                * *
                *
     */
    private static void invHalfPyramidStar(int n) {
        for (int row = n; row >= 1; --row) {
            for (int col = 1; col <= row; ++col) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    Inverted half pyramid number pattern
                1 2 3 4 5
                1 2 3 4
                1 2 3
                1 2
                1
     */
    private static void invHalfPyramidNum(int n) {
        for (int row = n; row >= 1; --row) {
            for (int col = 1; col <= row; ++col) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    /*
    Floyd triangle pattern
            1
            2 3
            4 5 6
            7 8 9 10
            11 12 13 14 15
     */
    private static void floydTriangle(int n) {
        int floynum = 1;
        for(int row = 1; row <= n; row++) {

            for(int col = 1; col <= row; col++) {
                System.out.print(floynum + " ");
                ++floynum;
            }

            System.out.println();
        }
    }

    /*
    Inverted Floyd triangle pattern
            15 14 13 12 11
            10 9 8 7
            6 5 4
            3 2
            1
     */
    private static void invFloydTriangle(int n) {
        int floynum2 = 15;
        for(int row = n; row >= 1; row--) {

            for(int col = 1; col <= row; col++) {
                System.out.print(floynum2 + " ");
                --floynum2;
            }

            System.out.println();
        }
    }
    /*
    Full pyramid Star pattern
                        *
                      * * *
                    * * * * *
                  * * * * * * *
                * * * * * * * * *
     */
    private static void fullPyramidStar(int n) {
        for (int row = 0; row < n; row++) {
            //space = n - row -1
            for (int space = 0; space < n - row - 1; space++) {
                System.out.print("  ");
            }
            //star = 2*row + 1
            for (int col = 0; col < 2 * row + 1; col++) {
                System.out.print("* ");
            }
            //space - not really needed once you have the star
            for (int space = 0; space < n - row - 1; space++) {
                System.out.print("  ");
            }

            System.out.println();
        }
    }

    /*
    Inverted full pyramid Star pattern
                * * * * * * * * *
                  * * * * * * *
                    * * * * *
                      * * *
                        *
     */
    private static void invFullPyramidStar(int n) {
        for(int row = 0; row < n; row++) {
            //space = row
            for (int space = 0; space < row; space++) {
                System.out.print("  ");
            }
            //Break down First half of column, then Second half of column
//            for (int col = 0; col < row - 1; ++col) {
//                System.out.print("* ");
//            }
//            for (int col = row; col <= 2 * row - 1; ++col) {
//                System.out.print("* ");
//            }
            //Or user this formula 2*n - (2*row + 1)
            for (int col = 0; col < 2*n - (2*row + 1); col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    /*
    Full pyramid Character pattern
                        A
                      A B C
                    A B C D C
                  A B C D E D C
                A B C D E F E D C
     */
    private static void fullPyramidChar(int n) {
        for (int row = 0; row < n; row++) {
            //space = n - row -1
            for (int space = 0; space < (n - row - 1); space++) {
                System.out.print("  ");
            }
            //character = 2*row + 1
            char ch = 'A';
            int breakPoint = (2 * row + 1) / 2;
            for (int col = 0; col < (2 * row + 1); col++) {
                System.out.print(ch + " ");
                if (col <= breakPoint)
                    ch++;
                else
                    ch--;
            }

            System.out.println();
        }
    }

    /*
    Half Diamond Star pattern
                *
                * *
                * * *
                * * * *
                * * * * *
                * * * *
                * * *
                * *
                *
     */
    private static void halfDiamondStar(int n) {
        //Outer loop is 2n-1 with n = 5
        for (int row = 0; row <= 2 * n - 1; row++) {
            int totalColsInRow = row >= n ? (2 * n - row) : row;
            for (int col = 1; col <= totalColsInRow; ++col) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
