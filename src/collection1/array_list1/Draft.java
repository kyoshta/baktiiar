package collection1.array_list1;

import java.util.ArrayList;

public class Draft {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Kazakhstan");
        countries.add("Azerbaijan");
        countries.add("Uzbekistan");
        ArrayList<String> list2 = new ArrayList<>();
        for (String i : countries){
                //countries.removeIf(list -> list.endsWith("stan"));
            System.out.println(i);
            if (i.endsWith("stan")){
                list2.add(i);



            }
            }//System.out.println(countries);
         countries.removeAll(list2);
        System.out.println(countries);
        }
    }

