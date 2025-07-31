package com.example.week1_android

// EDUCATIONAL COMMENT: Imports for Android instrumented testing
// InstrumentationRegistry provides access to the Android testing framework
import androidx.test.platform.app.InstrumentationRegistry
// AndroidJUnit4 is the test runner for Android instrumented tests
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * EDUCATIONAL COMMENT: Android Instrumented Testing
 * Instrumented tests run on an Android device or emulator, not on the development machine
 * They have access to Android APIs and can test UI interactions, database operations, etc.
 * These tests are slower than unit tests but can test Android-specific functionality
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
// EDUCATIONAL COMMENT: @RunWith annotation specifies which test runner to use
// AndroidJUnit4 enables Android-specific testing features
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    
    // EDUCATIONAL COMMENT: This test verifies the app's package name in the Android context
    @Test
    fun useAppContext() {
        // EDUCATIONAL COMMENT: Context represents the current state of the application/activity
        // InstrumentationRegistry.getInstrumentation().targetContext gets the app's context
        // 'val' declares an immutable variable that can only be assigned once
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        
        // EDUCATIONAL COMMENT: assertEquals verifies the app's package name matches expectations
        // This ensures the test is running in the correct application context
        assertEquals("com.example.week1_android", appContext.packageName)
    }
}