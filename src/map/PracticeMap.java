package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PracticeMap {
    public static void main(String[] args) {
        Map<String, String> phone = new HashMap<>();
        phone.put("iPhone", "white");
        phone.put("samsung", "blue");
        phone.put("motorolla", "brown");
        phone.put("sony", "white");
        phone.put("LG", "white");
        System.out.println(phone);
        for (Map.Entry<String,String> entry: phone.entrySet()){
            System.out.println("Phone: " + entry.getKey() + "\t \t color: " + entry.getValue());

        }
        System.out.println(uniqueValues(phone));
    }
    private static Map<String, String> uniqueValues (Map<String, String> phone) {
        Map<String, String> result = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : phone.entrySet()) {
            String key = entry.getKey();
            String valueEntry = entry.getValue();
            if (!result.containsValue(valueEntry)){
                result.put(key, valueEntry);
            }

        }
        return result;
        }
    }

