public class g {
    
    public static void main(String[] args) {
        int rows = 5; // Number of rows

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Loop to print the stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
