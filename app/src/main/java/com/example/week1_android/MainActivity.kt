package com.example.week1_android

// EDUCATIONAL COMMENT: Import statements bring in external classes and functions we need
// androidx.appcompat.app.AppCompatActivity provides backward compatibility for newer Android features
import androidx.appcompat.app.AppCompatActivity
// android.os.Bundle is used to pass data between activities and store activity state
import android.os.Bundle

// EDUCATIONAL COMMENT: Class declaration using 'class' keyword
// The colon (:) indicates inheritance - MainActivity inherits from AppCompatActivity
// This demonstrates the inheritance principle of object-oriented programming
class MainActivity : AppCompatActivity() {
    
    // EDUCATIONAL COMMENT: The 'override' keyword indicates we're overriding a method from the parent class
    // onCreate() is part of the Android Activity lifecycle - it's called when the activity is first created
    // The '?' after Bundle indicates this parameter can be null (nullable type in Kotlin)
    override fun onCreate(savedInstanceState: Bundle?) {
        // EDUCATIONAL COMMENT: super.onCreate() calls the parent class's onCreate method first
        // This ensures proper initialization of the parent AppCompatActivity class
        super.onCreate(savedInstanceState)
        
        // EDUCATIONAL COMMENT: setContentView() connects this activity to its user interface layout
        // R.layout.activity_main refers to the XML layout file that defines the UI
        // The 'R' class is automatically generated and contains references to all app resources
        setContentView(R.layout.activity_main)
    }
}