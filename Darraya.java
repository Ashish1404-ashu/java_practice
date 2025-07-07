import java.util.*;

public class Darraya {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int rows = matrix.length, cols = matrix[0].length;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
