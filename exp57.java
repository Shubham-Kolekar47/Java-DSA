import java.util.*;// sum in do-while loop
public class exp57{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        do{
            sum = sum + i;
            i++;
        }while(i<=n);
        System.out.println("sum is" + sum);

    }
}
