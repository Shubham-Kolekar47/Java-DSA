import java.util.ArrayList;
public class exp199 {
    public static void main(String[] args) {
        //java collection framework
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Float> list3 = new ArrayList<>();
        ArrayList<Boolean> list4 = new ArrayList<>();

        //add element inn the arraylist
        list.add(1);//O(1) - time complexity
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        //get operation - O(n)
        int element = list.get(2);
        System.out.println(element);

        //detete
        list.remove(2);
        System.out.println(list);

        //set
        list.set(2, 10);
        System.out.println(list);

        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

    }
}
