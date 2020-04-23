package ru.spb.devclub.utils.cyril4j;

/**
 * @author Grig Alex
 */
@FunctionalInterface
public interface Translator {
    String translate(String text);

    default String translate(char symbol) {
        return translate(String.valueOf(symbol));
    }
}
