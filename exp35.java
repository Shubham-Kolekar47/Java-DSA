import java.util.*;//conditional statements (else-if statement)
public class exp35 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your income: ");
        int income = sc.nextInt();
        int tax=0;
        if(income<200000){
            tax=0;
        }
        else if((income>=200000) && (income<500000)){
            tax= (int)(income*0.2);
        }
        else{
            tax = (int)(income*0.3);
        }
        System.out.println("your tax is: " + tax);
        }
}


