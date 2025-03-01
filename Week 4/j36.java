import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.next();
        
        Set<Character> uniqueChars = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            uniqueChars.add(c);
        }
        
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c);
        }
        scanner.close();
    }
}

