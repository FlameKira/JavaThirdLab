package fifth;

import java.util.HashMap;
import java.util.Map;

public class MapInvert {
    public static <K, V> Map<V, K> invertMap(Map<K, V> originalMap) {
        Map<V, K> invertedMap = new HashMap<>();
        for (Map.Entry<K, V> entry : originalMap.entrySet()) {
            invertedMap.put(entry.getValue(), entry.getKey());
        }
        return invertedMap;
    }

    public static void run() {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("One", 1);
        originalMap.put("Two", 2);
        originalMap.put("Three", 3);

        Map<Integer, String> invertedMap = invertMap(originalMap);
        System.out.println("Изначальная карта: " + originalMap);
        System.out.println("Инвертированная карта: " + invertedMap);
    }
}