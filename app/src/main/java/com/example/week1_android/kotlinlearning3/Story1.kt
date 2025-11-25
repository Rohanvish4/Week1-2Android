// Package declaration - organizing code into logical modules
package com.example.week1_android.kotlinlearning3

// Java interoperability comment - shows how Kotlin can convert Java code
// package com.microsoft.myapplication;
// Paste in Kotlin file and it will give you an option to convert

/**
 * Story1 Object - Singleton Pattern Demonstration
 * 
 * This file shows similar concepts to kotlinlearning package but with
 * different formatting styles, demonstrating flexibility in Kotlin syntax.
 * Object keyword creates a singleton instance automatically.
 */
object Story1 {
    
    /**
     * Function with if-else chains - Less preferred approach
     * 
     * The comment indicates this approach is problematic because:
     * - Multiple if statements are harder to read
     * - More prone to errors
     * - Less performant than when expressions
     * - No compile-time exhaustiveness checking
     * 
     * Note: The comment says "// error" indicating this might have
     * compilation issues due to Employee class definition differences.
     * 
     * @param employee Employee object to process
     */
    // this part makes code very difficult to understand due to if statements
    fun printEmployeeSalary(employee: Employee) { // error
        // Traditional if-else chain approach (not recommended)
        if (employee.employeeType == "Contractor") {
            println("Contractor Salary: $100,000")
        } else if (employee.employeeType == "Full Time") {
            println("Full Time Salary: $150,000")
        } else if (employee.employeeType == "Intern") {
            println("Intern Salary: $50,000")
        }
    }

    /**
     * Function demonstrating range-based loops and string interpolation
     * 
     * Same functionality as other Story1 files but shows consistent
     * implementation across different modules.
     */
    fun printHelloWorld() {
        // Range loop from 1 to 5 (inclusive on both ends)
        for (i in 1..5) {
            // String template with variable interpolation
            println("Hello World$i") // concatenation using string templates
        }
    }

    /**
     * Function with explicit return type
     * 
     * Demonstrates function signature with return type annotation.
     * Shows how to document return types and parameter purposes.
     * 
     * @param input1 First integer to add
     * @param input2 Second integer to add
     * @return Sum of both input parameters
     */
    fun calculate(input1: Int, input2: Int): Int { // returninng int trasnferring to a variabl
        return input1 + input2
    }

    /**
     * Function without return value (Unit return type)
     * 
     * Demonstrates procedure-style function that performs action
     * but doesn't return a value.
     */
    fun calculate2(a: Int, b: Int) {
        println(a + b)  // Prints result instead of returning
    }
} // blue print of data which represents an employee with employee data

/**
 * Employee Class - Alternative Constructor Formatting Style
 * 
 * This demonstrates different ways to format primary constructors in Kotlin.
 * The constructor parameters are spread across multiple lines with comments,
 * showing how Kotlin's flexible syntax accommodates different coding styles.
 * 
 * Key concepts:
 * 1. Multi-line constructor formatting
 * 2. Parameter documentation within constructor
 * 3. Open class for inheritance
 * 4. Public properties (no private modifier)
 * 
 * Note: This class has public properties (no 'private' modifier)
 * compared to the kotlinlearning version which uses private employeeName.
 */
open class Employee    // parameter / argument
    (// data
    var employeeName: String, // fulltime, intern, contractor
    var employeeType: String, var employeeId: Int
) {
    /**
     * toString() Method Override
     * 
     * Provides string representation of Employee objects.
     * Uses string templates for variable interpolation and
     * escape sequences (\n) for formatting.
     * 
     * @return Formatted string with employee details
     */
    // toString() -> method
    override fun toString(): String {
        // String template with escape sequence for line breaks
        return "Employee Name: $employeeName\nEmployee First Character: $employeeType\nEmployee ID: $employeeId"
    }
}

/**
 * Contractor Class - Public Visibility
 * 
 * Notice this class doesn't have 'internal' modifier unlike the other versions,
 * making it public by default. Shows different visibility approaches.
 * 
 * Demonstrates:
 * - Public class visibility (default in Kotlin)
 * - Inheritance from Employee
 * - Property addition in subclass
 * - Method overriding
 */
 class Contractor(employeeName: String, employeeType: String, employeeId: Int) :
    Employee(employeeName, employeeType, employeeId) {
    
    // Contractor-specific salary property
    var salary = "$100,000"
    
    /**
     * Custom toString implementation
     * 
     * Uses multi-line string literals (""") and super class method call.
     * Demonstrates string concatenation with parent class information.
     */
    override fun toString(): String {
        // Triple-quoted string with super call
        return """${super.toString()}
 Salary = $salary"""
    }
} // Intern & Fulltime

/**
 * Intern Class - Internal Visibility Modifier
 * 
 * Uses 'internal' modifier, making it visible only within the same module.
 * Shows mixed visibility approaches within the same file.
 */
internal class Intern(employeeName: String, employeeType: String, employeeId: Int) :
    Employee(employeeName, employeeType, employeeId) {
    
    // Intern-specific salary (lower than contractor/full-time)
    var salary = "$50,000"
    
    // Consistent toString pattern across employee types
    override fun toString(): String {
        return """${super.toString()}
 Salary = $salary"""
    }
}

/**
 * FullTime Class - Completing the Employee Type Hierarchy
 * 
 * Shows the complete inheritance pattern with the highest salary tier.
 * Demonstrates consistent design across all employee subtypes.
 */
internal class FullTime(employeeName: String, employeeType: String, employeeId: Int) :
    Employee(employeeName, employeeType, employeeId) {
    
    // Highest salary tier for full-time employees
    var salary = "$150,000"
    
    // Standard toString override following established pattern
    override fun toString(): String {
        return """${super.toString()}
 Salary = $salary"""
    }
}