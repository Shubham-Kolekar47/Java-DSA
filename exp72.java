import java.util.*;
public class exp72{//swap code in function
    public static void swap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int a = sc.nextInt();
        System.out.println("enter the value");
        int b =sc.nextInt();

        int temp = a;
        a=b;
        b = temp;
        System.out.println(" 'a' is : " + a);
        System.out.println(" 'b' is : " + b);
        
    }
    public static void main(String[] args) {
        //swap value means exchange  the value of one integer
        swap();

        
    }
}

