import java.util.*;
public class exp69 {
    public static void hello(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        return;
    }
    public static int addition(int num1,int num2){// parameters or formal parameters
        
        int sum = num1+num2;// this sum variable and the one written in the below function are not equal cause they are written in the different functions
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = addition(a,b);//these values passed are called arguments or actual parameters
        System.out.println("sum is : "+ sum);
        addition(a, b);
    }
    
}
