package com.example.week1_android.kotlinlearning2

// EDUCATIONAL COMMENT: Open class with constructor parameters using 'open' modifier
// The 'open' keyword is needed because data classes inherit from this class
// All properties use 'open val' to allow overriding in subclasses
open class Employee(open val employeeName: String, open val employeeType: String, open val employeeId: Int) {
}

// EDUCATIONAL COMMENT: Data class with inheritance
// 'data' keyword automatically generates toString(), equals(), hashCode(), copy(), and componentN() methods
// 'override' keyword indicates these properties override the parent class properties
data class Contractor(override val employeeName: String, override val employeeType: String, override val employeeId: Int) : Employee(employeeName,employeeType, employeeId) {
    // EDUCATIONAL COMMENT: 'val' creates an immutable property (read-only)
    // This property is specific to the Contractor class and cannot be changed after initialization
    val salary = "$100,000"
    
    // EDUCATIONAL COMMENT: Overriding the auto-generated toString() method from data class
    // This allows custom string formatting while still benefiting from data class features
    override fun toString(): String {
        // EDUCATIONAL COMMENT: String interpolation with single quotes for strings and direct property access
        // This demonstrates how to format data class output manually
        return "Contractor(employeeName='$employeeName', employeeType='$employeeType', employeeId=$employeeId, salary='$salary')"
    }
}

// EDUCATIONAL COMMENT: Second data class demonstrating same pattern
data class Intern(override val employeeName: String, override val employeeType: String, override val employeeId: Int) : Employee(employeeName,employeeType, employeeId) {
    val salary = "$50,000"
    override fun toString(): String {
        return "Intern(employeeName='$employeeName', employeeType='$employeeType', employeeId=$employeeId, salary='$salary')"
    }
}

// EDUCATIONAL COMMENT: Third data class completing the employee hierarchy
data class FullTime(override val employeeName: String, override val employeeType: String, override val employeeId: Int) : Employee(employeeName,employeeType, employeeId) {
    val salary = "$150,000"
    override fun toString(): String {
        return "FullTime(employeeName='$employeeName', employeeType='$employeeType', employeeId=$employeeId, salary='$salary')"
    }
}

// EDUCATIONAL COMMENT: Object declaration with functions demonstrating advanced Kotlin features
object Story1 {
    // EDUCATIONAL COMMENT: Function demonstrating 'when' expression (Kotlin's improved switch statement)
    // 'when' is more powerful than traditional if-else chains and is the idiomatic Kotlin way
    fun printEmployeeSalary(employee: Employee) {
        // EDUCATIONAL COMMENT: 'when' expression evaluates the employeeType property
        // Each branch is separated by -> (arrow function syntax)
        // This is more readable and maintainable than if-else chains
        when (employee.employeeType) {
            "Contractor" -> println("Contractor Salary: $100,000")
            "Full Time" -> println("Full Time Salary: $150,000")
            "Intern" -> println("Intern Salary: $50,000")
        }
    }

    // EDUCATIONAL COMMENT: Function with range and loop (same as other examples)
    fun printHelloWorld() {
        // EDUCATIONAL COMMENT: Range operator (..) creates inclusive range
        for (i in 1..5) {
            println("Hello World$i") // concatenation
        }
    }

    // EDUCATIONAL COMMENT: Function overloading - same function name with different parameters
    // This version takes 3 parameters instead of 2, demonstrating method overloading
    fun calculate(input1: Int, input2: Int, input3:Int): Int { // returning int transferring to a variable
        // EDUCATIONAL COMMENT: Returns sum of three integers
        return input1 + input2 +input3
    }

    // EDUCATIONAL COMMENT: Second overloaded function with 2 parameters
    // Kotlin supports function overloading based on parameter count and types
    fun calculate(a: Int, b: Int) {
        // EDUCATIONAL COMMENT: This version prints the result instead of returning it
        println(a + b)
    }
}
