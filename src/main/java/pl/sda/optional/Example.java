package pl.sda.optional;

import java.util.Optional;

public class Example {
    public static void main(String[] args) {
        Integer test = null;
        Optional<Integer> optional = Optional.ofNullable(test);

        System.out.println(optional);


    }
}
