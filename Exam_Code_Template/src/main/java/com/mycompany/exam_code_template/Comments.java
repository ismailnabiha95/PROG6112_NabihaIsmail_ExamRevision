/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exam_code_template;

/**
 *
 * @author ismai
 */
public class Comments {
    // ==================== GENERAL (every file and every method) ====================
// returns the ... (one line above every method, saying what it gives back)
// interface lists the methods the class must provide
// class implements the interface and provides the code for each method
// object of the class created so its methods can be called
// declared before the loop so it keeps its value after the loop
// the paper says to round, so the rounding is done when printing

// ==================== Q1: INTERFACE AND CLASS ====================
// interface: method signatures only, no code inside
// class implements the interface
// @Override: this method comes from the interface
// method receives the table as a parameter
// method returns one value: the total / average / highest / lowest
// the method returns the position of the best item, not its name
// the name is looked up in main using that position

// ==================== Q1: 1D ARRAYS ====================
// array of names, one item per row
// array of totals, one box per item
// total starts at 0 before the loop
// loop visits every item in the array
// add the current value to the total
// assume the first value is the highest so far
// replace it when a higher value is found
// assume the first value is the lowest so far
// replace it when a lower value is found
// best holds the position of the best so far
// compare the values, keep the position
// counter goes up by 1 each time the condition is true
// divide by the length of the array, cast to double to keep the decimals

// ==================== Q1: 2D ARRAYS ====================
// 2D array: each row is one item, each column is one period
// table.length gives the number of rows
// table[row].length gives the number of columns in that row
// outer loop goes through the rows
// inner loop goes through the columns in the current row
// add each value in the table to the total
// total for the whole table, declared before both loops
// total for each row, declared inside the outer loop so it restarts
// store this row's total after the inner loop
// column total: the outer loop goes through the columns, the inner loop through the rows
// the first value in the table is the starting point for highest / lowest
// pass one whole row to the method that takes a 1D array
// count the cells to calculate the average of the table
// keep both the row and the column of the highest value

// ==================== Q1: MAIN (PRINTING THE REPORT) ====================
// data used in the report: names array and 2D table
// print the title
// print the dashed line
// print the column headings on one line
// loop through the headings, print stays on the same line
// move to the next line after the headings
// outer loop: one row per item
// print the label for the current row
// inner loop: print the values across the row
// new line after each row, after the inner loop
// calculate the total for the current row using the method
// call the method for the whole table
// print the summary lines
// loop through the names to print one result per item
// look up the name at the best position and print it

// ==================== Q2: FORM SETUP ====================
// object of the logic class created for the form
// variable to hold the report text so Save can use it
// the report area is read-only
// fields declared above the constructor so every method can use them
// combo box items are set in the properties window

// ==================== Q2: EXTRACTING INPUT ====================
// read the text from the text fields
// read the selected item from the combo box as text
// declared before the try so they can be used after it
// convert the text to a number
// fails if the text is not a number
// show a message and stop if the input is not a number
// store the values in the data object
// the setters store each value in the object
// the getters give each value back

// ==================== Q2: VALIDATION ====================
// validate before calculating
// name cannot be empty
// price must be above zero
// quantity must be above zero
// returns false as soon as a rule fails
// returns true when every rule passes
// show a message and stop if the data is not valid
// invalid data, so the method must return false

// ==================== Q2: CALCULATION ====================
// calculate the subtotal: quantity times price
// calculate the VAT on the subtotal
// total includes the VAT
// commission is the price times the percentage divided by 100
// discount depends on the conditions, most specific condition first
// the calculation method returns the answer, the form does not repeat the maths

// ==================== Q2: REPORT ====================
// build the report text, one line per value
// new line at the end of each line
// display the report in the text area
// store the report so it can be saved
// report lines match the sample in the paper

// ==================== Q2: FILES ====================
// the file name the paper uses, including the extension
// closed automatically at the end of the try
// write the title line
// write the line of stars
// write the report text
// write the closing line of stars
// true opens the file in append mode, so old lines stay
// overwrite the file with the new report
// show a message if the file cannot be saved
// read until there are no more lines
// split the line at the commas
// read the next line so the loop moves on

// ==================== Q2: MENU, EVENTS, CLEAR, EXIT ====================
// menu item calls the same method as the button, so the code is not repeated
// shared method used by the button and the menu item
// Exit closes the application
// Clear empties the fields
// the combo box goes back to the first item
// the stored report is cleared too, so Save cannot use an old report
// message shown if there is nothing to save yet

// ==================== DATA CLASS ====================
// private fields: reached only through getters and setters
// empty constructor
// getter returns the value
// setter stores the value

// ==================== UNIT TESTS ====================
// Arrange: create the object and the test data
// Act: call the method being tested
// Assert: expected value first, then the actual result
// hand-calculated expected value
// allowed difference of 0.01 for decimal numbers
// whole numbers and Strings need no delta
// test data with one invalid value
// invalid data, so the method must return false
// valid data, so the method must return true
// the method must return the position of the top item
// test name matches the paper exactly
}
