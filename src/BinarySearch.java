import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
    static int binarySearch(List<Integer> list, int val) {
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numList.add(sc.nextInt());
        }
        sc.close();

        if (binarySearch(numList, 8) != -1) {
            System.out.println("Found number.");
        } else {
            System.out.println("Number not found.");
        }
    }
}
