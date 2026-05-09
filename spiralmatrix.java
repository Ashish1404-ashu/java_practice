public class spiralmatrix {
    public static void PrintSpriral(int matrix[][]){

        int startRow=0;
        int startCol =0;
        int endRow =matrix.length-1;
        int endCol=matrix[0].length-1;

        while (startRow<=endRow && startCol<=endCol){
            for (int j=startCol;j<=endCol;j++){
                System.out.println(matrix[startRow][j]);
            }
            for (int i=startRow;i<=endRow;i++){
                System.out.println(matrix[i][endCol]);
            }
            for (int j=endCol;j>=startCol;j--){
                if(startCol == endCol){
                    return;
                }
                System.out.println(matrix[endCol][j]);
            }
             for (int i=endRow;i>=startRow+1;i--){
                System.out.println(matrix[startCol][i]);
             }
             startCol++;
             startRow++;
             endCol--;
             endRow--;
             
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
  PrintSpriral(matrix);
    
}
}
