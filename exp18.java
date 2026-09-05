import java.util.*;
public class exp18 {
    public static void main(String[] args) {
        /*float a = 34.0f;// it will give error
        int b = a ;  
        System.out.println(b); */
        float a = 34.0f;
        int b = (int)a; /* it is called as type casting in java even the data
         is going to get lost we still want to put the float value in the 
         int value so it is called as type casting*/
        System.out.println(b);
        char ch = 'a';
        int number = ch;//ther eis every number associated with the charater in java, for 'a' it is 97
        System.out.println(number);
    }
}