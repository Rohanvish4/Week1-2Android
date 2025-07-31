package com.example.week1_android

// EDUCATIONAL COMMENT: Import statements bring in classes from other packages
// These imports allow us to use Employee classes from different learning modules
import com.example.week1_android.kotlinlearning.Contractor
import com.example.week1_android.kotlinlearning.Employee
import com.example.week1_android.kotlinlearning.FullTime
import com.example.week1_android.kotlinlearning.Intern

// EDUCATIONAL COMMENT: Object declaration creates a singleton that can contain the main function
// 'object' keyword creates a single instance that's shared across the entire application
object Driver {

    // EDUCATIONAL COMMENT: @JvmStatic annotation makes this function accessible from Java
    // This is needed for the main function to work properly in Android projects
    @JvmStatic
    fun main(args: Array<String>) {

        // EDUCATIONAL COMMENT: Homework section demonstrating polymorphism
        // Each variable is declared with the abstract Shape type but holds concrete implementations
        // This demonstrates the polymorphism principle of object-oriented programming
        
        // EDUCATIONAL COMMENT: 'val' creates immutable variables (read-only references)
        // The type annotation ': Shape' specifies the variable type explicitly
        // Even though these reference Shape, they hold instances of specific subtypes
        val square: Shape = Square(4.0)
        val rectangle: Shape = Rectangle(4.0, 5.0)
        val triangle: Shape = Triangle(9.0, 2.0)

        // EDUCATIONAL COMMENT: println() function outputs objects to console
        // The toString() method of each object is called automatically
        println(square)
        println(rectangle)
        println(triangle)

        // EDUCATIONAL COMMENT: Challenge section demonstrating employee polymorphism
        // Employee hierarchy demonstrates inheritance and method overriding
        
        // EDUCATIONAL COMMENT: Polymorphic variables - all declared as Employee but hold specific subtypes
        // Note: There seems to be a mix-up in the assignments (employee2 and employee3 have wrong types)
        // This demonstrates how polymorphism allows treating different types uniformly
        val employee1: Employee = Contractor("John", "Contractor", 123)
        val employee2: Employee = Intern("Smith", "Full Time", 456)
        val employee3: Employee = FullTime("Sara", "Intern", 789)

        // EDUCATIONAL COMMENT: Printing employee objects
        // Each call to println() invokes the overridden toString() method of the specific employee type
        // This demonstrates runtime polymorphism - the correct method is called based on the actual object type
        println(employee1)
        println(employee2)
        println(employee3)
    }
}