import java.util.*;
public class exp71{//swap code in function
    public static void swap(int a,int b) {
        int temp = a;
        a=b;
        b = temp;
        System.out.println(" 'a' is : " + a);
        System.out.println(" 'b' is : " + b);
        
    }
    public static void main(String[] args) {
        //swap value means exchange  the value of one integer
        int a = 45;
        int b = 56;
        swap(a,b);

        
    }
}

