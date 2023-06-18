import java.util.Arrays;

public class BinarySearch2DArray {
    public static void main(String[] args) {
        //Find target in a given array of certain pattern
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 45, 35, 25},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

//        System.out.println(Arrays.toString(simpleSearch(arr, 49)));

        //Find target in a sorted matrix, noted matrix must be 2x2, 3x3, 4x4, 5x5 etc.
        int[][] sortedArr1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int[][] sortedArr2 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
        };
        int[][] sortedArr3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] sortedArr4 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(Arrays.toString(matrixSearch(sortedArr1, 6)));
        System.out.println(Arrays.toString(matrixSearch(sortedArr2, 6)));
        System.out.println(Arrays.toString(matrixSearch(sortedArr3, 6)));
//        System.out.println(Arrays.toString(findElementIn2DArray(sortedArr1, 8)));
//        System.out.println(Arrays.toString(findElementIn2DArray(sortedArr2, 8)));
//        System.out.println(Arrays.toString(findElementIn2DArray(sortedArr3, 8)));
    }

    static int[] simpleSearch(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }
            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }

        return new int[]{-1, -1};
    }

    private static int[] findElementIn2DArray(int[][] arr, int target) {
        int col = (arr.length - 1) / 2;
        int rowStart = 0, rowEnd = arr.length - 1;
        //log N
        //Going through loop until 2 rows are remain
        //While this is true, we still have more than 2 rows
        while (rowStart < rowEnd && rowStart != rowEnd - 1 && rowEnd != rowStart + 1) {
            int mid = (rowStart + rowEnd) / 2;
            if (arr[mid][col] == target)
                return new int[]{mid, col};
            else if (target > arr[mid][col])
                rowStart = mid;
            else
                rowEnd = mid;
        }

        //log N
        //Going through first row
        int[] result = binarySearch2(arr, target, 0, arr.length - 1, rowStart);
        if (Arrays.toString(result).contains("-1")) {
            //log N
            //Unable to find targe on first row, going through second row
            return binarySearch2(arr, target, 0, arr.length - 1, rowEnd);
        } else
            return result;
    }

    public static int[] binarySearch2(int[][] arr, int target, int low, int high, int row) {
        while (low <= high) {
            int mid = (low + high) / 2;

            if (target == arr[row][mid]) {
                return new int[]{row, mid};
            }

            if (target < arr[row][mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }

    //search for the provided row between provide columns
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = (cStart + cEnd) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] matrixSearch(int[][] matrix, int target) {
        int rows = matrix.length,
                cols= matrix[0].length,
                rStart = 0,
                rEnd = rows - 1,
                cMid = cols / 2;

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }


        //Going through loop until 2 rows are remain
        //While this is true, we still have more than 2 rows
        while (rStart < (rEnd - 1)) {
            int rMid = (rStart + rEnd) / 2;

            if (matrix[rMid][cMid] == target) {
                return new int[]{rMid, cMid};
            }

            if (matrix[rMid][cMid] < target) {
                rStart = rMid;
            } else {
                rEnd = rMid;
            }
        }
        //Remaining 2 rows, we will check if the target in is the col of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] < target) {
            return new int[]{rStart+1, cMid};
        }
        //search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        //search in 2nd half
        if (target <= matrix[rStart][cMid + 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols-1, target);
        }

        //search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid-1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols-1, target);
        }
    }
}
