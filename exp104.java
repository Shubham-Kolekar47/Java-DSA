import java.util.*;
public class exp104 {
    public static int linear(int numbers[] , int key) {
        for(int i=0;i<numbers.length;i++){
            if( numbers[i] == key){
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {//code for seraching an element in an array and also there
    //  is comcept of time complexity and it is said that if a code takes less time for execution then
    //  the code is good else it is bad and non efficient
        int numbers[]={2,4,6,8,10,12,14,16};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the key");
        int key = sc.nextInt();

        int index = linear(numbers , key);
        if( index == -1){
            System.out.println("not found");

        }else{
            System.out.println("kry is at index :" + index);
        }

    }
    
}
