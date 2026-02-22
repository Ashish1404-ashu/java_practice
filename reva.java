public class reva {

    public static void main(String[] args) {

        int n = 12321;
        int original = n; 
        int rev = 0;

        while (n != 0) {
            int digit = n % 10;        // get last digit
            rev = rev * 10 + digit;    // build reverse number
            n = n / 10;                // remove last digit
        }

       if (original== rev) {
            System.out.println("Palindrome");
        } else {
           System.out.println("not");;
    }
    }
}
