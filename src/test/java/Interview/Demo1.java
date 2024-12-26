package Interview;
import java.util.HashMap;
import java.util.Map;
public class Demo1 {


        public static void main(String[] args) {
            // Create the first HashMap
            Map<String, Integer> firstMap = new HashMap<>();
            firstMap.put("key1", 1);
            firstMap.put("key2", 2);
            firstMap.put("key3", 2);

            // Create the second HashMap
            Map<String, Integer> secondMap = new HashMap<>();
            secondMap.put("key2", 2);
            secondMap.put("key4", 1);

            // Compare and remove key-value pairs from the first map if the keys exist in the second map
            for (Map.Entry<String, Integer> entry : secondMap.entrySet()) {
                String key = entry.getKey();
                if (firstMap.containsKey(key)) {
                    firstMap.remove(key);
                    System.out.println("Removed key '" + key + "' and its corresponding value from the first map.");
                }
            }

            // Print the updated first map
            System.out.println("Updated first map: " + firstMap);
        }
    }




//0 1 1 2 3 5