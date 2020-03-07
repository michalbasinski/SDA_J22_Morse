package pl.sda.translator;

public interface Translator {
    String translate(String text);

    default void validate(String text) {
        if (text == null || text.isEmpty()) {
            throw new EmptyTextException("Tekst do przetłumaczenia nie może być pusty!");
        }
    }
}
