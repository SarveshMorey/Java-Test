import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String inputString = "Hello world";
        countWords(inputString);
    }

    public static void countWords(String str) {
        String[] words = str.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
           
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                
                wordCountMap.put(word, 1);
            }
        }
        System.out.println("Word count in the string:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
