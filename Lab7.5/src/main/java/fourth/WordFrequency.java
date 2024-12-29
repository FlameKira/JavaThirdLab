package fourth;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void run() {
        String text = "This is a sample text with several words. This text is for testing.";
        String[] words = text.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");

        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Частота встречаемости слов: " + frequencyMap);
    }
}