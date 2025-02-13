package DSApracticquestion;
import java.sql.SQLOutput;
import java.util.Scanner;
public class sum_of_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int  n  = sc.nextInt();
        System.out.println(" enter the number n :");
        int sum =0;
        for(int i=1;i<=n;i++){
             sum=sum+i;
        }
        System.out.println("the sum of the number "+n+"are:");
        System.out.println(sum);
     sc.close();
    }
}
