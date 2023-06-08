import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        int startScan, index, minIndex, minValue;
        //Start from first index to next-to-last index
        for (startScan = 0; startScan < (array.length - 1); startScan++) {
            minIndex = startScan;
            minValue = array[startScan];
            //Compare with element from start index + 1 to last index
            for (index = startScan + 1; index < array.length; index++) {
                if (array[index] < minValue) {
                    minValue = array[index];
                    minIndex = index;
                }
            }
            //Swap minIndex with startIndex and so on
            array[minIndex] = array[startScan];
            array[startScan] = minValue;
        }
    }
    public static void main(String[] args) {
        int[] intArr = {8, 6, 3, 2, 7, 1};
        System.out.println("Start Array: " + Arrays.toString(intArr));

        selectionSort(intArr);
        System.out.println("Sorted Array: " + Arrays.toString(intArr));
    }
}
