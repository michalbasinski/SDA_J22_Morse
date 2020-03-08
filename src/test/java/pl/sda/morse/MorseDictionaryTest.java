package pl.sda.morse;

import org.junit.Test;

import static org.junit.Assert.*;

public class MorseDictionaryTest {

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenCharacterIsUnsupported() {
        //given
        MorseDictionary dictionary = MorseDictionary.getInstance();


        //when
        dictionary.getReversed("----------");

        //then
    }
}