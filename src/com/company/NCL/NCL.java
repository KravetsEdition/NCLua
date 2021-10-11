package com.company.NCL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Класс, который содержит основные константы библиотеки:
 * - индексы мужского и женского пола
 * - индексы всех падежей
 */
public class NCL {

    public enum Gender {
        MAN, WOMAN
    }

    /*
     * - <b>N</b> - ім’я
     * - <b>S</b> - прізвище
     * - <b>F</b> - по-батькові
     */
    enum NamePart {
        FIRST_NAME, FATHER_NAME, SECOND_NAME
    }

    public static String substring(String str, int start, int length) {
        if (start < 0) {
            start = str.length() + start;
        }
        try {
            return str.substring(start, start + length);
        } catch (StringIndexOutOfBoundsException ignored) {
        } // fix error

        return "";
    }

    public static boolean isNotEmpty(String str) {
        return str != null && !str.isEmpty();
    }

    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static <T> List<T> makeListOfStrings(T... t) {
        return new ArrayList<>(Arrays.asList(t));
    }

    public static <T> List<T> array_fill(int count, T value) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(value);
        }
        return list;
    }

}