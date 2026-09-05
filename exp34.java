import java.util.*;//conditional statements (else-if statement)
public class exp34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your income: ");
        int income = sc.nextInt();
        if(income<200000){
            System.out.println("no tax");
        }
        else if((income>=200000) && (income<500000)){
            System.out.println("20% tax applied");
        }
        else{
            System.out.println("30% tax applied");
        }
        }
}
