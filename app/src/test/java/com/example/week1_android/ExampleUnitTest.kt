// Package declaration - this test belongs to the same package as the main app
package com.example.week1_android

// Import statements - bring in external functionality we need
// JUnit is a popular Java/Kotlin testing framework
import org.junit.Test

// Static imports allow us to use functions without class prefix
// assertEquals can be used directly instead of Assert.assertEquals
import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 * 
 * Unit tests are automated tests that verify individual units of code work correctly.
 * These tests run on your computer (not on an Android device) so they're fast.
 * They're perfect for testing business logic, calculations, and data transformations.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    
    /**
     * The @Test annotation marks this function as a test method.
     * JUnit will automatically discover and run all methods marked with @Test.
     * 
     * Test method names should be descriptive and explain what is being tested.
     * Format: whatIsBeingTested_whenCondition_expectedOutcome
     */
    @Test
    fun addition_isCorrect() {
        // assertEquals is an assertion function that checks if two values are equal
        // If they're not equal, the test fails
        // Syntax: assertEquals(expected_value, actual_value)
        // This test verifies that 2 + 2 equals 4
        assertEquals(4, 2 + 2)
    }
}