import java.util.*;
public class exp82{
    public static void decTobin(int decNum ) {
        int bin = 0;
        int pow = 0;
        int myNum = decNum;
        while(decNum >0){
            int rem = decNum % 2;
            bin = bin + (int)(rem *Math.pow(10,pow));
            pow ++;
            decNum = decNum/2;
            }
            System.out.println("binary of "+ myNum  + "=" + bin);

        }
    
    public static void main(String[] args) {
        decTobin(4);
        
    }
}