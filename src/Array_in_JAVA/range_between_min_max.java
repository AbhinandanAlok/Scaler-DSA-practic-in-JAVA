package Array_in_JAVA;

public class range_between_min_max {
    public static void main(String[] args){
        int [] arr = {1,6,3,2,4,1,4,5,6,3,4,6,1};
        int n = arr.length;
        int minVal =Integer.MAX_VALUE;
        int maxVal=Integer.MIN_VALUE;
        for(int num:arr){
            if(num<minVal) minVal =num;
            if(num>maxVal) maxVal =num;
        }
        int minIndex=-1;
        int maxIndex=-1;
        int ansl = n;
        if(maxVal==minVal){
            System.out.println(1);
        }
            for(int i=n-1;i>=0;i--){
                if(arr[i]==minVal){
                    minIndex=i;
                    if(maxIndex!=-1){
                        ansl=Math.min(ansl,maxIndex-minIndex+1);
                    }
                }
                if(arr[i]==maxVal){
                    maxIndex=i;
                    if(minIndex!=-1){
                        ansl = Math.min(ansl,minIndex-maxIndex+1);
                    }
                }

            }
            System.out.println(" the smallest subarray containing both small and large element  is "+ansl);
        }

    }

