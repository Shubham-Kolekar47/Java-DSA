import java.util.*;
public class exp80{
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for(int i = 2;i<=n-i;i++){
            if(n % i == 0){
                return false;
            }
        }
        return isPrime;
        
    }
    public static void prime(int n) {
        
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        
        prime(20);
        
    }
}
