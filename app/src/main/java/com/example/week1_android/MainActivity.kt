// Package declaration - organizes this class within the app's namespace
package com.example.week1_android

// Import statements for Android framework classes
// AppCompatActivity is a base class for activities with backward compatibility features
import androidx.appcompat.app.AppCompatActivity
// Bundle is used to pass data between Android components
import android.os.Bundle

/**
 * MainActivity - The main entry point of this Android application.
 * 
 * In Android, an Activity represents a single screen with a user interface.
 * This class extends AppCompatActivity, which provides backward compatibility
 * and modern features across different Android versions.
 * 
 * The 'class' keyword defines a new class in Kotlin.
 * The ':' symbol indicates inheritance - MainActivity inherits from AppCompatActivity.
 */
class MainActivity : AppCompatActivity() {
    
    /**
     * onCreate() is a lifecycle method that's called when the activity is first created.
     * This is where you perform one-time setup like setting the layout.
     * 
     * 'override' keyword indicates we're providing our own implementation
     * of a method that exists in the parent class (AppCompatActivity).
     * 
     * 'fun' is the keyword for declaring functions in Kotlin.
     * 
     * @param savedInstanceState: Bundle? - The '?' makes this parameter nullable.
     *        This contains data from when the activity was previously destroyed
     *        (like during screen rotation). It's null when starting fresh.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        // Call the parent class's onCreate method first
        // 'super' refers to the parent class (AppCompatActivity)
        super.onCreate(savedInstanceState)
        
        // Set the content view - this displays the UI layout on screen
        // R.layout.activity_main refers to a layout file (activity_main.xml)
        // R is a generated class that provides access to app resources
        setContentView(R.layout.activity_main)
    }
}