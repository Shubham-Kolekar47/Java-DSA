import java.util.Arrays;
import java.util.Collections;
public class exp121{
    public static void printarr(Integer arr[]) {                     
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        
    }
    System.out.println();
}
    public static void insertionSort(Integer arr[]){
        for(int i=1;i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            //finding the postion to insert the element
            while(prev>=0 && arr[prev]> curr){
                arr[prev+1] = arr[prev];
                prev -- ;
            }
            //inserting the element
            arr[prev+1] = curr;
        }
    }
    public static void main(String args[]){
        Integer arr[]= {5,4,1,3,2};
        // insertionSort(arr);
        Arrays.sort(arr,Collections.reverseOrder());
        // Arrays.sort(arr,0,3);
        printarr(arr);
    }
}