import java.util.*;
public class MyHashMap{


    void frequencyCalc(String str)
    {
        Map<String,Integer> map = new HashMap<>();

        String arr[] = str.split(" ");
        for(int i =0;i<arr.length;i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

            for(Map.Entry<String,Integer> entry: map.entrySet())
            {
                System.out.println(entry.getKey() + " - " +entry.getValue());
            }


    }
}
