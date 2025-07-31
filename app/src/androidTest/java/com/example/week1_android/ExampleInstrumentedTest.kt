// Package declaration - defines the namespace for this class
package com.example.week1_android

// Android testing framework imports
import androidx.test.platform.app.InstrumentationRegistry  // Provides access to app context during testing
import androidx.test.ext.junit.runners.AndroidJUnit4       // JUnit runner for Android tests

// JUnit framework imports
import org.junit.Test         // Marks methods as test cases
import org.junit.runner.RunWith  // Specifies which test runner to use

import org.junit.Assert.*    // Assertion methods for verifying test results

/**
 * Instrumented Test Class - Android Integration Testing
 * 
 * This is an instrumented test that runs on an actual Android device or emulator.
 * Unlike unit tests, instrumented tests have access to the Android framework and can:
 * - Test UI interactions
 * - Access device features (camera, GPS, etc.)
 * - Test app context and Android-specific functionality
 * - Verify integration between app components
 * 
 * Key differences from unit tests:
 * - Runs on Android device/emulator (not on development machine)
 * - Has access to Android APIs and app context
 * - Slower execution compared to unit tests
 * - Can test real Android behavior and UI
 * 
 * @RunWith annotation specifies AndroidJUnit4 as the test runner,
 * which provides Android-specific testing capabilities
 * 
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)  // Kotlin class reference syntax (::class)
class ExampleInstrumentedTest {
    
    /**
     * Test method that verifies the app's package name
     * 
     * This test demonstrates:
     * - How to access app context in instrumented tests
     * - How to verify app configuration and metadata
     * - String comparison using assertEquals
     * 
     * The test ensures the app is correctly configured with the expected package name
     */
    @Test
    fun useAppContext() {
        // Context of the app under test - represents the app's environment
        // InstrumentationRegistry provides access to the testing instrumentation
        // targetContext gives us the context of the app being tested
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        
        // Verify the package name matches what we expect
        // This ensures the app is correctly built and configured
        assertEquals("com.example.week1_android", appContext.packageName)
    }
}