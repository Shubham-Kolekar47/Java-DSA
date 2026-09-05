import java.util.*;
public class exp44 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int a = sc.nextInt();
        System.out.println("enter the operator");
        char ch = sc.next().charAt(0);
        System.out.println("enter a number : ");
        int b = sc.nextInt();
        System.out.println("you answer" );
        switch(ch){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("nothing");
        }


    }
}
