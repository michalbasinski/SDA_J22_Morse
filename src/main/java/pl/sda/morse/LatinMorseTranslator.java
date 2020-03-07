package pl.sda.morse;

import pl.sda.translator.Dictionary;
import pl.sda.translator.Translator;

public class LatinMorseTranslator implements Translator {

    private static final String CHARACTER_SPACE = " ";
    private static final String CHARACTER_SEPARATOR = " / ";

    @Override
    public String translate(String text) {
        validate(text);
        Dictionary morseDictionary = MorseDictionary.getInstance();

        String[] words = text.split(CHARACTER_SPACE);

        StringBuilder builder = new StringBuilder();
        int wordCounter = 0;
        for (String word : words) {
            String translatedCharacter = translateCharacter(morseDictionary, word);
            builder.append(translatedCharacter);
            wordCounter++;
            if (wordCounter != words.length) {
                builder.append(CHARACTER_SEPARATOR);
            }
        }

        return builder.toString();
    }

    private String translateCharacter(Dictionary morseDictionary, String word) {
        StringBuilder builder = new StringBuilder();
        for (Character character : word.toCharArray()) {
            String morseCharacter = morseDictionary.get(character.toString());
            builder.append(morseCharacter).append(CHARACTER_SPACE);
        }
        return builder.toString().trim();
    }

}
