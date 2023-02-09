package ru.clevertec.api;

import ru.clevertec.core.Utils;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        String[] source1 = {"12", "79", "14", "15"};
        String[] source2 = {"12", "79", "14", "-15"};
        String[] source3 = {"number1", "number2", "number3", "number4"};

        System.out.println("! Run App !");
        System.out.println("All Numbers Positive?");
        resultPrint(source1);
        resultPrint(source2);
        resultPrint(source3);
    }

    public static void resultPrint(String[] source) {
        System.out.println(Arrays.toString(source) + "  --  " + Utils.isAllPositiveNumbers(source));
    }
}