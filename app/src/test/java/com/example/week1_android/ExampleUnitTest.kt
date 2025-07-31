package com.example.week1_android

// EDUCATIONAL COMMENT: Import statements for unit testing
// org.junit.Test provides the @Test annotation to mark test methods
import org.junit.Test
// org.junit.Assert contains assertion methods like assertEquals for verifying test results
import org.junit.Assert.*

/**
 * EDUCATIONAL COMMENT: Unit testing fundamentals
 * Unit tests run on the development machine (host) and test individual units of code in isolation
 * They are fast to execute because they don't require an Android device or emulator
 * 
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    
    // EDUCATIONAL COMMENT: The @Test annotation marks this method as a test case
    // Test method names should be descriptive and follow the pattern: methodName_condition_expectedResult
    @Test
    fun addition_isCorrect() {
        // EDUCATIONAL COMMENT: assertEquals is an assertion method that compares expected vs actual values
        // If the values don't match, the test fails
        // Format: assertEquals(expected, actual)
        // This test verifies that 2 + 2 equals 4
        assertEquals(4, 2 + 2)
    }
}