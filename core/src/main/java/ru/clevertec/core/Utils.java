package ru.clevertec.core;

import ru.clevertec.util.CustomUtils;

public class Utils {

    public static boolean isPositiveNumber(CharSequence source) {
        return CustomUtils.isPositiveNumber(source);
    }

    public static boolean isAllPositiveNumbers(CharSequence[] source) {
        return CustomUtils.isAllPositiveNumbers(source);
    }
}