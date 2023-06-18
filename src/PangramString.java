import java.util.HashSet;

public class PangramString {
    public static void main(String[] args) {
        //Example string
        String inputStr = "Joack nymphs waqf drug vex blitz";
        //Remove all whitespace to convert str to just characters
        inputStr = inputStr.toLowerCase().replaceAll("\\s", "");
        //HashSet only hold unique value
        HashSet<Character> characterHashSet = new HashSet<>();
        boolean isPangram = false;
        for (char c : inputStr.toCharArray()) {
            characterHashSet.add(c);
        }

        if (characterHashSet.size() == 26) {
            isPangram = true;
        }

        System.out.println(isPangram);
    }
}
