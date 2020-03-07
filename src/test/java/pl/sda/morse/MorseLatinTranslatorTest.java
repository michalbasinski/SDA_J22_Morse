package pl.sda.morse;

import org.junit.Test;
import pl.sda.translator.EmptyTextException;
import pl.sda.translator.Translator;

import static org.junit.Assert.*;

public class MorseLatinTranslatorTest {

    private final Translator translator = new MorseLatinTranslator();

    @Test
    public void shouldTranslateSOS() {
        //given
        final String expectedResult ="SOS" ;
        final String textToTranslate  = "... --- ...";

        //when
        String result = translator.translate(textToTranslate);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    public void shouldTranslateSentence() {
        //given
        final String expectedResult = "Litwo ojczyzno ty moja";
        final String text = ".-.. .. - .-- --- / --- .--- -.-. --.. -.-- --.. -. --- / - -.-- / -- --- .--- .-";

        //when
        String result = translator.translate(text);

        //then
        assertEquals(expectedResult.toUpperCase(), result);
    }

    @Test(expected = EmptyTextException.class)
    public void shouldThrowExceptionWhenTextIsNull() {
        //given
        final String nullString = null;

        //when
        translator.translate(nullString);
    }

    @Test
    public void shouldThrowExceptionWhenTextIsEmpty() {
        //given
        final String emptyString = "";

        //when
        try {
            translator.translate(emptyString);
            fail("Wyjątek nie został rzucony!");
        } catch (EmptyTextException e) {
            //then
        }
    }
}