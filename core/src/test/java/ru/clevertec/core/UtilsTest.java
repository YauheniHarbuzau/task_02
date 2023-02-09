package ru.clevertec.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UtilsTest {

    @Test
    @DisplayName("test isPositiveNumber() method")
    public void isPositiveNumberTest() {
        Assertions.assertTrue(Utils.isPositiveNumber("123"));
        Assertions.assertFalse(Utils.isPositiveNumber("-123"));
        Assertions.assertFalse(Utils.isPositiveNumber("number"));
    }

    @Test
    @DisplayName("test isAllPositiveNumbers() method")
    public void isAllPositiveNumbersTest() {
        String[] numArray1 = {"12", "79"};
        String[] numArray2 = {"12", "-79"};
        Assertions.assertTrue(Utils.isAllPositiveNumbers(numArray1));
        Assertions.assertFalse(Utils.isAllPositiveNumbers(numArray2));
    }
}