package matrix;
import java.util.*;

public class rotate90_degree {
    public static void main(String[] args){
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int rows = arr.length;
        int cols = arr[0].length;

        // Step 1: Transpose the matrix
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = arr[i][j];
            }
        }

        // Step 2: Reverse each row to complete the 90-degree rotation
        for (int i = 0; i < cols; i++) {
            reverseRow(transposed[i]);
        }

        // Output the rotated matrix
        System.out.println("90-degree Rotated Matrix:");
        for (int[] row : transposed) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Helper method to reverse an array (row)
    private static void reverseRow(int[] row) {
        int left = 0, right = row.length - 1;
        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
        }
    }


