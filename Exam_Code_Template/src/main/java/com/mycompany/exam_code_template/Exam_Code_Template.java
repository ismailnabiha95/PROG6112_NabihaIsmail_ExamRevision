

package com.mycompany.exam_code_template;

/**
 *
 * @author ismai
 */
public class Exam_Code_Template {

    public static void main(String[] args) {
        
        
    }
}

/*
=== Printing loops in main(Q1)=======
1D: one line per item (two parallel arrays, names and values)
// ---------- 1. the data ----------
String[] names = {"A", "B", "C"};                     // labels, one per item
double[] values = {10, 20, 30};                       // values, same positions as the names
MyClass obj = new MyClass();                          // object for the calculations (call methods on the object)

// ---------- 2. calculations (before any printing) ----------
double total = obj.Total(values);                     // totals, averages, highest and so on, from your methods
int best = obj.PositionOfHighest(values);             // position of the best item, if the paper asks for it

// ---------- 3. title and dashes ----------
System.out.println("TITLE FROM THE PAPER");            // title, exactly as in the sample
System.out.println("--------------------");            // dashes, same length as the sample

// ---------- 4. one line per item ----------
for (int i = 0; i < names.length; i++)                // one pass per item
{
    System.out.println(names[i] + ": " + values[i]);  // label and value, same index i
}

// ---------- 5. dashes and summary ----------
System.out.println("--------------------");            // dashes before the summary
System.out.println("Total: " + total);                 // summary lines, once each, no loop
System.out.println("Best: " + names[best]);            // the NAME at the best position

==================================================
====1D, all values on ONE line (only if the sample shows them across):===
====================================================

java
for (int i = 0; i < values.length; i++)               // one pass per value
{
    System.out.print(values[i] + " ");                // stay on the line
}
System.out.println();                                 // end the line AFTER the loop

=========================================
2D: a table (row labels, column headings, a 2D array)
java
============================================
// ---------- 1. the data ----------
String[] rowNames = {"R1", "R2"};                     // row labels, one per row
String[] colNames = {"C1", "C2", "C3"};               // column headings, one per column
int[][] table = { {1, 2, 3},                          // row 1
                  {4, 5, 6} };                        // row 2
int[] rowTotals = new int[table.length];              // one box per ROW for the totals
MyClass obj = new MyClass();                          // object for the calculations

// ---------- 2. calculations (before any printing) ----------
for (int row = 0; row < table.length; row++)          // one pass per row
{
    rowTotals[row] = obj.TotalOfRow(table[row]);      // pass ONE whole row to a method that takes a 1D array
}
int grandTotal = obj.GrandTotal(table);               // whole-table results, from your 2D methods

// ---------- 3. title and dashes ----------
System.out.println("TITLE FROM THE PAPER");            // title
System.out.println("--------------------");            // dashes

// ---------- 4. heading line (values across ONE line) ----------
System.out.print("      ");                           // space for the row label column
for (int col = 0; col < colNames.length; col++)       // one pass per column heading
{
    System.out.print(colNames[col] + " ");            // stay on the line
}
System.out.println();                                 // end the heading line

// ---------- 5. rows (outer loop = lines, inner loop = values across) ----------
for (int row = 0; row < table.length; row++)          // one line per row
{
    System.out.print(rowNames[row] + ": ");           // the label for the CURRENT row
    for (int col = 0; col < table[row].length; col++) // each value in THIS row
    {
        System.out.print(table[row][col] + " ");      // stay on the line
    }
    System.out.println();                             // end THIS row, after the inner loop
}

// ---------- 6. dashes and summary ----------
System.out.println("--------------------");            // dashes before the summary
for (int row = 0; row < rowNames.length; row++)       // one line per row
{
    System.out.println("Total for " + rowNames[row] + ": " + rowTotals[row]);   // same index
}
System.out.println("Grand total: " + grandTotal);      // single summary lines no loop

The four rules to check before you run:
Calculate first, print second. All totals and “best” positions exist before any printing starts.
Rows use the loop variable: names[i], rowNames[row], never [0].
println() goes after the inner loop, and inside the outer loop.
Names and values share an index. rowNames[row] goes with rowTotals[row], and the best name is names[best].

General (both questions)
java
// declare the data used in the report                  (top of main)
// create the object used to call the calculation methods
// calculate the results before printing them
// print the report
// returns the ... (one line above every method)
Q1: arrays and loops

Declaring arrays

java
// names of the items, one per row
// column headings, one per column
// sales data: each row is one item, each column is one period
// results array: one box per row/item

1D loops (use the one that matches)

java
// start the total at 0 before the loop
// visit every item in the array
// add the current value to the total
// return the total after the loop
// divide by the number of items; cast to double to keep decimals
// assume the first value is the highest/lowest so far
// replace it when a higher/lower value is found
// best holds the position of the highest value so far
// compare the newcomer against the best so far
// remember the position of the new best
// count starts at 0
// add 1 each time the condition is true
// return the name at the best position
// return true as soon as a match is found
// return false if no match was found after the loop

2D loops

java
// outer loop: visit each row
// inner loop: visit each column in this row
// add every value in the table to the grand total
// declare the row total inside the outer loop so it restarts for each row
// store this row's total after the inner loop
// outer loop goes through the columns, inner loop through the rows
// pass one whole row to the method that takes a 1D array

Decisions

java
// check the highest boundary first
// member with 5 or more tickets gets the biggest discount
// apply the discount only when the condition is true
Q1: printing the report
java
// print the report title
// print a line of dashes
// print the column headings on one line
// print one row per item
// print the row name, then each value on the same line
// move to the next line after each row
// print the total for each item
// print the summary lines
// print the top performing item
Q1: interface, class and data class
java
// interface: lists the methods the class must provide
// class implements the interface and provides the code for each method
// method signature must match the interface exactly
// private fields: only accessible through the getters and setters
// empty constructor so the object can be created without values
// getter: returns the value of the field
// setter: stores a new value in the field
// create the object used to call the methods
Q1 and Q2: unit tests
java
// Arrange: create the object and the test data
// Act: call the method being tested
// Assert: check the result matches the expected value
// expected value worked out by hand
// allowed difference of 0.01 for decimal numbers
// invalid data, so the method must return false
// valid data, so the method must return true
Q2: form and menu
java
// make the report area read-only
// set up the form when it opens
// Process menu item calls the shared method
// Clear menu item calls the shared clear method
// Exit menu item closes the application
// the button and the menu item call the same method to avoid duplicate code
Q2: capturing and validating input
java
// read the selected item from the combo box
// read the values typed by the user
// declare the variables before the try so they can be used after it
// convert the text to a number; fails if the text is not a number
// show a message and stop if the input is not a number
// store the captured values in the data object
// validate the data before calculating
// stop if the data is not valid
// name cannot be empty
// price and quantity must be above zero
// all rules passed
Q2: calculations and report
java
// calculate the subtotal
// calculate the VAT (14% or 15% of the amount)
// total includes the VAT
// apply the discount first, then add VAT to the reduced amount
// build the report text, one line per value
// display the report in the text area
Q2: files
java
// open the file; the file is closed automatically at the end of the try
// overwrite the file with all the records
// true opens the file in append mode so old lines are kept
// write the title and the report lines
// show a message if the file cannot be saved
// open the file for reading
// read the first line; null means the file has ended
// keep reading until there are no more lines
// split the line at the commas into its values
// read the next line (the loop moves forward)
// update the counters after loading

Q2: Clear and tidy up
java
// empty the text fields
// reset the combo box to the first item
// clear the report area
// reset the counters and totals to 0
*/

