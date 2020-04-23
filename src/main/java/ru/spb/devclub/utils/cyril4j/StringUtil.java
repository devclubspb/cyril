package ru.spb.devclub.utils.cyril4j;

/**
 * @author Grig Alex
 */
public final class StringUtil {
    private StringUtil() {
    }

    public static String capitalize(String input) {
        if (input == null || input.length() == 0) return input;
        char[] chars = input.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        return new String(chars);
    }
}
