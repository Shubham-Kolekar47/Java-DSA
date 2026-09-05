import java.util.*;//binary numbres to decimal and vica-versa
public class exp81 {
    public static void binTodec(int n) {
        int myNum=n;
        int pow=0;
        int dec=0;
        while(n >0){
            int lastdig = n % 10;
            dec = dec + (lastdig * (int)Math.pow(2, pow)); 
            pow ++;
            n =n / 10;

        }
        System.out.println("decimal of" + myNum + "=" +dec);
        
    }
    public static void main(String[] args) {
        binTodec(101);
        
    }
    
}
