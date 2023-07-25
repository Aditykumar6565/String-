import java.util.*;
import java.text.*;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println("First non-repeating character for String analogy is: " + getNonRepeatedCharacter("analogy"));
        System.out.println("First non-repeating character for String easiest is: " + getNonRepeatedCharacter("easiest"));
    }

    public static Character getNonRepeatedCharacter(String str) {
        Map<Character, Integer> countCharacters = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            countCharacters.put(c, countCharacters.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : countCharacters.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return null;
    }
}
