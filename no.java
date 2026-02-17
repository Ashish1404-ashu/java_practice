public class no {

    public static boolean isPalindrome(int num) {

        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;       // get last digit
            reverse = reverse * 10 + digit;
            num = num / 10;             // remove last digit
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        int number = 123;

        if (isPalindrome(number)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}