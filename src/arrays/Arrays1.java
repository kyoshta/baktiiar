package arrays;

import java.util.*;

public class Arrays1 {
    public static void main(String[] args) {
//        int [] arrs = new int[3];
//        arrs [1] = 45;
//        arrs [2] = 46;
//        arrs [0] = 55;
//        System.out.println(Arrays.toString(arrs));
//
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        System.out.println(Arrays.toString(cars));
//        cars [1] ="Subaru";
//        System.out.println(Arrays.toString(cars));
//        Arrays.sort(cars);
//        System.out.println(Arrays.binarySearch(cars, "Ford"));
//        System.out.println(Arrays.toString(cars));
//        int [][] arrs1 = new int[3][4];
        int numbers1[][] = new int[2][3];
        numbers1[0][0] = 23;
        numbers1[0][1] = 36;
        numbers1[0][2] = 19;
        numbers1[1][0] = 1110;
        numbers1[1][1] = 298;
        numbers1[1][2] = 372;
        System.out.println(Arrays.deepToString(numbers1));
        System.out.println(numbers1[1][0]);
        Arrays.sort(numbers1[0]);
        System.out.println(Arrays.deepToString(numbers1));
        System.out.println(Arrays.binarySearch(numbers1[0], 23));

        System.out.println("-----");
int even = 1;
even++;
        System.out.println(even);
        ArrayList<String> name3 = new ArrayList<>();
        name3.add("Lisa");
        name3.add("Merim");
        name3.add("Milana");
        name3.add("Mydina");
        name3.add("Asya");
        Set<String> name2 = new HashSet<>(name3);
        Set<String > name6 = new TreeSet<>();
        for (String i : name2) {
            if (i.length() > 5) {
                name6.add(i);
            }
        }}}





