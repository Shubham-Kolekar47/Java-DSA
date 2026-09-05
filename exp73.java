import java.util.*;//product of 2 numbers
public class exp73{
    public static int prod(int a , int b) {
        int product = a * b ;
        System.out.println("product is : " +product);
        return product;
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("entr the value");
        int a = sc.nextInt();
        System.out.println("entr the value");
        int b = sc.nextInt();
        
        prod(a,b);
    }
}
