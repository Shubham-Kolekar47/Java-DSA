import java.util.*;
public class exp16 {
    public static void main(String[] args) {
        int a = 25 ; // here but if we put the value of long as 25 and after try to print int then it is not possible
        long b = a;
        System.out.println(b);
        long c = 34;
        int d = c ; // the error occurs because the size of long in java is bigger than int
        System.out.println(d);
   }
}
