
    import java.util.Scanner;

public class PushZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int[] arr = new int[n];
        int nonZeroIndex = 0;

        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            if (element != 0) {
                arr[nonZeroIndex] = element;
                nonZeroIndex++;
            }
        }

       
        for (int i = nonZeroIndex; i < n; i++) {
            arr[i] = 0;
        }

        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}