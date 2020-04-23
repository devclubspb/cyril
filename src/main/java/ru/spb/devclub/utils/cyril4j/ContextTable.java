package ru.spb.devclub.utils.cyril4j;

/**
 * @author Grig Alex
 */
public interface ContextTable extends Table {
    String get(Character previousSymbol, char symbol, Character nextSymbol);
}
