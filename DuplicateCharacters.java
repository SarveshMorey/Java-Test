import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String inputString = "Hello my name is Sarvesh";
        findDuplicateCharacters(inputString);
    }

    public static void findDuplicateCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
            
                charCountMap.put(c, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = charCountMap.entrySet();
        System.out.println("Duplicate characters in the string '" + str + "' are:");
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue() + " times");
            }
        }
    }
}
