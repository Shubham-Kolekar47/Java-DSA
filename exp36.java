import java.util.*;//conditional statements (else-if statement)
public class exp36 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number a: ");
        int a = sc.nextInt();
        System.out.println("enter the number b: ");
        int b = sc.nextInt();
        System.out.println("enter a number c: ");
        int c = sc.nextInt();

        if((a>b) && (a>c)){
            System.out.println("a is the greatest");
        }
        else if((b>a) && (b>c)){
            System.out.println("b is the greatest");
        }
        else{
            System.out.println("c is the greatest");
        }

    }
}
