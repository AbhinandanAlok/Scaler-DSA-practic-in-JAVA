package Array_in_JAVA;
import java.util.*;
public class sum_of_even_indices {
    public static void main(String[] args){
        int [] arr= {3,-2,4,6,-3,5};
        int n=arr.length;
        int sum=0;
        int od=0;
        System.out.println(" the prifix  sum of the enven indices are :  ");
        for(int i=0;i<n;i++){
            if(i%2==0){
                sum=sum+arr[i];
                System.out.print(sum+" ");
            }else if(i%2!=0){
                od=od+arr[i-1];
                System.out.print(od+" ");
            }
        }
    }
}
