// Package declaration for the instrumented test
package com.example.week1_android

// Android testing framework imports
// InstrumentationRegistry provides access to the testing environment
import androidx.test.platform.app.InstrumentationRegistry
// AndroidJUnit4 is the test runner for Android-specific tests
import androidx.test.ext.junit.runners.AndroidJUnit4

// Standard JUnit testing imports
import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device or emulator.
 * 
 * Unlike unit tests that run on your computer, instrumented tests run on actual
 * Android devices/emulators. This allows testing of Android-specific functionality
 * like UI interactions, database operations, and system services.
 * 
 * These tests are slower than unit tests but can test real Android behavior.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
// @RunWith annotation specifies which test runner to use
// AndroidJUnit4::class tells JUnit to use Android's test runner
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    
    /**
     * Test method that verifies the app's context and package name.
     * This is a common sanity check to ensure the test environment is set up correctly.
     */
    @Test
    fun useAppContext() {
        // Context represents the application environment in Android
        // It provides access to app resources, preferences, and system services
        // 'val' creates an immutable (read-only) variable
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        
        // Verify that our app's package name is correct
        // This ensures we're testing the right application
        assertEquals("com.example.week1_android", appContext.packageName)
    }
}