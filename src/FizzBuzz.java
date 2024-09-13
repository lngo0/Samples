import java.util.Scanner;
import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        //reads an integer from the user
        int num = sc.nextInt();
        //the rangeClosed() method returns a sequential IntStream for the specified range of int elements
        //for-each iterate over the Stream and prints the elements
        IntStream.rangeClosed(1, num).mapToObj(
                i-> i % 3 == 0 ?
                        (i % 5 == 0? "FizzBuzz " : "Fizz "):
                        (i % 5 == 0? "Buzz ": i + " ")
                ).forEach(System.out::print);
        //close the Scanner
        sc.close();
    }
}

