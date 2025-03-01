package matrix;
import java.util.*;
public class frequency_in_array {
    public static void main(String[] args){
      int [] arr = {2,3,2,3,5};
       int n = arr.length;
        int count = 0;
         int i =0;
         int x=0;
       for( i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    x=arr[i];
                    System.out.print(x+" ");
                    count++;
                    System.out.print(count+" ");

                }
                

            }

         }

    }
}
