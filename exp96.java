import java.util.*;
public class exp96{
    public static void butterfly(int n) {
        for(int i=1;i<=n;i++){//1st half of the code
            for(int j=1;j<=i;j++){
                System.out.print("*");//for printing stars
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");//for printing spaces
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");//for printing stars again
            }
            System.out.println();
        }
        
        //2nd half of the code
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");//for printing stars
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");//for printing spaces
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");//for printing stars again
            }
            System.out.println();

        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = sc.nextInt();
        
        butterfly(n);
        
    }
}

