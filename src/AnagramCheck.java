import java.util.Arrays;
import java.util.HashMap;

public class AnagramCheck {
    public static void main(String[] args) {
        boolean isAnagram = anagramCheck("now", "own");
        System.out.println("" + isAnagram);
    }
    //using sort() and equals() method:
    static boolean anagramCheck(String first, String second) {
        //Remove whitespace
        first = first.replaceAll("\\s", "");
        second = second.replaceAll("\\s", "");

        if (first.length() != second.length()) {
            return false;
        }

        char[] firstArr = first.toCharArray();
        char[] secondArr = second.toCharArray();
        Arrays.sort(firstArr);
        Arrays.sort(secondArr);
        return Arrays.equals(firstArr, secondArr);
    }
    //Using Iterative  method
    static boolean  isAnagram(String first, String second) {
        // remove all whitespaces and convert strings to lowercase
        first  = first.replaceAll("\\s", "").toLowerCase();
        second = second.replaceAll("\\s", "").toLowerCase();

  /* check whether string lengths are equal or not,
     if unequal then not anagram */
        if (first.length() != second.length()) {
            return false;
        }

        // convert first string to char array
        char[] firstArray = first.toCharArray();
        // check whether each character of firstArray is present in second string
        for (char c : firstArray)
        {
            int index = second.indexOf(c);
            // indexOf function returns -1 if the character is not found
            if (index == -1)
                return false;
            // if character is present in second string, remove that character from second string
            second  = second.substring(0,index) + second.substring(index+1);
        }
        return true;
    }

}
