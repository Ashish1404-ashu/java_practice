public class jjj {
    public static void main(String[] args) {

        int n = 121;
        int original = n;   // store original number
        int rev = 0;

        while (n != 0) {
            int digit = n % 10;      
            rev = rev * 10 + digit;  
            n = n / 10;              
        }

        if (original == rev) {   // compare with original
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

}
