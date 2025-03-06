package sorting;
import java.util.*;
public class x_to_power_y {
    public static void main(String[] args){
        double  x = 2;
        int y= -2;
        double ans=2;
        for(int i=0;i<=y;i++){
            while(y!=1){
                ans=ans*x;
                y--;
            }
            System.out.println(ans+" ");
        }


    }
}
