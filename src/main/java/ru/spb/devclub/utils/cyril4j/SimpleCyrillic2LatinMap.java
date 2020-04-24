package ru.spb.devclub.utils.cyril4j;

/**
 * @author Grig Alex
 */
public abstract class SimpleCyrillic2LatinMap extends BaseCyrillic2LatinMap<String> {
    @Override
    public String get(char symbol) {
        if (Character.isUpperCase(symbol)) {
            return data.get(symbol);
        }
        return data.get(symbol).toLowerCase();
    }
}
