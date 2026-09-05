import java.util.*;//conditional statements (else-if statement)
public class exp33 {
    public static void main(String[] args) {
        int age = 14;
        if(age>= 18){
            System.out.println("ready for going to college");// if we dont want to check the second condition when first is true then simply use else-if statement   
        }
        else if((age>=13) && (age<18)){
            System.out.println("teenager");
        }
        else{
            System.out.println("not yet ready");
        }
    }
}
