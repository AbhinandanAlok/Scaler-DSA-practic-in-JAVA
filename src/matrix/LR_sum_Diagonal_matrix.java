package matrix;
import java.util.*;
public class LR_sum_Diagonal_matrix {
    public static void main(String[] args){
        int [][] arr = {{3,8,9},{1,2,3},{4,2,4}};
        int n=arr.length;
        int i=0;
        int x=0;
        int p=arr[i].length;
        System.out.println("the diagonal element of the square matrix is ");
        for( i=0;i<n;i++){
            for(int j=0;j<p;j++){
                if(arr[i]==arr[j]){
                     x=arr[i][j];
                    System.out.println(x+" ");
                }
            }

        }

    }

}
