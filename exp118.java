import java.util.*;
public class exp118 {
    public static void hollow_Rectangle(int totRows,int totCols){
        for(int i=1;i<=totRows;i++){
            for(int j=1;j<=totCols;j++){
                if(i == 1 || i==totRows || j== 1|| j ==totCols){  
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
   public static void main(String args[]){
    hollow_Rectangle(4,5);
    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter a number");
    // int n = sc.nextInt();

    // if (n == 2){
    //     System.out.println("n is prime");
    // }else{
    //     boolean isPrime = true;
    // for(int i=2;i<=Math.sqrt(n10);i++){
    //     if(n%i == 0){
    //         isPrime = false;
    //     }
    // }
    // if(isPrime == true){
    //     System.out.println("number n is prime");
    // }else{
    //     System.out.println("number n is not prime");
    // }
    // }
    
   }
}
