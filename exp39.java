import java.util.*;//conditional statements (ternery operator)
public class exp39 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter a number : ");
       int a = sc.nextInt();
        //checking the number even or odd but with the help of ternery operator
        String type = ((a % 2) == 0)? "even" : "odd";
        System.out.println("number type : " + type);

    }
}

