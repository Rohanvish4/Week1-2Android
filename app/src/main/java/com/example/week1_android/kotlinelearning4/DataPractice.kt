package com.example.week1_android.kotlinelearning4

/**
 * This is a data class - a special type of class in Kotlin designed to hold data.
 * Data classes automatically generate useful methods like:
 * - equals() and hashCode() for object comparison
 * - toString() for string representation
 * - copy() for creating copies with modified properties
 * - componentN() functions for destructuring declarations
 * 
 * The 'data' keyword tells Kotlin to treat this as a data container class.
 */
data class Employee(
    // 'val' creates a read-only property (immutable)
    // This parameter automatically becomes a property of the class
    val employeeName: String,
    
    // Another read-only property for storing salary as an integer
    val employeeSalary: Int
)