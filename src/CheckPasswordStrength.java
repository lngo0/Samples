import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class CheckPasswordStrength {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        final String strongRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>])(?=\\S+$).{10,25}$";
        final String mediumRegex1 = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,25}$";
        final String mediumRegex2 = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>])(?=\\S+$).{8,25}$";
        while ((line = in.readLine()) != null) {
            System.out.println(line);

            if (line.length() < 6 || line.length() > 25 || line.contains(" ")) {
                System.out.println("Invalid password. Must be between 6 to 25 characters and no white space.");
            } else {
                if (line.matches(strongRegex)) {
                    System.out.println("strong");
                } else if (line.matches(mediumRegex1) || (line.matches(mediumRegex2) && line.length() < 10)) {
                    System.out.println("medium");
                } else {
                    System.out.println("weak");
                }
            }
        }
    }
}