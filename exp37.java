import java.util.*;//conditional statements (else-if statement)
public class exp37 {
    public static void main(String[] args){
        int a = 1,b = 3,c = 6;

        if((a>b) && (a>c)){
            System.out.println("a is the greatest");
        }
        else if((b>a) && (b>c)){
            System.out.println("b is the greatest");
        }
        else{
            System.out.println("c is the greatest");
        }
    }
}