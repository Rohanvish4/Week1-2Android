// This entire file is commented out, demonstrating different approaches to class definition
// Let's examine what this would have been if it were active:

//package com.example.week1_android
//
///**
// * Example of a basic data class structure (currently commented out)
// * 
// * This shows an alternative approach to defining an Employee class:
// * - Uses 'var' for mutable properties (can be changed after creation)
// * - Uses nullable types (String?) to allow null values
// * - Demonstrates manual property declaration vs constructor parameters
// * 
// * Key Kotlin concepts that would be demonstrated here:
// * 
// * 1. Null Safety:
// *    - String? means the string can be null
// *    - Kotlin's type system prevents null pointer exceptions at compile time
// *    - You must explicitly handle null values
// * 
// * 2. Mutable vs Immutable:
// *    - 'var' creates mutable properties (can be reassigned)
// *    - 'val' creates immutable properties (read-only after initialization)
// * 
// * 3. Property Initialization:
// *    - Properties can be initialized with default values
// *    - employeeId = 0 provides a default value
// * 
// * 4. Data Class Benefits:
// *    - If this were a data class, it would auto-generate equals(), hashCode(), toString()
// *    - Currently commented out, so these benefits are not available
// */
//data class Test1 {
//
//    // Employee name property - nullable string type
//    // The ? after String indicates this property can hold null values
//    var employeeName: String? = null
//    
//    // Employee type property with example values in comment
//    // Comments help document expected values and constraints
//    var employeeType: String? = null // fulltime, intern, contractor
//
//    // Employee ID with default value of 0
//    // Non-nullable Int type - must always have a valid integer value
//    var employeeId = 0
//
//}
