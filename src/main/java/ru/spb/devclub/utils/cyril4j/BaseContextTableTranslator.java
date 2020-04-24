package ru.spb.devclub.utils.cyril4j;

/**
 * @author Grig Alex
 */
public class BaseContextTableTranslator<T extends ContextTable> extends BaseTableTranslator<T> {
    protected BaseContextTableTranslator(T table) {
        super(table);
    }

    @Override
    protected String translate(char[] symbols) {
        if (symbols.length == 1) return translate(symbols[0]);
        final StringBuilder builder = new StringBuilder();
        Character previous = null;
        Character next = null;
        char current;
        for (int i = 0, l = symbols.length; i < l; i++) {
            current = symbols[i];
            if (i + 1 < l) next = symbols[i + 1];
            builder.append(translate(previous, current, next));
            previous = current;
        }
        return builder.toString();
    }

    protected String translate(Character previous, char current, Character next) {
        return table.get(previous, current, next);
    }
}
