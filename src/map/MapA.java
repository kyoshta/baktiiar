package map;

import java.util.HashMap;

public class MapA {
    public static void main(String[] args) {
        HashMap<String, Integer> mobOp = new HashMap<>();
        mobOp.put("MegaCom", 555);
        mobOp.put("Beeline", 777);
        mobOp.put("O!", 700);

        System.out.println(mobOp);

        HashMap<String, String> country = new HashMap<>();
        country.put("Kyrgyzstan", "Bishkek");
        country.put("Russia", "Moscow");
        country.put("Kazakhstan", "Astana");

        for (String i : country.keySet()){
            System.out.println(i);

        }
        for (String j : country.values()){
            System.out.println(j);
            
        }

    }
}
