// Package declaration - organizes classes into namespaces to avoid naming conflicts
package com.example.week1_android.kotlinelearning4

/**
 * This is a data class in Kotlin - a special type of class designed primarily to hold data.
 * Data classes automatically generate several useful methods for you:
 * 
 * Auto-generated methods:
 * - equals() and hashCode() - for comparing objects and using them in collections
 * - toString() - for string representation of the object
 * - copy() - for creating copies of objects with some properties changed
 * - componentN() functions - for destructuring declarations
 * 
 * Benefits of data classes:
 * - Reduces boilerplate code significantly
 * - Ensures consistent implementation of common object methods
 * - Makes code more readable and maintainable
 * 
 * @param employeeName The name of the employee (val = read-only property)
 * @param employeeSalary The salary of the employee in integer format
 */
data class Employee(val employeeName: String, val employeeSalary: Int)