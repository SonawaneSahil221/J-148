import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (char c : countMap.keySet()) {
            if (countMap.get(c) == 1) {
                System.out.println("First unique character: " + c);
                return;
            }
        }

        System.out.println("No unique character found");
    }
}
