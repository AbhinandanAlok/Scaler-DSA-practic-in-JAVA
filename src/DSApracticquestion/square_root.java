package DSApracticquestion;
import java.util.Scanner;
public class square_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println(" enter the number  : n ");
        int n = sc.nextInt();
        System.out.println("the square root of "+ n +" is ");
        for(int i=1;i<=n;i++){
            if(i*i==n){
                System.out.println(i);
            }
        }
        sc.close();
    }
}

