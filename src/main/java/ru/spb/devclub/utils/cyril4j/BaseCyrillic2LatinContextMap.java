package ru.spb.devclub.utils.cyril4j;

import java.util.HashMap;
import java.util.Map;

import static ru.spb.devclub.utils.cyril4j.BaseCyrillic2LatinContextMap.Context;

/**
 * @author Grig Alex
 */
public abstract class BaseCyrillic2LatinContextMap
        extends BaseCyrillic2LatinMap<Context> implements ContextTable {
    @Override
    protected Map<Character, Context> createBaseData() {
        HashMap<Character, Context> data = new HashMap<>(BASE_DATA.size());
        for (Map.Entry<Character, String> entry : BASE_DATA.entrySet()) {
            data.put(entry.getKey(), SimpleContext.of(entry.getValue()));
        }
        return data;
    }

    @Override
    public String get(char symbol) {
        return get(null, symbol, null);
    }

    @Override
    public String get(Character previousSymbol, char symbol, Character nextSymbol) {
        return data.get(symbol).by(previousSymbol, nextSymbol);
    }

    protected static abstract class Context {
        public abstract String by(Character previous, Character next);
    }

    protected static class SimpleContext extends Context {
        protected final String value;

        protected SimpleContext(String value) {
            this.value = value;
        }

        protected static SimpleContext of(String value) {
            return new SimpleContext(value);
        }

        @Override
        public String by(Character previous, Character next) {
            return value;
        }
    }
}
