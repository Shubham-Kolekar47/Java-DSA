import java.util.*;
public class exp27 {
    public static void main(String[] args) {
        int a = 10; //there is no difference between the first statement and teh second statement(but the second is a little bit faster)
       // a = a + 10; - first statment 
        a += 10; // second statement
        System.out.println(a);

        int b = 5;// similaly there is no difference in the third statement and the fourth statement(but the fourth is a little bit faster)
        //b = b-5; - third statement 
        b -= 5; // fourth statement
        System.out.println(b);

        int c = 5;// similaly there is no difference in the fifth statement and the sixth statement(but the sixth is a little bit faster)
        //c = c*5; - fifth statement 
        c *= 5; // sixth statement
        System.out.println(c);

        int d = 5;// similaly there is no difference in the seventh statement and the eigth statement(but the eigth is a little bit faster)
        //d = d/5; - seventh statement 
        d /= 5; // eigth statement
        System.out.println(d);
    }
}
