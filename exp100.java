import java.util.*;
public class exp100{
    public static void numTri(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print( " ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = sc.nextInt();
        
        numTri(n);
        
    }
}
