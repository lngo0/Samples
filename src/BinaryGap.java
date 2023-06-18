
/**
 *
 *  A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N
 *  9 has binary representation 1011 -> binary gap of length 2
 *  20 -> 10100 -> binary gap len of 1
 *  15 -> 11111 -> binary gap len of 0
 *  32 - > 100000 -> NO binary gap => in this case should return 0
 *  529 -> 1000010001 -> two binary gaps of len 4 and 3 => in this case should return the longest gap 4
 *  1041 -> 10000010001 -> two binary gaps of len 5 and 3 => in this case should return the longest gap 5
 *  Constraint: 1 <= n <= 2147486647 (integer range)
 */
public class BinaryGap {
    private static int findLongestBinaryGap(int n) {
        String binaryStr = Integer.toBinaryString(n);
        System.out.println(binaryStr);

        int count = 0;
        int binaryGap = 0;

        for (int i = 0; i < binaryStr.length(); i++) {
            String subStr = binaryStr.substring(i, i + 1);
            if (subStr.equalsIgnoreCase("1")) {
                binaryGap = Math.max(binaryGap, count);
                count = 0;
            } else {
                count++;
            }
        }


        return binaryGap;
    }

    public static void main(String[] args) {
        int result = findLongestBinaryGap(1041);

        System.out.println("Longest Binary Gap: " + result);
    }
}
