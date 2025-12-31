package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void calculateYearsUntil100_validAge_returnsCorrectYears() {
        int result = Main.calculateYearsUntil100(25);
        assertEquals(75, result);
    }

    // Edge case
    @Test
    void calculateYearsUntil100_ageIs100_returnsZero() {
        int result = Main.calculateYearsUntil100(100);
        assertEquals(0, result);
    }

}
