import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        System.out.println("Is "+word+" palindrome? - "+isWordPalindrome(word));
    }


    public static boolean isWordPalindrome(String word){
        String reverseWord = getReverseWord(word);
        //if word equals its reverse, then it is a palindrome
        return word.equals(reverseWord);
    }

    public static String getReverseWord(String word){
        if(word == null || word.isEmpty()){
            return word;
        }

        return word.charAt(word.length()- 1) + getReverseWord(word.substring(0, word.length() - 1));
    }
}
