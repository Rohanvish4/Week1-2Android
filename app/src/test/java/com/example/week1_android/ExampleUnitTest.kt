// Package declaration - groups related classes together
package com.example.week1_android

// Import JUnit testing framework classes
import org.junit.Test  // Annotation to mark test methods
import org.junit.Assert.*  // Static imports for assertion methods like assertEquals

/**
 * Unit Test Class in Kotlin/Android Development
 * 
 * This is an example of a local unit test class that demonstrates JUnit testing in Android.
 * Unit tests run on the development machine (your computer) rather than on an Android device.
 * They are fast and don't require the Android framework to be running.
 * 
 * Key concepts demonstrated:
 * - JUnit test framework usage
 * - Test method naming conventions (descriptive names with underscores)
 * - Assertion methods for verifying expected outcomes
 * 
 * Benefits of unit testing:
 * - Catches bugs early in development
 * - Ensures code behaves as expected
 * - Makes refactoring safer
 * - Serves as documentation for expected behavior
 * 
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    
    /**
     * Test method demonstrating basic arithmetic verification
     * 
     * @Test annotation tells JUnit this method is a test to be executed
     * Test method naming convention: whatIsBeingTested_expectedBehavior
     * 
     * assertEquals() is an assertion method that:
     * - First parameter: expected value
     * - Second parameter: actual value
     * - Test passes if both values are equal, fails otherwise
     */
    @Test
    fun addition_isCorrect() {
        // Assert that 2 + 2 equals 4
        // This is a simple test to verify basic arithmetic operations work correctly
        assertEquals(4, 2 + 2)
    }
}