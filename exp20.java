import java.util.*;
public class exp20 {
    public static void main(String[] args) {
        int a = 35; // the all values of a, b , c got converted into double a then got added
        float b = 45.74f;
        long c = 4637;
        double ans = a + b + c ;//here if wrote int on the place of double then
        //  will show the error cause int is shortr than the double 
        System.out.println(ans);
    }
}
