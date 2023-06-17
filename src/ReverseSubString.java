import java.util.Scanner;

public class ReverseSubString {
    public static void main(String[] args) {
        //Don't alter anything here.
        Scanner inp = new Scanner(System.in);
        String S = inp.nextLine();
        int L = inp.nextInt();
        inp.nextLine();
        int R = inp.nextInt();
        inp.nextLine();
        inp.close();

        System.out.println(solve(S,L,R));
    }
    public static String solve(String s, int L, int R) {
        StringBuffer stringBuffer = new StringBuffer(s);
        stringBuffer.reverse();
        return stringBuffer.substring(L, L + R);
    }
}
