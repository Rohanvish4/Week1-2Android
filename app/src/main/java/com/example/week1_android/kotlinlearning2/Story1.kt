// Package declaration - defines the namespace for better code organization
package com.example.week1_android.kotlinlearning2

/**
 * Base Employee class demonstrating class inheritance and property overriding.
 * 
 * 'open' keyword allows this class to be inherited (extended) by other classes.
 * By default, Kotlin classes are 'final' and cannot be inherited.
 * 
 * Primary constructor parameters with 'open val' can be overridden in subclasses.
 */
open class Employee(
    // 'open val' allows subclasses to override these properties
    // 'val' creates read-only properties (immutable after initialization)
    open val employeeName: String, 
    open val employeeType: String, 
    open val employeeId: Int
) {
    // Empty class body - functionality comes from constructor parameters
}

/**
 * Data class for Contractor - demonstrates data classes with inheritance.
 * 
 * Data classes automatically provide:
 * - equals() and hashCode() for object comparison
 * - toString() for string representation  
 * - copy() for creating modified copies
 * - componentN() functions for destructuring
 * 
 * 'override' keyword provides new implementations of parent class properties.
 */
data class Contractor(
    override val employeeName: String, 
    override val employeeType: String, 
    override val employeeId: Int
) : Employee(employeeName, employeeType, employeeId) {
    
    // Additional property specific to Contractor
    // 'val' makes this immutable - salary cannot be changed after object creation
    val salary = "$100,000"
    
    /**
     * Custom toString() method that overrides the data class's auto-generated one.
     * Uses string templates with '$' for variable interpolation.
     */
    override fun toString(): String {
        return "Contractor(employeeName='$employeeName', employeeType='$employeeType', employeeId=$employeeId, salary='$salary')"
    }
}

/**
 * Data class for Intern - similar structure to Contractor but with different salary.
 * Demonstrates how data classes can extend from regular classes.
 */
data class Intern(
    override val employeeName: String, 
    override val employeeType: String, 
    override val employeeId: Int
) : Employee(employeeName, employeeType, employeeId) {
    
    // Intern-specific salary property
    val salary = "$50,000"
    
    override fun toString(): String {
        return "Intern(employeeName='$employeeName', employeeType='$employeeType', employeeId=$employeeId, salary='$salary')"
    }
}

/**
 * Data class for FullTime employees.
 * Shows consistent pattern across different employee types.
 */
data class FullTime(
    override val employeeName: String, 
    override val employeeType: String, 
    override val employeeId: Int
) : Employee(employeeName, employeeType, employeeId) {
    
    // Full-time employee salary
    val salary = "$150,000"
    
    override fun toString(): String {
        return "FullTime(employeeName='$employeeName', employeeType='$employeeType', employeeId=$employeeId, salary='$salary')"
    }
}

/**
 * Object declaration creates a singleton - a class with only one instance.
 * Objects are thread-safe and lazily initialized when first accessed.
 * Perfect for utility functions and constants.
 */
object Story1 {
    
    /**
     * Function demonstrating 'when' expressions - Kotlin's enhanced switch statement.
     * 
     * 'when' is more powerful than Java's switch:
     * - Can match any expression, not just constants
     * - No need for 'break' statements
     * - Can have complex conditions
     * - Is an expression (returns a value)
     */
    fun printEmployeeSalary(employee: Employee) {
        // 'when' expression matches against the employee type
        // Much cleaner than multiple if-else statements
        when (employee.employeeType) {
            "Contractor" -> println("Contractor Salary: $100,000")
            "Full Time" -> println("Full Time Salary: $150,000") 
            "Intern" -> println("Intern Salary: $50,000")
            // Could add 'else' branch for unhandled cases
        }
    }

    /**
     * Simple function demonstrating for loops and string interpolation.
     * Range operator '..' creates a range from 1 to 5 (inclusive).
     */
    fun printHelloWorld() {
        // for loop with range - '..' creates inclusive range
        for (i in 1..5) {
            // String interpolation with '$' - embeds variable values in strings
            println("Hello World$i") // concatenation using string templates
        }
    }

    /**
     * Function with explicit return type and three parameters.
     * Demonstrates function overloading (same name, different parameters).
     * 
     * @param input1 First integer to add
     * @param input2 Second integer to add  
     * @param input3 Third integer to add
     * @return Sum of all three integers
     */
    fun calculate(input1: Int, input2: Int, input3: Int): Int { 
        // Explicit return statement with expression
        return input1 + input2 + input3
    }

    /**
     * Overloaded function with same name but different parameter count.
     * This version takes only two parameters and prints the result.
     * 
     * Function overloading allows multiple functions with the same name
     * but different parameter lists (number, types, or order).
     */
    fun calculate(a: Int, b: Int) {
        // Directly print the result instead of returning it
        println(a + b)
    }
}
