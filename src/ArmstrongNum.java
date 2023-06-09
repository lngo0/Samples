public class ArmstrongNum {
    public static void main(String args[])
    {
        int number = 370, num2 = 1634;
        System.out.println("Is " + number +" Armstrong number: " + isArmstrong(number));
        System.out.println("Is " + num2 +" Armstrong number: " + isArmstrong(num2));
    }

    static boolean isArmstrong(int number) {
        int originalNumber, remainder, digit, result = 0;
        originalNumber = number;
        //Easy way or use loop:  for (;originalNumber != 0; originalNumber /= 10, ++n)
        digit = String.valueOf(number).length();

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, digit);
            originalNumber /= 10;
        }

        return result == number;
    }
}
