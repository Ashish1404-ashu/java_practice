import java.util.*;

public class darray {
    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner Sc = new Scanner(System.in);
        for (int i=0; i<n;i++){
            for (int j=0; j<m; j++){
                matrix[i][j] = Sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
           for(int j=0; j<m; j++){
            System.out.print(matrix[i][j] +" ");

        }
        System.out.println();

       }
    
    }
}