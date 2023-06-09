public class BinarySearch {
    static int binarySearch(int[] arr, int val) {
        int first = 0,
                last = arr.length - 1,
                middle,
                position = -1;
        boolean found = false;

        while (!found && first <= last) {
            middle = (first + last)/2;
            if (arr[middle] == val) {
                found = true;       //value at middle
                position = middle;
            } else if (arr[middle] > val) {
                last = middle - 1; // value is in lower half
            } else {
                first = middle + 1;  // value is in upper half
            }
        }
        return position;
    }
    public static void main(String[] args) {
        int[] numArr = {1,2,3,4,5,6,7,8,9};
        if (binarySearch(numArr, 8) != -1) {
            System.out.println("Found number.");
        } else {
            System.out.println("Number not found.");
        }
    }
}
