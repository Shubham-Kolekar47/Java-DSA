import java.util.*;
public class exp43 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number = sc.nextInt();
        switch(number){
            case 1 : System.out.println("samosa");
            break;// now here if we dont write break; then even if we enter our choice numbr it will always print all the out comes
            case 2 : System.out.println("burger");
            break;
            case 3 : System.out.println("momo's");
            break;
            default : System.out.println("cold drink");
        }
    }
}

