import java.util.*;// continue statement
public class exp61{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("enter the value :"); //this code will never end wnatever u enter
            int n = sc.nextInt();
            if(n % 10 == 0){
                continue;
            }
            System.out.println("number was: " + n);
           }while(true);
    }
}
