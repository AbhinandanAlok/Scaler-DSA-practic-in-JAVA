package matrix;
import java.util.*;

import static java.util.Collections.swap;

public class transpose_matrix {
    public static void main(String[] args){
        int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = arr[i][j];
            }
        }
        System.out.println("Transposed Matrix:");
        for (int[] row : transposed) {
            System.out.println(Arrays.toString(row));
        }

    }

}
