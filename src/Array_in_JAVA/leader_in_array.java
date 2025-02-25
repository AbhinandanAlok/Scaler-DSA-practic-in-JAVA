package Array_in_JAVA;
import java.util.*;
public class leader_in_array {
    public static void main(String[] args){
          int [] arr = {16,17,4,3,5,2};
            int n = arr.length;
            int maxright = arr[n-1];
            System.out.print(maxright+" ");
            for(int i=n-2;i>=0;i--){
                if(arr[i]>maxright){
                  maxright = arr[i];
                    System.out.print( maxright+" ");
                }

            }
    }

}
