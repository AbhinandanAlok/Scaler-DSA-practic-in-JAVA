package matrix;
import java.util.*;
public class RL_diagonal_element {
    public static void main(String[] args){
        int [][] arr = {{3,8,9},{1,2,3},{4,2,4}};
        int n = arr.length;
        int i=0;
        int j=n-1;
        System.out.println("the diagonal element of the square matrix from left to right is ");
        while(i<n && j>=0){
                    System.out.print(arr[i][j]+" ");
                    i++;
                    j--;

                }
            }

        }

