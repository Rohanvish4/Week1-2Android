// Package declaration - defines the namespace for this Driver class
package com.example.week1_android

// Import statements - bringing in classes from other packages
// These import the Employee classes from the kotlinlearning package
import com.example.week1_android.kotlinlearning.Contractor
import com.example.week1_android.kotlinlearning.Employee
import com.example.week1_android.kotlinlearning.FullTime
import com.example.week1_android.kotlinlearning.Intern

/**
 * Driver Object - Singleton Pattern for Main Program Execution
 * 
 * This object serves as the entry point for the application and demonstrates:
 * - Object declaration (singleton pattern)
 * - Main function for JVM execution
 * - Polymorphism and inheritance
 * - Object instantiation and method calls
 * 
 * Object vs Class:
 * - Object creates a singleton (only one instance)
 * - Thread-safe by default
 * - Lazily initialized
 * - Cannot have constructors
 * - Perfect for utility functions and main entry points
 */
object Driver {

    /**
     * Main Function - Entry Point for JVM Execution
     * 
     * @JvmStatic annotation makes this function accessible from Java
     * as a static method, enabling it to serve as the main entry point.
     * 
     * This function demonstrates several key Kotlin concepts:
     * 1. Polymorphism - storing different employee types in Employee variables
     * 2. Object instantiation with constructor parameters
     * 3. Method calls on objects
     * 4. Print statements for output
     * 
     * @param args Command line arguments (standard main function parameter)
     */
    @JvmStatic
    fun main(args: Array<String>) {

        // Homework section - Shape polymorphism demonstration
        // Note: These Shape classes are referenced but not defined in the project
        // This demonstrates polymorphism where different shapes implement a common interface
        
        /**
         * Polymorphic Shape Variables
         * 
         * Each variable is declared as type Shape (base type) but holds
         * specific implementations (Square, Rectangle, Triangle).
         * This is polymorphism - using a common interface for different types.
         */
        val square: Shape = Square(4.0)      // Square with side length 4.0
        val rectangle: Shape = Rectangle(4.0, 5.0)  // Rectangle with width 4.0, height 5.0
        val triangle: Shape = Triangle(9.0, 2.0)    // Triangle with base 9.0, height 2.0

        // Print each shape - calls toString() method on each object
        println(square)
        println(rectangle)
        println(triangle)

        /**
         * Employee Polymorphism Challenge
         * 
         * Challenge comment asks to figure out how to print salaries of each employee type.
         * The solution demonstrates polymorphism with Employee inheritance hierarchy.
         * 
         * Types demonstrated:
         * 1. Contractor - hourly or project-based worker
         * 2. Full Time - permanent employee with benefits
         * 3. Intern - temporary learning position
         */
        
        // Create polymorphic employee variables
        // Each variable is declared as Employee but holds specific subtypes
        val employee1: Employee = Contractor("John", "Contractor", 123)
        val employee2: Employee = Intern("Smith", "Full Time", 456)      // Note: type mismatch in constructor
        val employee3: Employee = FullTime("Sara", "Intern", 789)        // Note: type mismatch in constructor

        // Print each employee - demonstrates polymorphic toString() method calls
        // Each employee type has its own toString() implementation
        println(employee1)  // Calls Contractor's toString()
        println(employee2)  // Calls Intern's toString()
        println(employee3)  // Calls FullTime's toString()
    }
}