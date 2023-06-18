public class FindMissingNum {
    public static int findMissingNum(int[] array) {
        int n = array.length + 1;
        int sumOfFirstNNums = (n * (n+1))/2;
        int actualSumOfArr=0;
        for (int j : array) {
            actualSumOfArr += j;
        }
        return sumOfFirstNNums-actualSumOfArr;
    }
    public static void main(String[] args) {
        //An array of non-duplicating numbers from 1 to n where one number is missing
        int[] array = {4,2,8,6,5,3,7};
        int missingNumber = findMissingNum(array);
        System.out.println("Missing Number: "+ missingNumber);
    }
}
