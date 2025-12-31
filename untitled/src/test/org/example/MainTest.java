package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    //happy path
    @Test
    void calculateYearsUntil100_validAge_returnsCorrectYears() {
        int result = Main.calculateYearsUntil100(25);
        assertEquals(75, result);
    }

    //edge case
    @Test
    void calculateYearsUntil100_ageIs100_returnsZero() {
        int result = Main.calculateYearsUntil100(100);
        assertEquals(0, result);
    }

}

// Unit Test Checklist:
// Test class name matches the class being tested (MainTest):
// Test method names clearly describe what is being tested: completed
// Tests run independently: completed
// Includes a happy path test: completed
// Includes an edge case test: completed
// Uses appropriate assertions: completed

