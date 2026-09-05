import java.util.*;
public class exp112{//here time complexity is bigo of n square and in previous problem the time complexity was 
// big 0 of n cube which means it takes more time
    public static void maxsumsubarray(int numbers[]) {
        int max= Integer.MIN_VALUE;
        int sumcurr=0;
        int prefix[] = new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i=1;i<prefix.length; i++){
            prefix[i]=prefix[i-1]+ numbers[i];
        }

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                sumcurr=start==0 ? prefix[end]:prefix[end]-prefix[start-1];
                // for(int k=start;k<=end;k++){
                //     sumcurr += numbers[k];
                // }
              
                if(max < sumcurr){
                    max = sumcurr;

                }
            }
        }
        System.out.println("max sum " + max);
        
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        maxsumsubarray(numbers);
        
    }
}
