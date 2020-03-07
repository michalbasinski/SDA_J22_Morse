package pl.sda.morse;

import pl.sda.translator.Dictionary;

import java.util.HashMap;
import java.util.Map;

public class MorseDictionary implements Dictionary {

    private static MorseDictionary instance = new MorseDictionary();

    public static MorseDictionary getInstance() {
        return instance;
    }

    private Map<String, String> dictionary = new HashMap<>();

    private MorseDictionary() {
        dictionary.put("A", ".-");
        dictionary.put("B", "-...");
        dictionary.put("C", "-.-.");
        dictionary.put("D", "-..");
        dictionary.put("E", ".");
        dictionary.put("F", "..-.");
        dictionary.put("G", "--.");
        dictionary.put("H", "....");
        dictionary.put("I", "..");
        dictionary.put("J", ".---");
        dictionary.put("K", "-.-");
        dictionary.put("L", ".-..");
        dictionary.put("M", "--");
        dictionary.put("N", "-.");
        dictionary.put("O", "---");
        dictionary.put("P", ".--.");
        dictionary.put("Q", "--.-");
        dictionary.put("R", ".-.");
        dictionary.put("S", "...");
        dictionary.put("T", "-");
        dictionary.put("U", "..-");
        dictionary.put("V", "...-");
        dictionary.put("W", ".--");
        dictionary.put("X", "-..-");
        dictionary.put("Y", "-.--");
        dictionary.put("Z", "--..");
    }

    @Override
    public String get(String character) {
        return dictionary.get(character.toUpperCase());
    }

    @Override
    public String getReversed(String character) {
        return dictionary.entrySet().stream()
                .filter(x -> character.equals(x.getValue()))
                .findFirst()
                .get()
                .getKey();
    }
}
