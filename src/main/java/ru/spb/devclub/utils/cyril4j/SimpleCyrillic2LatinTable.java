package ru.spb.devclub.utils.cyril4j;

/**
 * @author Grig Alex
 */
public abstract class SimpleCyrillic2LatinTable extends BaseCyrillic2LatinTable<String> {
    @Override
    public String get(char symbol) {
        if (Character.isUpperCase(symbol)) {
            return data.get(symbol);
        }
        return data.get(symbol).toLowerCase();
    }
}
