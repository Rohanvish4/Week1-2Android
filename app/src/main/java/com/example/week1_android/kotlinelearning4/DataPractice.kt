package com.example.week1_android.kotlinelearning4

// EDUCATIONAL COMMENT: Data classes are a special type of class in Kotlin designed to hold data
// The 'data' keyword automatically generates useful methods like toString(), equals(), hashCode(), and copy()
// This eliminates boilerplate code that you would normally have to write manually
data class Employee(
    // EDUCATIONAL COMMENT: 'val' declares an immutable property (read-only)
    // Once set in the constructor, these values cannot be changed
    // This promotes immutability, which is a key principle in functional programming
    val employeeName: String, 
    val employeeSalary: Int
)
// EDUCATIONAL COMMENT: Data classes automatically provide:
// - toString() method for readable string representation
// - equals() method for comparing instances
// - hashCode() method for use in collections like HashMap
// - copy() method for creating modified copies of instances
// - componentN() functions for destructuring declarations