package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;

public class JUnitExample
{
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static boolean isAdult(LocalDate birthDate) {
        int age = Period.between(birthDate, LocalDate.now()).getYears();
        return age >= 18;
    }

    public static String getSouthAmericanCapital(String country) {
        Map<String,String> capitals = new HashMap();
        capitals.put("Chile", "Santiago");
        capitals.put("Peru", "Lima");
        capitals.put("Argentina","Buenos Aires");
        capitals.put("Bolivia", "Sucre");
        capitals.put("Brasil", "Brasilia");
        return capitals.get(country);
    }

    public static Integer convertToInteger(String number) {
        return Integer.parseInt(number);
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static String getAmountOfVowels(String word) {
        return null;
    }
}
