// Package declaration - organizes this class within the app's namespace
package com.example.week1_android

// Android framework imports - these provide access to Android-specific functionality
import androidx.appcompat.app.AppCompatActivity  // Base class for activities with action bar support
import android.os.Bundle                         // Container for app state data

/**
 * MainActivity - The Entry Point of the Android Application
 * 
 * This class demonstrates fundamental Android development concepts:
 * 
 * 1. Inheritance: MainActivity extends AppCompatActivity
 *    - AppCompatActivity provides backward compatibility for modern UI features
 *    - Includes support for action bar, themes, and material design components
 * 
 * 2. Android Activity Lifecycle:
 *    - Activities are screens that users interact with
 *    - They go through a lifecycle: Created → Started → Resumed → Paused → Stopped → Destroyed
 *    - onCreate() is called when the activity is first created
 * 
 * 3. Method Override:
 *    - 'override' keyword indicates we're replacing a method from the parent class
 *    - Required in Kotlin when overriding methods (unlike Java where it's optional)
 */
class MainActivity : AppCompatActivity() {
    
    /**
     * onCreate - Activity Lifecycle Method
     * 
     * This method is called when the activity is first created.
     * It's where you perform one-time initialization:
     * - Set up the user interface
     * - Initialize variables
     * - Set up event listeners
     * 
     * @param savedInstanceState Bundle containing the activity's previously saved state
     *                          If activity is being re-created, this contains saved data
     *                          If null, this is a fresh start of the activity
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        // Always call the parent class implementation first
        // This ensures proper initialization of the activity
        super.onCreate(savedInstanceState)
        
        // Set the content view - connects the activity to its layout file
        // R.layout.activity_main refers to the layout file res/layout/activity_main.xml
        // R is a generated class that contains references to all resources in your app
        setContentView(R.layout.activity_main)
    }
}