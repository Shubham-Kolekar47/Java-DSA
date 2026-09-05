import java.util.*;//conditional statements (ternery operator)
public class exp40 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter a marks : ");
       int a = sc.nextInt();
        //checking the number even or odd but with the help of ternery operator
        String result = ((a >= 33))? "pass" : "fail";
        System.out.println("student remark : " + result);

    }
}
