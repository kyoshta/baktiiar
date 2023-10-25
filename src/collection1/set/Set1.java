package collection1.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set1 {
    public static void main(String[] args) {
        // unpredictable order
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(56);
        set1.add(55);
        set1.add(47);
        set1.add(87);
        set1.add(88);
        set1.add(77);
        System.out.println(set1);

        // predictable order
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(85);
        set2.add(87);
        set2.add(89);
        set2.add(81);
        set2.add(86);
        set2.add(83);
        set2.add(84);
        System.out.println(set2);

        // sorted order
        TreeSet<Integer> set3 = new TreeSet<>();
        set3.add(82);
        set3.add(66);
        set3.add(87);
        set3.add(44);
        set3.add(23);
        set3.add(56);
        set3.add(45);
        System.out.println(set3);

        //    List   /   Set
        //   index   /   no index
        //   duplicate /  no duplicate

    }
}
