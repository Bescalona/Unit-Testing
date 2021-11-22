package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class JUnitExampleTest
{
    /**
     * Naming Conventions
    MethodName_ExpectedBehavior_StateUnderTest
    MethodName_StateUnderTest_ExpectedBehavior
    Should_ExpectedBehavior_When_StateUnderTest
     testMethodName
     */
    @Test
    public void sum_Sum3_NumbersAre2and1(){
        assertEquals(3, JUnitExample.sum(2,1));
    }

    @Test
    public void sum_SumDifferentThat3_NumbersAre2and2(){
        assertNotEquals(3, JUnitExample.sum(2,2));
    }

    @Test
    public void isAdult_False_AgeLessThan18() {
        assertFalse(JUnitExample.isAdult(LocalDate.of(2010, 5, 17)));
    }

    @Test
    public void isAdult_True_AgeGreaterThan18() {
        assertTrue(JUnitExample.isAdult(LocalDate.of(1994, 5, 17)));
    }

    @Test
    public void getSouthAmericaCapital_NotNull_IfItsASouthAmericanCountry() {
        assertNotNull(JUnitExample.getSouthAmericanCapital("Chile"));
    }

    @Test
    public void getSouthAmericaCapital_Null_IfItsAnAsianCountry() {
        assertNull(JUnitExample.getSouthAmericanCapital("Japon"));
    }

    @Test
    public void convertToInteger_ThrowsException_IfStringNumberIsInvalid() {
        assertThrows(NumberFormatException.class, () -> {
            JUnitExample.convertToInteger("1a");
        });
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 15})
    public void isOdd_True_IfNumbersAreOdd(int number) {
        assertTrue(JUnitExample.isOdd(number));
    }

    @Disabled
    @Test
    public void getAmountOfVowels_Return2_IfTheWordIsChile() {
        assertEquals(2, JUnitExample.getAmountOfVowels("Chile"));
    }
}
