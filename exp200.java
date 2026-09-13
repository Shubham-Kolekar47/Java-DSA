import java.util.ArrayList;
public class exp200 {
    public static void main(String[] args) {
        //java collection framework
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Float> list3 = new ArrayList<>();
        ArrayList<Boolean> list4 = new ArrayList<>();

        list.add(1);//O(1) - time complexity
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1,9); //O(n)

        System.out.println(list);
    }
}
