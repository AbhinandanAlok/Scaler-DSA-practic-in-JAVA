package matrix;
import java.util.*;
public class max_colum_sum {
        public static void main(String[] args){
            int [][] arr = {{3,8,9,2},{1,2,3,6},{4,2,4,2}};
            int n= arr.length;
            System.out.println(n);
            int greater =0;
            int mx= greater;
             int i=0;
            int p=arr[i].length;
            System.out.println(p);
            for(int j=0;j<p;j++){
                int sumR=0;
                for( i=0;i<n;i++){
                    sumR= sumR+arr[i][j];
                    greater=sumR;
                    mx= Math.max(mx,sumR);
                }
                System.out.println(" sum of  cloum  is  "+(i+1)+" st "+"= "+sumR);
            }
            System.out.println("the greater element of the row is");
            System.out.println(mx);
        }
    }

