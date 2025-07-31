// Package declaration - groups related classes together for better organization
package com.example.week1_android.kotlinlearning

// Legacy Java package comment showing Kotlin's excellent Java interoperability
// You can paste Java code into Kotlin files and get conversion suggestions
// package com.microsoft.myapplication;
// Paste in Kotlin file and it will give you an option to convert

/**
 * Object declaration - creates a singleton pattern in Kotlin.
 * 
 * 'object' keyword creates a class with exactly one instance that's created lazily
 * when first accessed. Perfect for utility functions, constants, and stateless operations.
 * 
 * Benefits of objects:
 * - Thread-safe by default
 * - Lazy initialization
 * - No need to create instances
 * - Memory efficient
 */
object Story1 {
    
    /**
     * Demonstrates traditional if-else chain approach for conditional logic.
     * 
     * This implementation uses multiple if-else statements which can become
     * hard to read and maintain as the number of conditions grows.
     * Kotlin's 'when' expression would be a cleaner alternative.
     * 
     * @param employee Employee object to determine salary for
     */
    // this part makes code very difficult to understand due to if statements
    //Todo cover concepts of Switch here
    fun printEmployeeSalary(employee: Employee) {
        // Traditional if-else chain - each condition must be explicitly checked
        // String comparison using == (structural equality)
        if (employee.employeeType == "Contractor") {
            // String interpolation using '$' - cleaner than concatenation
            println("Contractor Salary: $100,000")
        } else if (employee.employeeType == "Full Time") {
            println("Full Time Salary: $150,000")
        } else if (employee.employeeType == "Intern") {
            println("Intern Salary: $50,000")
        }
        // Note: No else clause means unknown types will produce no output
    }

    /**
     * Demonstrates for loops with ranges and string interpolation.
     * Shows basic iteration patterns in Kotlin.
     */
    fun printHelloWorld() {
        // Range expression with '..' creates inclusive range (1, 2, 3, 4, 5)
        // 'for' loop iterates through each element in the range
        for (i in 1..5) {
            // String interpolation with '$' embeds variable values directly in strings
            println("Hello World$i") // concatenation using string templates
        }
    }

    /**
     * Function with explicit return type and two parameters.
     * 
     * @param input1 First integer operand
     * @param input2 Second integer operand
     * @return Sum of the two integers
     */
    fun calculate(input1: Int, input2: Int): Int { // returning int transferring to a variable
        // Explicit return statement with arithmetic operation
        return input1 + input2
    }

    /**
     * Function that performs calculation without returning a value.
     * Demonstrates the difference between functions that return values
     * vs functions that perform side effects (printing).
     * 
     * @param a First integer
     * @param b Second integer
     */
    fun calculate2(a: Int, b: Int) {
        // Direct output - function performs action rather than returning value
        println(a + b)
    }
} // blue print of data which represents an employee with employee data

/**
 * Open class Employee - base class demonstrating inheritance concepts.
 * 
 * 'open' keyword allows this class to be inherited by subclasses.
 * By default, Kotlin classes are 'final' and cannot be extended.
 * 
 * Primary constructor defines properties directly in the class header.
 */
 open class Employee(
     // 'private var' - property is mutable but only accessible within this class
     // Encapsulation - hiding internal implementation details
     private var employeeName: String, 
     
     // 'var' - public mutable property (can be read and modified from outside)
     var employeeType: String, 
     var employeeId: Int
 ) {

     /**
      * Getter function for the private employeeName property.
      * 
      * This demonstrates encapsulation - controlled access to private data.
      * External classes can read the name but cannot directly modify it.
      * 
      * @return The employee's name
      */
     fun getEmployeeName(): String {
         // Access private property from within the class
         return employeeName
     }

    /**
     * Override toString() method to provide custom string representation.
     * 
     * 'override' keyword indicates we're replacing the implementation
     * inherited from the 'Any' class (Kotlin's root class).
     * 
     * @return String representation of the employee
     */
    // toString() -> method
    override fun toString(): String {
        // String interpolation with multiple variables
        // '\n' creates line breaks for better formatting
        return "Employee Name: $employeeName\nEmployee First Character: $employeeType\nEmployee ID: $employeeId"
    }
}

/**
 * Contractor class - demonstrates inheritance and constructor chaining.
 * 
 * 'internal' visibility modifier makes this class visible within the same module
 * but not accessible from other modules/libraries.
 * 
 * Inheritance syntax: 'ChildClass : ParentClass(constructor_params)'
 */
internal class Contractor(employeeName: String, employeeType: String, employeeId: Int) :
    Employee(employeeName, employeeType, employeeId) {

    // Additional property specific to contractors
    // 'var' allows salary to be modified after object creation
    var salary = "$100,000"
    
    /**
     * Override toString() to include contractor-specific information.
     * Demonstrates method overriding and super class method calls.
     */
    override fun toString(): String {
        // Multi-line string literal using triple quotes (""")
        // ${super.toString()} calls the parent class's toString() method
        return """${super.toString()}
 Salary = $salary"""
    }
} // Intern & Fulltime

/**
 * Intern class - another inheritance example with different salary.
 * Shows consistent patterns across different employee types.
 */
internal class Intern(employeeName: String, employeeType: String, employeeId: Int) :
    Employee(employeeName, employeeType, employeeId) {
    
    // Intern-specific salary value
    var salary = "$50,000"
    
    override fun toString(): String {
        // Same pattern as Contractor but with different salary
        return """${super.toString()}
 Salary = $salary"""
    }
}

/**
 * FullTime class - completes the employee hierarchy.
 * Demonstrates polymorphism - all employee types can be treated uniformly
 * through the base Employee class interface.
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