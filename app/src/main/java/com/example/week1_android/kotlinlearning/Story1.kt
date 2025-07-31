// Package declaration for organizing classes
package com.example.week1_android.kotlinlearning

// Converting Java code comments - shows Kotlin's Java interoperability
// package com.microsoft.myapplication;
// Paste in Kotlin file and it will give you an option to convert

/**
 * Story1 Object - Singleton Pattern for Utility Functions
 * 
 * Object declarations in Kotlin create singletons automatically:
 * - Thread-safe by default
 * - Lazily initialized (created when first accessed)
 * - Only one instance exists throughout the application lifecycle
 * - Perfect for utility functions and stateless operations
 */
object Story1 {
    
    /**
     * Function showing if-else chains vs when expressions
     * 
     * This demonstrates the "old way" of handling multiple conditions.
     * The comment indicates this approach makes code difficult to understand
     * due to nested if statements. The kotlinlearning2 package shows the
     * improved approach using 'when' expressions.
     * 
     * Problems with if-else chains:
     * - More verbose and harder to read
     * - Easy to miss cases or create logic errors
     * - No compile-time exhaustiveness checking
     * - Performance overhead for multiple conditions
     * 
     * @param employee Employee object to determine salary for
     */
    // this part makes code very difficult to understand due to if statements
    //Todo cover concepts of Switch here
    fun printEmployeeSalary(employee: Employee) {
        // Traditional if-else approach (less preferred in Kotlin)
        if (employee.employeeType == "Contractor") {
            println("Contractor Salary: $100,000")
        } else if (employee.employeeType == "Full Time") {
            println("Full Time Salary: $150,000")
        } else if (employee.employeeType == "Intern") {
            println("Intern Salary: $50,000")
        }
    }

    /**
     * Function demonstrating loops and string interpolation
     * 
     * Key concepts:
     * - Range expressions (1..5) create inclusive ranges
     * - String templates with $ for variable interpolation
     * - For loop syntax in Kotlin
     */
    fun printHelloWorld() {
        // Range-based loop: 1..5 includes both 1 and 5
        for (i in 1..5) {
            // String template: $i interpolates the variable value
            println("Hello World$i") // concatenation using string templates
        }
    }

    /**
     * Function with return value - demonstrating function signatures
     * 
     * Shows explicit return type declaration and parameter documentation.
     * Return type (: Int) is specified after the parameter list.
     * 
     * @param input1 First integer operand
     * @param input2 Second integer operand
     * @return Sum of the two input parameters
     */
    fun calculate(input1: Int, input2: Int): Int { // returninng int trasnferring to a variabl
        return input1 + input2
    }

    /**
     * Function without return value (Unit return type)
     * 
     * When no return type is specified, Kotlin assumes Unit (equivalent to void in Java).
     * This function performs an operation but doesn't return a value.
     * 
     * @param a First integer to add
     * @param b Second integer to add
     */
    fun calculate2(a: Int, b: Int) {
        println(a + b)  // Prints result instead of returning it
    }
} // blue print of data which represents an employee with employee data

/**
 * Employee Base Class - Demonstrating Inheritance and Encapsulation
 * 
 * This class serves as a blueprint for employee data and demonstrates key OOP concepts:
 * 
 * 1. Open Class:
 *    - 'open' keyword allows inheritance (Kotlin classes are final by default)
 *    - Enables polymorphism through inheritance
 * 
 * 2. Primary Constructor:
 *    - Parameters defined in class header
 *    - 'var' creates mutable properties
 *    - 'private var' for encapsulation (name is not directly accessible)
 * 
 * 3. Visibility Modifiers:
 *    - private: accessible only within this class
 *    - public: accessible everywhere (default in Kotlin)
 *    - internal: accessible within the same module
 * 
 * @param employeeName Name of the employee (private for encapsulation)
 * @param employeeType Type of employment (contractor, full-time, intern)
 * @param employeeId Unique identifier for the employee
 */
 open class Employee(private var employeeName: String, var employeeType: String, var employeeId: Int) {

    /**
     * Getter method for private property
     * 
     * Demonstrates encapsulation - private property with public accessor.
     * This provides controlled access to the private employeeName field.
     * 
     * @return The employee's name
     */
     fun getEmployeeName(): String {
         return employeeName
     }

    /**
     * toString() override - Custom string representation
     * 
     * Every class in Kotlin inherits from 'Any' (equivalent to Object in Java).
     * toString() is defined in Any, so we override it for custom behavior.
     * 
     * Features demonstrated:
     * - Method overriding with 'override' keyword
     * - String templates with variable interpolation
     * - Multi-line string formatting with \n escape sequences
     * 
     * @return Formatted string representation of the employee
     */
    // toString() -> method
    override fun toString(): String {
        // String template with multiple variable interpolations
        return "Employee Name: $employeeName\nEmployee First Character: $employeeType\nEmployee ID: $employeeId"
    }
}

/**
 * Contractor Class - Inheritance and Method Overriding
 * 
 * Demonstrates inheritance from Employee with additional functionality:
 * 
 * 1. Inheritance:
 *    - Extends Employee using : syntax
 *    - Passes constructor parameters to parent class
 * 
 * 2. Internal Visibility:
 *    - 'internal' modifier makes class visible within the same module
 *    - More restrictive than public, more open than private
 * 
 * 3. Additional Properties:
 *    - salary property specific to Contractor
 *    - Shows how subclasses can add their own properties
 */
internal class Contractor(employeeName: String, employeeType: String, employeeId: Int) :
    Employee(employeeName, employeeType, employeeId) {

    // Property specific to Contractor class
    var salary = "$100,000"
    
    /**
     * Overridden toString() with super call
     * 
     * Demonstrates:
     * - Calling parent class method with super.toString()
     * - String concatenation using template literals
     * - Multi-line string literals with """ (triple quotes)
     * 
     * @return Enhanced string representation including salary
     */
    override fun toString(): String {
        // Multi-line string with triple quotes and super call
        return """${super.toString()}
 Salary = $salary"""
    }
} // Intern & Fulltime

/**
 * Intern Class - Another Implementation of Employee Inheritance
 * 
 * Shows consistent inheritance pattern with different values.
 * Demonstrates how multiple classes can inherit from the same base class
 * while providing their own specific implementations.
 */
internal class Intern(employeeName: String, employeeType: String, employeeId: Int) :
    Employee(employeeName, employeeType, employeeId) {
    
    // Different salary value for interns
    var salary = "$50,000"
    
    // Similar toString pattern but with intern-specific salary
    override fun toString(): String {
        return """${super.toString()}
 Salary = $salary"""
    }
}

/**
 * FullTime Class - Completing the Employee Hierarchy
 * 
 * Third implementation showing the full inheritance hierarchy.
 * Demonstrates consistent design patterns across related classes.
 */
internal class FullTime(employeeName: String, employeeType: String, employeeId: Int) :
    Employee(employeeName, employeeType, employeeId) {
    
    // Highest salary for full-time employees
    var salary = "$150,000"
    
    // Consistent toString implementation across all employee types
    override fun toString(): String {
        return """${super.toString()}
 Salary = $salary"""
    }
}