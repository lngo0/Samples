import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LCMofTwoNum {
    // class is declared final
    public static void main(String[] args) {
        //Find Less Common Multiple (LCM)
        int n1 = 72, n2 = 120, lcm;

        // maximum number between n1 and n2 is stored in lcm
        lcm = Math.max(n1, n2);

        // Always true
        while(true) {
            if( lcm % n1 == 0 && lcm % n2 == 0 ) {
                System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                break;
            }
            ++lcm;
        }
    }

}
