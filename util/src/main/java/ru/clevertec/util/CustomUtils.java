package ru.clevertec.util;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class CustomUtils {

    public static boolean isPositiveNumber(CharSequence source) {
        return StringUtils.isNumeric(source);
    }

    public static boolean isAllPositiveNumbers(CharSequence[] source) {
        return Arrays.stream(source).allMatch(CustomUtils::isPositiveNumber);
    }
}