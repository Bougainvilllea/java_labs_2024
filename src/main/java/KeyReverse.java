import java.util.HashMap;

public class KeyReverse {

    public static HashMap<String, Integer> KeyReverse(HashMap <Integer, String> reverse) {

        HashMap<String, Integer> dictReverse = new HashMap<String, Integer>();
        reverse.forEach((key, value) -> dictReverse.put(value, key));

        return dictReverse;
    }
}