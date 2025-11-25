// Package declaration - organizing code into logical modules
package com.example.week1_android.kotlinlearning2

/**
 * Base Employee Class with Open Modifier
 * 
 * Key Kotlin concepts demonstrated:
 * 
 * 1. Open Class:
 *    - 'open' keyword allows this class to be inherited
 *    - By default, Kotlin classes are 'final' (cannot be inherited)
 *    - This is opposite to Java where classes are inheritable by default
 * 
 * 2. Open Properties:
 *    - Properties marked 'open' can be overridden in subclasses
 *    - Allows polymorphic behavior and customization in derived classes
 * 
 * 3. Primary Constructor:
 *    - Parameters defined directly in class declaration
 *    - 'val' makes properties read-only after initialization
 *    - More concise than traditional constructor + property declaration
 */
open class Employee(open val employeeName: String, open val employeeType: String, open val employeeId: Int) {
}

/**
 * Contractor Data Class - Combining Inheritance with Data Class Benefits
 * 
 * This class demonstrates several advanced Kotlin concepts:
 * 
 * 1. Data Class Inheritance:
 *    - Data classes can inherit from open classes
 *    - Gets auto-generated methods (equals, hashCode, toString, copy)
 *    - Combines inheritance polymorphism with data class convenience
 * 
 * 2. Property Override:
 *    - 'override' keyword required when overriding open properties
 *    - Ensures type safety and explicit inheritance behavior
 * 
 * 3. Secondary Properties:
 *    - salary is a regular property, not part of the primary constructor
 *    - Shows how to mix constructor properties with regular properties
 */
data class Contractor(override val employeeName: String, override val employeeType: String, override val employeeId: Int) : Employee(employeeName,employeeType, employeeId) {
    // Property specific to Contractor - not inherited
    val salary = "$100,000"
    
    /**
     * Custom toString() Override
     * 
     * Even though this is a data class (which auto-generates toString),
     * we can still override it for custom formatting.
     * This shows how to balance automation with customization.
     */
    override fun toString(): String {
        return "Contractor(employeeName='$employeeName', employeeType='$employeeType', employeeId=$employeeId, salary='$salary')"
    }
}

/**
 * Intern Data Class - Similar Pattern with Different Values
 * 
 * Demonstrates consistent inheritance pattern across different employee types.
 * Shows how inheritance promotes code reuse and consistent structure.
 */
data class Intern(override val employeeName: String, override val employeeType: String, override val employeeId: Int) : Employee(employeeName,employeeType, employeeId) {
    // Different salary value for Interns
    val salary = "$50,000"
    
    // Custom string representation for Intern objects
    override fun toString(): String {
        return "Intern(employeeName='$employeeName', employeeType='$employeeType', employeeId=$employeeId, salary='$salary')"
    }
}

/**
 * FullTime Data Class - Completing the Employee Hierarchy
 * 
 * Third implementation of the Employee inheritance pattern,
 * showing consistency in design across different employee types.
 */
data class FullTime(override val employeeName: String, override val employeeType: String, override val employeeId: Int) : Employee(employeeName,employeeType, employeeId) {
    // Highest salary for full-time employees
    val salary = "$150,000"
    
    // Consistent toString pattern across all employee types
    override fun toString(): String {
        return "FullTime(employeeName='$employeeName', employeeType='$employeeType', employeeId=$employeeId, salary='$salary')"
    }
}

/**
 * Story1 Object - Singleton Pattern and Utility Functions
 * 
 * Object declaration creates a singleton - only one instance exists throughout the app.
 * Objects are thread-safe by default and lazily initialized.
 * Perfect for utility functions and stateless operations.
 */
object Story1 {
    
    /**
     * Function demonstrating 'when' expression - Kotlin's enhanced switch statement
     * 
     * Key advantages of 'when' over if-else chains:
     * - More readable and maintainable
     * - Exhaustive checking (compiler ensures all cases are handled)
     * - Better performance for multiple conditions
     * - More expressive and functional programming style
     * 
     * @param employee Employee object to check (polymorphic parameter)
     */
    fun printEmployeeSalary(employee: Employee) {
        // 'when' expression - Kotlin's powerful replacement for switch statements
        // Much cleaner than the if-else chain approach
        when (employee.employeeType) {
            "Contractor" -> println("Contractor Salary: $100,000")
            "Full Time" -> println("Full Time Salary: $150,000")
            "Intern" -> println("Intern Salary: $50,000")
            // Could add 'else' clause for unknown types
        }
    }

    /**
     * Function demonstrating loops and string templates
     * 
     * Concepts shown:
     * - Range expressions (1..5) - creates a range of numbers
     * - String templates ($i) - embedding variables directly in strings
     * - for loop syntax in Kotlin
     */
    fun printHelloWorld() {
        // Range-based for loop: 1..5 creates a range from 1 to 5 (inclusive)
        for (i in 1..5) {
            // String template: $i embeds the variable value directly in the string
            println("Hello World$i") // concatenation using string templates
        }
    }

    /**
     * Function demonstrating function overloading and multiple parameters
     * 
     * Function overloading allows multiple functions with the same name
     * but different parameter lists (number or types of parameters).
     * 
     * @param input1 First integer to add
     * @param input2 Second integer to add  
     * @param input3 Third integer to add
     * @return Sum of all three integers
     */
    fun calculate(input1: Int, input2: Int, input3:Int): Int { // returning int transferring to a variable
        return input1 + input2 +input3
    }

    /**
     * Overloaded calculate function with different signature
     * 
     * This version:
     * - Takes only 2 parameters instead of 3
     * - Returns Unit (void) instead of Int
     * - Prints result instead of returning it
     * 
     * Demonstrates function overloading based on parameter count and return type.
     */
    fun calculate(a: Int, b: Int) {
        println(a + b)
    }
}
