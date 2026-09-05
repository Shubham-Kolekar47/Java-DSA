import java.util.*;
public class exp75{
    public static int fact(int n) {
        int f = 1;
        for(int i=1;i<=n;i++){
            f=f*i;
            
        }

        return f;
    }
    public static int coeff(int n,int r) {// nCr formula calculation
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr= fact(n-r);
        int coeff = fact_n /( fact_r * fact_nmr);
        return coeff;
        
    }
    public static void main(String[] args) {
        System.out.println(coeff(4,3));
        
        
    }
}
