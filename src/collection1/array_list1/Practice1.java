package collection1.array_list1;


import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList<String> days1 = new ArrayList<>();
        days1.add("FRIDAY");
        days1.add("WEDNESDAY");
        days1.add("SUNDAY");
        days1.add("MONDAY");
        days1.add("SATURDAY");
        days1.add("TUESDAY");
        days1.add("THURSDAY");
        for (int i = 0; i < days1.size(); i++) {
            System.out.println((i + 1) + " " + days1.get(i));
        }

    }
}
        /*ArrayList<String> days2 = new ArrayList<>();
        days2.add("MONDAY");
        days2.add("TUESDAY");
        days2.add("WEDNESDAY");
        days2.add("THURSDAY");
        days2.add("FRIDAY");
        days2.add("SATURDAY");
        days2.add("SUNDAY");
        ArrayList <String> ordered = new ArrayList<>();


        for (String day : days2) {
            if (days1.contains(day)) {
                ordered.add(day);

            }
            /*for (String day : daeweeko) {
    if (list1day.contains(day)) {
        sorted.add(day);

             */
//        }System.out.println(ordered);
//                }
//
//
//            }


















//        ArrayList<String> names = new ArrayList<>();
//        names.add("Bermet");
//        names.add("Kanybek");
//        names.add("Ali");
//        names.remove(1);
//        names.remove("Bermet");
//        System.out.println(names);

//        ArrayList<String> days = new ArrayList<>();
//        days.add("Wednesday");
//        days.add("Sunday");
//        days.add("Monday");
//        days.add("Saturday");
//        days.add("Thursday");
//        days.add("Tuesday");
//        days.add("Friday");
//        days.set(0, "Monday");
//        days.set(1, "Tuesday");
//        days.set(2, "Wednesday");
//        days.set(3, "Thursday");
//        days.set(4, "Friday");
//        days.set(5, "Saturday");
//        days.set(6, "Sunday");
//        System.out.println(days);
//        days.sort(Comparator.comparing(day -> DayOfWeek.valueOf(day.toString().toUpperCase())));
//        System.out.println(days);
//
//        ArrayList<DayOfWeek> days = new ArrayList<>();
//        days.add(DayOfWeek.FRIDAY);
//        days.add(DayOfWeek.TUESDAY);
//        days.add(DayOfWeek.SATURDAY);
//        days.add(DayOfWeek.MONDAY);
//        days.add(DayOfWeek.THURSDAY);
//        days.add(DayOfWeek.SUNDAY);
//        days.add(DayOfWeek.WEDNESDAY);
//        Collections.sort(days);
//        System.out.println(days);
//        List<String> daysOfWeek = new ArrayList<>(Arrays.asList("Среда", "Понедельник", "Пятница", "Вторник", "Четверг"));
//
//        // Сортировка списка дней недели по алфавиту
//        Collections.sort(daysOfWeek);
//        // Вывод отсортированного списка
//        System.out.println("Дни недели в порядке: ");
//        for (String day : daysOfWeek) {
//            System.out.println(day);
//        }







