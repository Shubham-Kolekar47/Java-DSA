import java.util.*;
public class exp68 {
    public static void hello(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        return;
    }
    public static void addition(int a,int b){
        
        int sum = a+b;
        System.out.println("sum is : "+ sum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        addition(a, b);
    }
    
}