package ru.spb.devclub.utils.cyril4j;

/**
 * @author Grig Alex
 */
public abstract class BaseTableTranslator<T extends Table> implements Translator {
    protected final T table;

    protected BaseTableTranslator(T table) {
        this.table = table;
    }

    @Override
    public String translate(String text) {
        if (text.isEmpty()) return text;
        return translate(text.toCharArray());
    }

    protected String translate(char[] symbols) {
        final StringBuilder builder = new StringBuilder();
        for (char symbol : symbols) {
            builder.append(translate(symbol));
        }
        return builder.toString();
    }

    @Override
    public String translate(char symbol) {
        return table.get(symbol);
    }
}
