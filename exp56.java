import java.util.*;// doing reverse of given number
public class exp56{
    public static void main(String[] arg){
       /*Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int n = sc.nextInt(); */ 
        int n = 10899;
        int rev = 0;
        while(n>0){
            int lastdigit= n % 10;
            rev = (rev*10)+lastdigit;
            n = n/10;
        }
        System.out.println(rev);


    }
}
