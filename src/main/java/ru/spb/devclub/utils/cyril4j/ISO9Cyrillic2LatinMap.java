package ru.spb.devclub.utils.cyril4j;

/**
 * The system B of GOST 7.79-2000 (ISO 9-95).
 *
 * @author Grig Alex
 */
public class ISO9Cyrillic2LatinMap extends BaseCyrillic2LatinContextMap {
    @Override
    protected Context getE() {
        return SimpleContext.of("E");
    }

    @Override
    protected Context getYo() {
        return SimpleContext.of("Yo");
    }

    @Override
    protected Context getZh() {
        return SimpleContext.of("Zh");
    }

    @Override
    protected Context getI() {
        return SimpleContext.of("I");
    }

    @Override
    protected Context getShortI() {
        return SimpleContext.of("J");
    }

    @Override
    protected Context getKh() {
        return SimpleContext.of("X");
    }

    @Override
    protected Context getC() {
        return new Context() {
            @Override
            public String by(Character previous, Character next) {
                if (next != null) {
                    char ch = Character.toUpperCase(next);
                    if ('I' == ch || 'E' == ch || 'Y' == ch || 'J' == ch) {
                        return "C";
                    }
                }
                return "Cz";
            }
        };
    }

    @Override
    protected Context getCh() {
        return SimpleContext.of("Ch");
    }

    @Override
    protected Context getSh() {
        return SimpleContext.of("Sh");
    }

    @Override
    protected Context getShch() {
        return SimpleContext.of("Shh");
    }

    @Override
    protected Context getSolidSign() {
        return SimpleContext.of("``");
    }

    @Override
    protected Context getY() {
        return SimpleContext.of("Y`");
    }

    @Override
    protected Context getSoftSign() {
        return SimpleContext.of("`");
    }

    @Override
    protected Context getEh() {
        return SimpleContext.of("E`");
    }

    @Override
    protected Context getYu() {
        return SimpleContext.of("Yu");
    }

    @Override
    protected Context getYa() {
        return SimpleContext.of("Ya");
    }
}
