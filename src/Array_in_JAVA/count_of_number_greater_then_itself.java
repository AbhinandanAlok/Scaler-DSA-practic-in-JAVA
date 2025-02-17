package Array_in_JAVA;
import java.util.*;
public class count_of_number_greater_then_itself {
    public static void main(String[] args){
        int [] arr = {-3,-2,6,8,4,8,5};
        int n=arr.length;
        int maxC=0;
        int max=1;
        int count;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                if(arr[i]==max){
                    maxC++;
                }
            }else {
                i++;
            }
        }
        count = n-maxC;
        System.out.println(" the greater element of the aaray is  : ");
        System.out.println(max);
        System.out.println(" the numbe os times the maximum element is appear is : ");
        System.out.println(maxC);
        System.out.println(" tthe lenght of the aray  given below : ");
        System.out.println(n);
        System.out.println(" the count of the number greater then the ist self is given below : ");
        System.out.println(count);
    }
}
