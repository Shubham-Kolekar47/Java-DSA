import java.util.*;
public class exp42 {
    public static void main(String args[]){
        int number = 5;// we can also write characters over here by "char ch = 'a';" and giving cases as a,b,s etc
        switch(number){
            case 1 : System.out.println("samosa");
            break;// now here if we dont write break; then even if we enter our choice numbr it will always print all the out comes
            case 2 : System.out.println("burger");
            break;
            case 3 : System.out.println("momo's");// we can also write the numer of cases in any order 
            break;
            default : System.out.println("cold drink");
        }
    }
}
