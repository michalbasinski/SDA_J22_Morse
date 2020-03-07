package pl.sda.morse;

import pl.sda.translator.Translator;

public class MorseLatinTranslator implements Translator {

    @Override
    public String translate(String text) {
        validate(text);
        String[] words = text.split(" / ");
        MorseDictionary dictionary = MorseDictionary.getInstance();

        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            String[] morseCharacters = word.split(" ");
            StringBuilder wordBuilder = new StringBuilder();
            for (String morseCharacter : morseCharacters) {
                String latinCharacter = dictionary.getReversed(morseCharacter);
                wordBuilder.append(latinCharacter);
            }
            builder.append(wordBuilder.toString()).append(" ");
        }

        return builder.toString().trim();
    }

}
