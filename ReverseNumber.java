public class ReverseNumber {

    public static void main(String[] args) {

        int n = 204;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;        // get last digit
            rev = rev * 10 + digit;    // build reverse number
            n = n / 10;                // remove last digit
        }

        System.out.println("Reversed number is: " + rev);
    }
}
