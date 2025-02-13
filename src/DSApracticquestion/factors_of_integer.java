package DSApracticquestion;

 import java.util.Scanner;
public class factors_of_integer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  number n : ");
        int n = sc.nextInt();
        int c =0;
          double y = Math.sqrt(n);
        System.out.println("the factor of "+n+" are : ");
        for(int i=1;i<=y;i++){
            if(n%i==0){
                c=c+1;
                System.out.print(" "+i);
            }else{
                c=c+2;
            }
        }
        System.out.println("the count of the facor are : ");
        System.out.println(c);
       sc.close();
    }
}
