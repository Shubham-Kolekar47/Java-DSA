import java.util.*;
public class exp110 {
    public static void subarray(int numbers[]) {
        int ts=0;
        for(int i=0;i<numbers.length;i++){
            int current = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                for(int k=current;k<=end;k++){
                    System.out.println(numbers[k]+" ");
                   
                   
                }
                ts++;
                System.out.println();
        }
        System.out.println();
        }
        System.out.println("total pairs = " + ts );
        
        
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        subarray(numbers);
    }
    
}
