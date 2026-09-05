import java.util.*;
public class exp113{//this is kadane's algorithm with much less time complexity than previous problem
//kadanes algorithm basically says that the sum of a big + number and a small -ve number will be +ve but if we 
// add a big -ve number and a small +ve number then the sum will be -ve and he says that if we have to get the max
//  number then why to consider the -ve number so he says when a -ve number arrives in our array then just ignore 
// it and add the next number to the max column but if the sum is greater than the -ve number then u can add it  
//exmaple:take array:-2,-3,4,-1,-2,1,5,-3
// curr:0,0,4,3,1,2,7,4
//  max:0,0,4,4,4,4,7,7
    public static void kadanes(int numbers[]) {
        int max= Integer.MIN_VALUE;
        int sumcurr=0;
        for(int i=0;i<numbers.length;i++){
            sumcurr=sumcurr+numbers[i];
            if(sumcurr<0){
                sumcurr=0;  
            }
            max=Math.max(sumcurr,max); 
        }
        System.out.println("the max sum is:" + max);
    }
    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
        
    }
}
