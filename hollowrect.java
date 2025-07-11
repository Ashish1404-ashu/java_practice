public class hollowrect {
    public static void main(String[] args) {
        int rows = 5;       // Height of rectangle
        int columns = 10;   // Width of rectangle

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                // Print '*' for first and last row, or first and last column
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}