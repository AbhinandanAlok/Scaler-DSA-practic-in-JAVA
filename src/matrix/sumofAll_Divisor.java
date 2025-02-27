package matrix;

public class sumofAll_Divisor {
    public static void main(String[] args){
        int n =5;
        int sum=0;
        for(int j=1;j<=n;j++){
            for(int i=1;i<=n;i++){
                if(j%i==0){
                    sum=sum+i;
                }
            }
        }
        System.out.print(sum+" ");
        }
}
