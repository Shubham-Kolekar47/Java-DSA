import java.util.*;
public class exp111{//it means it takes time complexity of big o of n cube
    public static void maxsumsubarray(int numbers[]) {
        int max= Integer.MIN_VALUE;
        int sumcurr=0;

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                sumcurr=0;
                for(int k=start;k<=end;k++){
                    sumcurr += numbers[k];
                }
                System.out.println( sumcurr);
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
