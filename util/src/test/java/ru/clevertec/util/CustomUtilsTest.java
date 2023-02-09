package ru.clevertec.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CustomUtilsTest {

    @Test
    @DisplayName("test isPositiveNumber() method")
    public void isPositiveNumberTest() {
        Assertions.assertTrue(CustomUtils.isPositiveNumber("123"));
        Assertions.assertFalse(CustomUtils.isPositiveNumber("-123"));
        Assertions.assertFalse(CustomUtils.isPositiveNumber("number"));
    }

    @Test
    @DisplayName("test isAllPositiveNumbers() method")
    public void isAllPositiveNumbersTest() {
        String[] numArray1 = {"12", "79"};
        String[] numArray2 = {"12", "-79"};
        Assertions.assertTrue(CustomUtils.isAllPositiveNumbers(numArray1));
        Assertions.assertFalse(CustomUtils.isAllPositiveNumbers(numArray2));
    }
}