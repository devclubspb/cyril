package ru.spb.devclub.utils.cyril4j;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static ru.spb.devclub.utils.cyril4j.StringUtil.capitalize;

/**
 * @author Grig Alex
 */
public abstract class BaseCyrillic2LatinTable implements Table {
    protected static Map<Character, String> BASE_DATA;

    static {
        final Map<Character, String> data = new HashMap<>(17);
        data.put('А', "A");
        data.put('Б', "B");
        data.put('В', "V");
        data.put('Г', "G");
        data.put('Д', "D");
        data.put('З', "Z");
        data.put('К', "K");
        data.put('Л', "L");
        data.put('М', "M");
        data.put('Н', "N");
        data.put('О', "O");
        data.put('П', "P");
        data.put('Р', "R");
        data.put('С', "S");
        data.put('Т', "T");
        data.put('У', "U");
        data.put('Ф', "F");
        BASE_DATA = Collections.unmodifiableMap(data);
    }

    protected final Map<Character, String> data;

    public BaseCyrillic2LatinTable() {
        this.data = createData();
    }

    protected Map<Character, String> createData() {
        final Map<Character, String> data = new HashMap<>(BASE_DATA.size() + 16);
        data.put('Е', capitalize(getE()));
        data.put('Ё', capitalize(getYo()));
        data.put('Ж', capitalize(getZh()));
        data.put('И', capitalize(getI()));
        data.put('Й', capitalize(getShortI()));
        data.put('Х', capitalize(getKh()));
        data.put('Ц', capitalize(getC()));
        data.put('Ч', capitalize(getCh()));
        data.put('Ш', capitalize(getSh()));
        data.put('Щ', capitalize(getShch()));
        data.put('Ъ', capitalize(getSoftSign()));
        data.put('Ы', capitalize(getY()));
        data.put('Ь', capitalize(getSolidSign()));
        data.put('Э', capitalize(getEh()));
        data.put('Ю', capitalize(getYu()));
        data.put('Я', capitalize(getYa()));
        return data;
    }

    protected abstract String getE();

    protected abstract String getYo();

    protected abstract String getZh();

    protected abstract String getI();

    protected abstract String getShortI();

    protected abstract String getKh();

    protected abstract String getC();

    protected abstract String getCh();

    protected abstract String getSh();

    protected abstract String getShch();

    protected abstract String getSoftSign();

    protected abstract String getY();

    protected abstract String getSolidSign();

    protected abstract String getEh();

    protected abstract String getYu();

    protected abstract String getYa();

    @Override
    public String get(char symbol) {
        if (Character.isUpperCase(symbol)) {
            return data.get(symbol);
        }
        return data.get(symbol).toLowerCase();
    }
}
