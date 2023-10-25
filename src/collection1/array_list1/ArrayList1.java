package collection1.array_list1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {
    public static void main(String[] args) {

        int [] numbers = new int [2];
        numbers[0] = 89;
        numbers[1] = 34;


        // non-generic
        ArrayList list1 = new ArrayList();
        list1.add(387);
        list1.add(23.89);
        list1.add(true);
        list1.add("Hell o");
        System.out.println(list1);

        //generic
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(45);
        list2.add(87);
        list2.add(19);
        System.out.println(list2);
        list2.add(1,88);
        System.out.println(list2);

        //.get
        System.out.println(list2.get(2));

        //.size
        System.out.println(list2.size());

        //.remove
        System.out.println(list2.remove(3));

        //.clear
        // list2.clear();

        //.contains
        System.out.println(list2.contains(44));

        //.set
        list2.set(2, 45);

        //.isEmpty
        System.out.println(list2.isEmpty());

        //.addAll
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(456);
        list3.add(452);
        list3.addAll(0, list2);
        System.out.println(list3);
        list3.removeAll(list2);
        System.out.println(list3);







    }
}
