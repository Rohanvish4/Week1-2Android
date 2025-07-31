// Package declaration for organizing related classes
package com.example.week1_android.kotlinlearning3

// Legacy Java package comment showing Kotlin's Java interoperability
// Kotlin can easily work with existing Java code
// package com.microsoft.myapplication;
// Paste in Kotlin file and it will give you an option to convert

/**
 * Object declaration - creates a singleton instance.
 * 
 * 'object' keyword creates a class that has exactly one instance.
 * This is perfect for utility functions, constants, or when you need
 * global access to functionality without creating multiple instances.
 * 
 * Objects are thread-safe and initialized lazily (when first accessed).
 */
object Story1 {
    
    /**
     * Function demonstrating traditional if-else chains vs modern 'when' expressions.
     * 
     * This function shows why multiple if-else statements can make code hard to read.
     * The comment suggests using 'when' expressions for better readability.
     * 
     * @param employee The employee object to check salary for
     */
    // this part makes code very difficult to understand due to if statements
    //Todo cover concepts of Switch here
    fun printEmployeeSalary(employee: Employee) { // error
        // Multiple if-else statements - harder to read and maintain
        // Each condition needs to be explicitly checked
        if (employee.employeeType == "Contractor") {
            // String interpolation with '$' symbol
            println("Contractor Salary: $100,000")
        } else if (employee.employeeType == "Full Time") {
            println("Full Time Salary: $150,000")
        } else if (employee.employeeType == "Intern") {
            println("Intern Salary: $50,000")
        }
        // Note: Missing 'else' clause could lead to no output for unknown types
    }

    /**
     * Function demonstrating for loops and ranges in Kotlin.
     * Shows basic iteration and string concatenation.
     */
    fun printHelloWorld() {
        // Range operator '..' creates inclusive range from 1 to 5
        // 'for' loop iterates through each value in the range
        for (i in 1..5) {
            // String interpolation - '$i' embeds the variable value
            println("Hello World$i") // concatenation using string templates
        }
    }

    /**
     * Function with explicit return type annotation.
     * 
     * @param input1 First number to add
     * @param input2 Second number to add
     * @return The sum as an Int
     */
    fun calculate(input1: Int, input2: Int): Int { // returning int transferring to a variable
        // Explicit return statement
        return input1 + input2
    }

    /**
     * Function that performs calculation but doesn't return a value.
     * Instead it prints the result directly.
     * 
     * This demonstrates the difference between functions that return values
     * and functions that perform actions (side effects).
     */
    fun calculate2(a: Int, b: Int) {
        // Direct output instead of returning a value
        println(a + b)
    }
} // blue print of data which represents an employee with employee data

/**
 * Open class Employee - demonstrates class inheritance in Kotlin.
 * 
 * 'open' keyword allows this class to be inherited by other classes.
 * This is the base class that contains common properties for all employees.
 * 
 * Primary constructor is defined in the class header with parameters.
 */
open class Employee    // parameter / argument
    (// data - constructor parameters
    // 'var' creates mutable properties that can be changed after object creation
    var employeeName: String, // Employee's name
    var employeeType: String, // fulltime, intern, contractor
    var employeeId: Int       // Unique identifier for the employee
.) {
    
    /**
     * toString() method override - provides string representation of the object.
     * 
     * 'override' keyword indicates we're providing our own implementation
     * of a method that exists in the parent class (Any - Kotlin's base class).
     * 
     * Uses multi-line string with '\n' for line breaks.
     */
    // toString() -> method
    override fun toString(): String {
        // String interpolation with '$' for embedding variable values
        return "Employee Name: $employeeName\nEmployee First Character: $employeeType\nEmployee ID: $employeeId"
    }
}

/**
 * Contractor class - demonstrates class inheritance and constructor chaining.
 * 
 * This class inherits from Employee using the ':' syntax.
 * The constructor parameters are passed to the parent class using 'super()'.
 */
 class Contractor(employeeName: String, employeeType: String, employeeId: Int) :
    Employee(employeeName, employeeType, employeeId) {
    
    // Additional property specific to contractors
    var salary = "$100,000"
    
    /**
     * Override toString() to include salary information.
     * Uses string interpolation and calls parent's toString() with 'super'.
     */
    override fun toString(): String {
        // Triple-quoted string allows multi-line strings without escape characters
        // ${super.toString()} calls the parent class's toString() method
        return """${super.toString()}
 Salary = $salary"""
    }
} // Intern & Fulltime

/**
 * Intern class - another example of inheritance.
 * 'internal' visibility modifier makes this class visible within the same module.
 * 
 * Visibility modifiers in Kotlin:
 * - public (default): visible everywhere
 * - internal: visible within the same module
 * - protected: visible in subclasses
 * - private: visible within the same file/class
 */
internal class Intern(employeeName: String, employeeType: String, employeeId: Int) :
    Employee(employeeName, employeeType, employeeId) {
    
    // Intern-specific salary
    var salary = "$50,000"
    
    override fun toString(): String {
        // Multi-line string literal using triple quotes
        return """${super.toString()}
 Salary = $salary"""
    }
}

/**
 * FullTime class - demonstrates consistent inheritance pattern.
 * All employee types follow the same structure but with different salary values.
 */
internal class FullTime(employeeName: String, employeeType: String, employeeId: Int) :
    Employee(employeeName, employeeType, employeeId) {
    
    // Full-time employee salary
    var salary = "$150,000"
    
    override fun toString(): String {
        return """${super.toString()}
 Salary = $salary"""
    }
}