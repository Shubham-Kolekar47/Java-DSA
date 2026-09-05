import java.util.*;
public class exp119{
    public static void printarr(int arr[]) {                     
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        
    }
    System.out.println();
}
    public static void insertionSort(int arr[]){
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
        int arr[]= {5,4,1,3,2};
        insertionSort(arr);
        printarr(arr);
    }
}
