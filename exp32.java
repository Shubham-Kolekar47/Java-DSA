import java.util.*;//conditional statements (if-else)
public class exp32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value : ");
        int number = sc.nextInt();
        if(number%2 == 0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
}
