import java.util.*;
public class exp105 {
    public static int largest(int numbers[]){
        int larg = Integer.MIN_VALUE;// -infinity
        int small = Integer.MAX_VALUE;//+ Infinity
        for (int i=0;i<numbers.length;i++){
            if (larg < numbers[i]){
                larg = numbers[i];
            }
            if(small > numbers[i]){
                small = numbers[i];
            }
        }
        System.out.println("smallest value is : "+ small);
        return larg;

    }
    public static void main(String[] args) {
        int numbers[]={1,2,6,3,5};
        int index1 = largest(numbers);
        System.out.println("largest number is : " + index1);
       

    }
    
}
