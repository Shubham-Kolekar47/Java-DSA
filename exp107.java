import java.util.*;//solved again for practice
public class exp107{
    public static int binary(int numbers[],int key) {
        int low = 0;
        int  high = numbers.length-1;
        while(low<=high){
            int mid = (high+low)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
               
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};
        int key = 10;

        System.out.println(binary(numbers,key));
        
    }
}
