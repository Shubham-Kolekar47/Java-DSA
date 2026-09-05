import java.util.*;
public class exp26 {
    public static void main(String[] args) {
        System.out.println((3>0) && (5>4)); // logicaloperators 'and'
        System.out.println((3>5) && (3>2));
        System.out.println((4>2) && (5>7));
        System.out.println((1>2) && (6>7));

        System.out.println((3>0) || (5>4));// logical operators 'or'
        System.out.println((3>5) || (3>2));
        System.out.println((4>2) || (5>7));
        System.out.println((1>2) || (6>7));

        System.out.println( ! (5>4));// logical operators 'not'
        System.out.println( ! (3>2));
        System.out.println( ! (5>7));
        System.out.println( ! (6>7));
    }

    
}
