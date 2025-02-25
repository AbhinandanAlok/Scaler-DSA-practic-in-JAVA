package matrix;
import java.util.*;
public class all_diagonal_element {
    public static void main(String[] args) {
        int [][]arr = {{1,2,3,4},{5,6,7,8,},{9,10,11,12}};
        int  p= arr.length;
        int i = 0 ;
        int I;
        int J;
        int q= arr[i].length;
        for(int j=0;j<q;j++){
            I=0;
            J=j;
            while(I<p && J>=0){
                System.out.println(arr[I][J]);
                I++;
                J--;;
            }
            System.out.println(" ");
        }
        int j=0;
        for(i=1;i<p;i++){
            I=i;
            J=q-1;
            while(I<p && J>=0){
                System.out.println(arr[I][J]);
                I++;
                J--;
            }
            System.out.println(" ");
        }

    }

}
