// Package declaration - defines the namespace for this class
package com.example.week1_android

// Import statements - bringing in classes from other packages
// These imports reference Employee classes and Shape classes from different packages
import com.example.week1_android.kotlinlearning.Contractor
import com.example.week1_android.kotlinlearning.Employee
import com.example.week1_android.kotlinlearning.FullTime
import com.example.week1_android.kotlinlearning.Intern

/**
 * Object declaration - creates a singleton that serves as the entry point.
 * 
 * This demonstrates the Singleton pattern in Kotlin using the 'object' keyword.
 * Objects are perfect for utility classes and main entry points since they:
 * - Have exactly one instance
 * - Are thread-safe
 * - Are initialized lazily when first accessed
 */
object Driver {

    /**
     * Main function - the entry point for JVM applications.
     * 
     * '@JvmStatic' annotation makes this function accessible from Java code
     * as a static method. This is necessary for the JVM to recognize it as
     * a main method that can be executed directly.
     * 
     * @param args Command-line arguments passed to the program
     */
    @JvmStatic
    fun main(args: Array<String>) {

        // === HOMEWORK SECTION ===
        // This section demonstrates polymorphism and inheritance with Shape classes
        
        // Polymorphism: Variables declared as base type (Shape) can hold
        // instances of any subclass (Square, Rectangle, Triangle)
        val square: Shape = Square(4.0)
        val rectangle: Shape = Rectangle(4.0, 5.0)
        val triangle: Shape = Triangle(9.0, 2.0)

        // Polymorphic method calls - each object's toString() behaves differently
        // based on its actual type, even though they're all declared as Shape
        println(square)      // Calls Square's toString()
        println(rectangle)   // Calls Rectangle's toString()
        println(triangle)    // Calls Triangle's toString()

        // === CHALLENGE SECTION ===
        // Demonstrates object-oriented programming with Employee hierarchy
        
        // challenge -> figure out a way to print salaries of each employee based on
        //  1. Contractor
        // 2. Full Time
        // 3. Intern
        
        // Polymorphism with Employee classes
        // Base type Employee can reference any subclass instance
        val employee1: Employee = Contractor("John", "Contractor", 123)
        val employee2: Employee = Intern("Smith", "Full Time", 456)
        val employee3: Employee = FullTime("Sara", "Intern", 789)

        // Print employee information using overridden toString() methods
        // Each subclass provides its own implementation including salary details
        println(employee1)  // Displays Contractor info with $100,000 salary
        println(employee2)  // Displays Intern info with $50,000 salary  
        println(employee3)  // Displays FullTime info with $150,000 salary
        
        /*
         * Key Kotlin concepts demonstrated here:
         * 
         * 1. Object declaration: Singleton pattern with 'object' keyword
         * 2. @JvmStatic annotation: Java interoperability
         * 3. Polymorphism: Base type variables holding subclass instances
         * 4. val keyword: Immutable variable declarations
         * 5. Type annotations: 'val variable: Type = value' syntax
         * 6. Constructor calls: Creating instances with parameters
         * 7. Method overriding: toString() behaves differently for each class
         * 8. Package imports: Accessing classes from other packages
         * 9. Function parameters: Array<String> for command-line arguments
         * 10. Print statements: Basic output functionality
         */
    }
}