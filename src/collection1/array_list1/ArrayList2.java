package collection1.array_list1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
    public static void main(String[] args) {

        ArrayList<Character> symbs =new ArrayList<>();
        symbs.add('%');
        symbs.add('-');
        symbs.add('+');
        symbs.add('H');
        symbs.add('&');
        symbs.add('9');
        symbs.remove(2);
        symbs.size();
        System.out.println(symbs);

        Iterator<Character> itr =  symbs.iterator();
        System.out.println(itr.hasNext());
        System.out.println(itr.next());
        System.out.println(itr.hasNext());
        System.out.println(itr.next());
        System.out.println(itr.hasNext());
        System.out.println(itr.next());
        System.out.println(itr.hasNext());
        System.out.println(itr.next());
        System.out.println(itr.hasNext());
        System.out.println(itr.next());
        System.out.println(itr.hasNext());



    }
}
