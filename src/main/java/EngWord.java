import java.util.Collections;
import java.util.HashMap;

public class EngWord {
    public static void engWord(String textString) {
        HashMap<String, Integer> dict = new HashMap<>();

        String[] string = textString.split(" ");

        for(int i = 0; i < string.length; i++) {
            dict.put(string[i].toUpperCase(), dict.getOrDefault(string[i].toUpperCase(), 0) + 1);
        }
        System.out.println(dict);
    }
}