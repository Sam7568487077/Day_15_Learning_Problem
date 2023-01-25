import java.util.*;

public class MyHashMap {
    void frequencyCalc(String str) {
        Map<String, Integer> map = new HashMap<>();
        String arr[] = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println("Before removing avoidable: "+map);

        for (int j = 0; j < arr.length; j++) {
            if (map.containsKey("avoidable")) {
                map.remove("avoidable");
            }

        }
        System.out.println("After removing avoidable: "+map);
    }
}
