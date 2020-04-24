package ru.spb.devclub.utils.cyril4j;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Grig Alex
 */
public abstract class BaseCyrillic2LatinMap<T> implements Table {
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

    protected final Map<Character, T> data;

    public BaseCyrillic2LatinMap() {
        this.data = createData();
    }

    protected Map<Character, T> createData() {
        final Map<Character, T> baseData = createBaseData();
        final Map<Character, T> data = new HashMap<>(baseData.size() + 16);
        data.put('Е', getE());
        data.put('Ё', getYo());
        data.put('Ж', getZh());
        data.put('И', getI());
        data.put('Й', getShortI());
        data.put('Х', getKh());
        data.put('Ц', getC());
        data.put('Ч', getCh());
        data.put('Ш', getSh());
        data.put('Щ', getShch());
        data.put('Ъ', getSolidSign());
        data.put('Ы', getY());
        data.put('Ь', getSoftSign());
        data.put('Э', getEh());
        data.put('Ю', getYu());
        data.put('Я', getYa());
        return data;
    }

    protected abstract Map<Character, T> createBaseData();

    protected abstract T getE();

    protected abstract T getYo();

    protected abstract T getZh();

    protected abstract T getI();

    protected abstract T getShortI();

    protected abstract T getKh();

    protected abstract T getC();

    protected abstract T getCh();

    protected abstract T getSh();

    protected abstract T getShch();

    protected abstract T getSolidSign();

    protected abstract T getY();

    protected abstract T getSoftSign();

    protected abstract T getEh();

    protected abstract T getYu();

    protected abstract T getYa();
}
