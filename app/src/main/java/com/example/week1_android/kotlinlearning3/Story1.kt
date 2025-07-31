package com.example.week1_android.kotlinlearning3

// package com.microsoft.myapplication;
// Paste in Kotlin file and it will give you an option to convert

// EDUCATIONAL COMMENT: Object declaration creates a singleton instance
// 'object' keyword creates a class with a single instance that's lazily initialized
// This is Kotlin's way of implementing the Singleton design pattern
object Story1 {
    // EDUCATIONAL COMMENT: Function with parameter and conditional logic
    // 'fun' keyword declares a function in Kotlin
    // Functions can accept parameters and contain logic to process data
    fun printEmployeeSalary(employee: Employee) { // error
        // EDUCATIONAL COMMENT: If-else chain for conditional logic
        // This demonstrates basic conditional statements, though a 'when' expression would be more idiomatic
        // String comparison using == operator (structural equality)
        if (employee.employeeType == "Contractor") {
            // EDUCATIONAL COMMENT: String interpolation using $ symbol
            // The $ allows embedding variables and expressions directly in strings
            println("Contractor Salary: $100,000")
        } else if (employee.employeeType == "Full Time") {
            println("Full Time Salary: $150,000")
        } else if (employee.employeeType == "Intern") {
            println("Intern Salary: $50,000")
        }
    }

    // EDUCATIONAL COMMENT: Function demonstrating loops and string interpolation
    fun printHelloWorld() {
        // EDUCATIONAL COMMENT: Range operator (..) creates a range from 1 to 5 inclusive
        // 'for' loop iterates over each value in the range
        for (i in 1..5) {
            // EDUCATIONAL COMMENT: String concatenation using interpolation
            // $i embeds the loop variable directly into the string
            println("Hello World$i") // concatenation
        }
    }

    // EDUCATIONAL COMMENT: Function with return type and parameters
    // : Int specifies the return type explicitly
    // This function takes two integers and returns their sum
    fun calculate(input1: Int, input2: Int): Int { // returninng int trasnferring to a variabl
        // EDUCATIONAL COMMENT: 'return' keyword explicitly returns a value
        // The last expression in a function can be returned implicitly, but explicit return is clearer for beginners
        return input1 + input2
    }

    // EDUCATIONAL COMMENT: Function with Unit return type (returns nothing)
    // When no return type is specified, Kotlin assumes Unit (equivalent to void in Java)
    fun calculate2(a: Int, b: Int) {
        // EDUCATIONAL COMMENT: Direct output without returning a value
        println(a + b)
    }
} // blue print of data which represents an employee with employee data

// EDUCATIONAL COMMENT: Class declaration with constructor parameters
// 'open' keyword allows this class to be inherited by other classes
// Constructor parameters are defined in parentheses after the class name
open class Employee    // parameter / argument
    (// data
    // EDUCATIONAL COMMENT: Constructor parameters with visibility modifiers
    // 'var' creates mutable properties that can be changed after object creation
    var employeeName: String, // fulltime, intern, contractor
    var employeeType: String, 
    var employeeId: Int
) {
    // EDUCATIONAL COMMENT: Method overriding from Any class (Kotlin's base class)
    // toString() method provides string representation of the object
    // 'override' keyword indicates we're overriding a parent class method
    override fun toString(): String {
        // EDUCATIONAL COMMENT: Multi-line string with string interpolation
        // \n creates line breaks for formatted output
        // $ symbols interpolate variables into the string
        return "Employee Name: $employeeName\nEmployee First Character: $employeeType\nEmployee ID: $employeeId"
    }
}

// EDUCATIONAL COMMENT: Class inheritance using colon (:) syntax
// This class inherits from Employee, demonstrating the inheritance principle of OOP
// Note: there's a space before 'class' which should be removed for proper syntax
class Contractor(employeeName: String, employeeType: String, employeeId: Int) :
    Employee(employeeName, employeeType, employeeId) {
    
    // EDUCATIONAL COMMENT: Class property with default value
    // 'var' creates a mutable property specific to this subclass
    var salary = "$100,000"
    
    // EDUCATIONAL COMMENT: Method overriding to customize string representation
    override fun toString(): String {
        // EDUCATIONAL COMMENT: Raw string literal using triple quotes (""")
        // super.toString() calls the parent class's toString method
        // This demonstrates method chaining and inheritance
        return """${super.toString()}
 Salary = $salary"""
    }
} // Intern & Fulltime

// EDUCATIONAL COMMENT: 'internal' visibility modifier
// Makes this class visible only within the same module
internal class Intern(employeeName: String, employeeType: String, employeeId: Int) :
    Employee(employeeName, employeeType, employeeId) {
    var salary = "$50,000"
    override fun toString(): String {
        return """${super.toString()}
 Salary = $salary"""
    }
}

// EDUCATIONAL COMMENT: Another internal class demonstrating consistent inheritance pattern
internal class FullTime(employeeName: String, employeeType: String, employeeId: Int) :
    Employee(employeeName, employeeType, employeeId) {
    var salary = "$150,000"
    override fun toString(): String {
        return """${super.toString()}
 Salary = $salary"""
    }
}