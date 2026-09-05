import java.util.*;
public class exp102 {//arrays
    public static void main(String[] args) {
        int marks[]= new int[100];
        Scanner sc = new Scanner(System.in);
        //int phy;
        //phy = sc.nextInt();

        marks[0]=sc.nextInt();//physics
        marks[1]=sc.nextInt();// this is the way of storing the input in a particular index of an array -> take these as marks of maths
        marks[2]=sc.nextInt();//chem

        System.out.println("physics :" + marks[0]);
        System.out.println("chemistry :" + marks[1]);
        System.out.println("maths : " + marks[2]);

        marks[2]=100;//we updated the marks and we displayed it
        System.out.println("maths : "+ marks[2]);

        marks[2]= marks[2]+1;
        System.out.println("maths : "+ marks[2]);// we can also do this process for updateing the marks
        //  by adding the digit to the original marks, so the 1 mark will get added in the 100 as we
        //  have updated the marks earlier to 100 and so it will become 101 now.

        int percentage=(marks[0]+ marks[1]+marks[2])/ 3;
        System.out.println("percentage" + percentage + "%");//we can also apply such operations on arry

        //length of an array
        System.out.println("length of array =" + marks.length);//nameofarray.length
        //as we have menstioned up there that the length of the array is 100
    }
    
}
