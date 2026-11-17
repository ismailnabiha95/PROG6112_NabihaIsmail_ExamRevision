/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exam_code_template;

/**
 *
 * @author ismai
 */
public class SNIPPETS {
    
    
}

/*
PROG6112 COPY-PASTE SNIPPETS (Q1 and Q2)
========================================
How to use: Ctrl+F for a section number, copy the block, paste into NetBeans, then Alt+Shift+F.
Every file needs the SAME package line as the first line. Replace names with the paper's names.
Remove leftover notes before handing in. All code compiled and run before it went in this file.

SECTIONS
 1  1D loops: total, average          1b highest, position, name of best     1c count, search
 2  2D loops: grand total, row totals  2b column totals, highest in table
 2c 2D extras: lowest, average, count over, WHERE the highest/lowest is, best row, best column
 3  decisions (if / else if)
 4  print a report                     4b print a report with ALL the summaries
 5  interface + class                  5b data class                          5c Q1 table interface
 6  main using a class                 6b main for a table class (total, average, max, min)
 7  Q2 fields and one-liners           8  try / catch                         9  validation, VAT, discount
10  Process (GUI)                     11  events and Clear                   12  capture 5 records
13  files                             14  unit tests                         15  comments to reuse


// ======================================================================
// 1. 1D LOOPS: total, average
// ======================================================================
public int Total(int[] values)
{
    int sum = 0;                                   // start at 0, BEFORE the loop
    for (int i = 0; i < values.length; i++)        // visit every item
    {
        sum = sum + values[i];                     // add the VALUE
    }
    return sum;                                    // after the loop
}

public double Average(int[] values)
{
    int sum = 0;                                   // start at 0
    for (int i = 0; i < values.length; i++)        // visit every item
    {
        sum = sum + values[i];                     // add the value
    }
    return (double) sum / values.length;           // cast BEFORE dividing to keep decimals
}

// ======================================================================
// 1b. 1D LOOPS: highest, lowest, position, name of best
// ======================================================================
public int Highest(int[] values)
{
    int highest = values[0];                       // assume the first is highest (lowest: same, with <)
    for (int i = 1; i < values.length; i++)        // check the rest, from 1
    {
        if (values[i] > highest)                   // newcomer on the LEFT
        {
            highest = values[i];                   // keep the VALUE
        }
    }
    return highest;                                // after the loop
}

public int PositionOfHighest(int[] values)
{
    int best = 0;                                  // position 0 is the best so far
    for (int i = 1; i < values.length; i++)        // check the rest
    {
        if (values[i] > values[best])              // newcomer on the left, champion on the right
        {
            best = i;                              // keep the POSITION
        }
    }
    return best;                                   // add 1 if the question wants week 1, 2, 3...
}

public int PositionOfLowest(int[] values)
{
    int worst = 0;                                 // position 0 is the lowest so far
    for (int i = 1; i < values.length; i++)        // check the rest
    {
        if (values[i] < values[worst])             // < instead of >
        {
            worst = i;                             // keep the POSITION
        }
    }
    return worst;
}

public String NameOfHighest(String[] names, int[] values)
{
    int best = 0;                                  // position of the best so far
    for (int i = 1; i < values.length; i++)        // check the rest
    {
        if (values[i] > values[best])              // compare the NUMBERS array
        {
            best = i;                              // remember the position
        }
    }
    return names[best];                            // look up the NAME at that position
}

// ======================================================================
// 1c. 1D LOOPS: count, search
// ======================================================================
public int CountOver(int[] values, int limit)
{
    int count = 0;                                 // start at 0, BEFORE the loop
    for (int i = 0; i < values.length; i++)        // visit every item
    {
        if (values[i] > limit)                     // over is >, below is <, at least is >=
        {
            count = count + 1;                     // add 1, never i
        }
    }
    return count;                                  // after the loop
}

public boolean Contains(int[] values, int target)
{
    for (int i = 0; i < values.length; i++)        // visit every item
    {
        if (values[i] == target)                   // == is fine for numbers (Strings: equals)
        {
            return true;                           // found it: stop straight away
        }
    }
    return false;                                  // looked at every item, found nothing
}

// ======================================================================
// 2. 2D LOOPS: grand total, row totals
// ======================================================================
public int GrandTotal(int[][] table)
{
    int total = 0;                                 // before BOTH loops
    for (int row = 0; row < table.length; row++)   // outer: each row
    {
        for (int col = 0; col < table[row].length; col++)   // inner: each column in THIS row
        {
            total = total + table[row][col];       // add every single value
        }
    }
    return total;                                  // after both loops
}

public int[] RowTotals(int[][] table)
{
    int[] totals = new int[table.length];          // one box per row
    for (int row = 0; row < table.length; row++)   // each row
    {
        int rowTotal = 0;                          // INSIDE the outer loop: restarts for every row
        for (int col = 0; col < table[row].length; col++)   // each column in this row
        {
            rowTotal = rowTotal + table[row][col]; // add this value to the row total
        }
        totals[row] = rowTotal;                    // after the inner loop: store this row's total
    }
    return totals;                                 // the whole array
}

// ======================================================================
// 2b. 2D LOOPS: column totals, highest in table
// ======================================================================
public int[] ColumnTotals(int[][] table)
{
    int[] totals = new int[table[0].length];       // one box per COLUMN
    for (int col = 0; col < table[0].length; col++)    // OUTER: each column
    {
        int colTotal = 0;                          // restarts for every column
        for (int row = 0; row < table.length; row++)   // INNER: each row, down the column
        {
            colTotal = colTotal + table[row][col]; // row first, then column
        }
        totals[col] = colTotal;                    // store this column's total
    }
    return totals;                                 // the whole array
}

public int HighestInTable(int[][] table)
{
    int highest = table[0][0];                     // the first value in the table
    for (int row = 0; row < table.length; row++)   // each row
    {
        for (int col = 0; col < table[row].length; col++)   // each column
        {
            if (table[row][col] > highest)         // newcomer on the left
            {
                highest = table[row][col];         // keep the VALUE
            }
        }
    }
    return highest;                                // after both loops
}

// ======================================================================
// 2c. 2D EXTRAS: lowest, average, count over, WHERE, best row, best column
// ======================================================================
public int LowestInTable(int[][] table)
{
    int lowest = table[0][0];                      // start with the first value (NOT 0)
    for (int row = 0; row < table.length; row++)   // each row
    {
        for (int col = 0; col < table[row].length; col++)   // each column
        {
            if (table[row][col] < lowest)          // < for the lowest
            {
                lowest = table[row][col];          // keep the VALUE
            }
        }
    }
    return lowest;
}

public double AverageOfTable(int[][] table)
{
    int count = 0;                                 // how many values are in the table
    for (int row = 0; row < table.length; row++)   // one pass per row
    {
        count = count + table[row].length;         // add the number of columns in this row
    }
    return (double) GrandTotal(table) / count;     // reuse GrandTotal; cast keeps the decimals
}

public int CountOverInTable(int[][] table, int limit)
{
    int count = 0;                                 // before BOTH loops
    for (int row = 0; row < table.length; row++)
    {
        for (int col = 0; col < table[row].length; col++)
        {
            if (table[row][col] > limit)           // over is >, under is <= (check the paper)
            {
                count = count + 1;                 // add 1, never the value
            }
        }
    }
    return count;
}

// WHERE is the highest? returns {row, column}. Use it to print the row NAME and column NAME.
public int[] WhereIsHighest(int[][] table)
{
    int bestRow = 0;                               // position of the best so far
    int bestCol = 0;
    for (int row = 0; row < table.length; row++)
    {
        for (int col = 0; col < table[row].length; col++)
        {
            if (table[row][col] > table[bestRow][bestCol])   // compare with the champion
            {
                bestRow = row;                     // keep BOTH positions
                bestCol = col;
            }
        }
    }
    int[] where = {bestRow, bestCol};              // pack the two positions in one array
    return where;                                  // use: where[0] = row, where[1] = column
}

public int[] WhereIsLowest(int[][] table)          // same as above with <
{
    int worstRow = 0;
    int worstCol = 0;
    for (int row = 0; row < table.length; row++)
    {
        for (int col = 0; col < table[row].length; col++)
        {
            if (table[row][col] < table[worstRow][worstCol])
            {
                worstRow = row;
                worstCol = col;
            }
        }
    }
    int[] where = {worstRow, worstCol};
    return where;
}

// BEST ROW = the row with the highest TOTAL (top movie, top agent, top year...)
public String BestRowName(String[] rowNames, int[][] table)
{
    int[] totals = RowTotals(table);               // one total per row
    int best = PositionOfHighest(totals);          // position of the highest total
    return rowNames[best];                         // the NAME at that position
}

// BEST COLUMN = the column with the highest TOTAL (top product, top quarter...)
public String BestColumnName(String[] colNames, int[][] table)
{
    int[] totals = ColumnTotals(table);            // one total per column
    int best = PositionOfHighest(totals);
    return colNames[best];
}

// ======================================================================
// 3. DECISIONS: if / else if chain
// ======================================================================
public String GetGrade(double average)
{
    if (average >= 80)                             // check the HIGHEST boundary first
    {
        return "A";                                // the first true branch wins
    }
    else if (average >= 70)
    {
        return "B";
    }
    else if (average >= 60)
    {
        return "C";
    }
    else if (average >= 50)
    {
        return "D";
    }
    else
    {
        return "F";                                // everything below 50
    }
}

// ======================================================================
// 4. PRINT A REPORT (2D): title, heading, rows, row totals
// ======================================================================
// SPACING RULE: each column is (heading length + 1) wide. Print the value, then spaces to fill it.
// 9-letter heading + 1 space = 10, so a 3-digit value gets 7 spaces. Label width = heading start.
public void PrintReport()
{
    String[] rowNames = {"R1", "R2"};              // row labels
    String[] colNames = {"C1", "C2", "C3"};        // column headings
    int[][] table = { {1, 2, 3}, {4, 5, 6} };      // the data
    int[] rowTotals = RowTotals(table);            // calculate BEFORE printing

    System.out.println("TITLE FROM THE PAPER");    // 1. title
    System.out.println("--------------------");    //    dashes

    System.out.print("      ");                    // 2. heading: space for the label column
    for (int col = 0; col < colNames.length; col++)    // one pass per heading
    {
        System.out.print(colNames[col] + " ");     // print: stay on the line
    }
    System.out.println();                          // end the heading line

    for (int row = 0; row < table.length; row++)   // 3. rows: outer loop = lines
    {
        System.out.print(rowNames[row] + ": ");    // the label for the CURRENT row
        for (int col = 0; col < table[row].length; col++)  // inner loop = values across
        {
            System.out.print(table[row][col] + " ");   // stay on the line
        }
        System.out.println();                      // end THIS row, after the inner loop
    }

    System.out.println("--------------------");    // 4. summary
    for (int row = 0; row < rowNames.length; row++)    // one line per row
    {
        System.out.println("Total for " + rowNames[row] + ": " + rowTotals[row]);   // same index
    }
}

// ======================================================================
// 4b. PRINT A REPORT WITH ALL THE SUMMARIES (tested: matches 3150 / 350 / 610 / 150)
// ======================================================================
public void PrintFullReport()
{
    String[] rowNames = {"Year 1", "Year 2", "Year 3"};            // row labels
    String[] colNames = {"Surfboards", "Wetsuits", "Bodyboards"};  // column headings
    int[][] table = { {520, 380, 150}, {610, 340, 210}, {450, 290, 200} };   // the data
    int[] rowTotals = RowTotals(table);            // calculate everything BEFORE printing
    int[] colTotals = ColumnTotals(table);
    int[] hi = WhereIsHighest(table);              // {row, column} of the highest
    int[] lo = WhereIsLowest(table);               // {row, column} of the lowest

    // ---- block 1: title ----
    System.out.println("SALES REPORT");
    System.out.println("-------------------------------------------");

    // ---- block 2: heading row ----
    System.out.print("        ");                  // space for the label column
    for (int col = 0; col < colNames.length; col++)
    {
        System.out.print(colNames[col] + "  ");
    }
    System.out.println();

    // ---- block 3: data rows ----
    for (int row = 0; row < table.length; row++)
    {
        System.out.print(rowNames[row] + ": ");
        for (int col = 0; col < table[row].length; col++)
        {
            System.out.print(table[row][col] + "         ");
        }
        System.out.println();                      // after the inner loop
    }
    System.out.println("-------------------------------------------");

    // ---- block 4: summary ----
    for (int row = 0; row < rowNames.length; row++)             // row totals
    {
        System.out.println("Total for " + rowNames[row] + ": " + rowTotals[row]);
    }
    for (int col = 0; col < colNames.length; col++)             // column totals
    {
        System.out.println("Total for " + colNames[col] + ": " + colTotals[col]);
    }
    System.out.println("Grand total: " + GrandTotal(table));
    System.out.println("Average: " + Math.round(AverageOfTable(table)));   // rounded for printing only
    System.out.println("Highest: " + HighestInTable(table) + " (" + rowNames[hi[0]] + ", " + colNames[hi[1]] + ")");
    System.out.println("Lowest: " + LowestInTable(table) + " (" + rowNames[lo[0]] + ", " + colNames[lo[1]] + ")");
    System.out.println("Best row: " + BestRowName(rowNames, table));
    System.out.println("Best column: " + BestColumnName(colNames, table));
    System.out.println("Over 400: " + CountOverInTable(table, 400));
}
// Output of the above:
//   Total for Year 1: 1050 ... Grand total: 3150   Average: 350
//   Highest: 610 (Year 2, Surfboards)   Lowest: 150 (Year 1, Bodyboards)
//   Best row: Year 2   Best column: Surfboards   Over 400: 3

// ======================================================================
// 5. INTERFACE + CLASS (Q1 movie example)
// ======================================================================
// ---------- interface: its own file, signatures only (no body, no static) ----------
public interface IMovieTickets
{
    int TotalMovieSales(int[] movieTicketSales);               // copy the signatures EXACTLY
    String TopMovie(String[] movies, int[] totalSales);
}

// ---------- class: its own file, same package line ----------
public class MovieTickets implements IMovieTickets            // implements links it to the interface
{
    @Override                                                  // red here = package or signature mismatch
    public int TotalMovieSales(int[] movieTicketSales)
    {
        int sum = 0;                                           // start at 0
        for (int i = 0; i < movieTicketSales.length; i++)      // every item
        {
            sum = sum + movieTicketSales[i];                   // add the value
        }
        return sum;                                            // after the loop
    }

    @Override
    public String TopMovie(String[] movies, int[] totalSales)
    {
        int best = 0;                                          // first is best so far
        for (int i = 1; i < totalSales.length; i++)            // check the rest
        {
            if (totalSales[i] > totalSales[best])              // compare the NUMBERS
            {
                best = i;                                      // keep the position
            }
        }
        return movies[best];                                   // return the NAME
    }
}

// ======================================================================
// 5b. DATA CLASS (getters and setters)
// ======================================================================
public class MovieTicketData
{
    private String movieName;                      // private: reached only through getters and setters
    private int numberOfTickets;
    private double ticketPrice;

    public MovieTicketData()                       // empty constructor: no parameters
    {
    }

    public String getMovieName()                   // getter: returns the value
    {
        return movieName;
    }

    public void setMovieName(String movieName)     // setter: stores a value, returns nothing
    {
        this.movieName = movieName;
    }

    public int getNumberOfTickets() { return numberOfTickets; }                     // same pattern
    public void setNumberOfTickets(int numberOfTickets) { this.numberOfTickets = numberOfTickets; }
    public double getTicketPrice() { return ticketPrice; }
    public void setTicketPrice(double ticketPrice) { this.ticketPrice = ticketPrice; }
}

// ======================================================================
// 5c. INTERFACE FOR A WHOLE-TABLE Q1 (2025 / mock style): every method takes the 2D array
// ======================================================================
public interface ITicketSales
{
    int TotalTicketSales(int[][] ticketSales);         // bodies: copy GrandTotal (section 2)
    double AverageTicketSales(int[][] ticketSales);    // bodies: copy AverageOfTable (section 2c)
    int HighestSale(int[][] ticketSales);              // bodies: copy HighestInTable (section 2b)
    int LowestSale(int[][] ticketSales);               // bodies: copy LowestInTable (section 2c)
}
// class: public class TicketSales implements ITicketSales { @Override public int TotalTicketSales(...) ... }
// Rename the parameter and method names to match the paper. Keep @Override above every method.

// ======================================================================
// 6. MAIN USING A CLASS (pass a row to a 1D method)
// ======================================================================
public static void main(String[] args)
{
    String[] movieNames = {"Napoleon", "Oppenheimer"};         // row labels
    int[][] sales = { {3000, 1500, 1700}, {3500, 1200, 1600} };    // each row is one movie
    int[] totals = new int[movieNames.length];                 // one box per movie
    MovieTickets tickets = new MovieTickets();                 // call methods on the OBJECT

    for (int row = 0; row < sales.length; row++)               // one pass per movie
    {
        totals[row] = tickets.TotalMovieSales(sales[row]);     // a whole row is a 1D array
    }

    System.out.println("Top performing movie: " + tickets.TopMovie(movieNames, totals));
}

// ======================================================================
// 6b. MAIN FOR A TABLE CLASS: print the table, then total, average, highest, lowest
// ======================================================================
public static void main(String[] args)
{
    String[] seasons = {"SUMMER", "AUTUMN", "WINTER", "SPRING"};      // headings (1D array)
    int[][] sales = { {420, 310, 180, 390}, {450, 280, 220, 390} };   // row = year, column = season
    TicketSales ticketSales = new TicketSales();                      // object of the class

    System.out.println("THEATRE TICKET SALES REPORT - 2026");         // title
    System.out.println("----------------------------------------------");

    System.out.print("          ");                                   // heading row: label space
    for (int i = 0; i < seasons.length; i++)
    {
        System.out.print(seasons[i] + " ");                           // 6 letters + 1 space = 7
    }
    System.out.println();

    for (int row = 0; row < sales.length; row++)                      // data rows
    {
        System.out.print("YEAR " + (row + 1) + "    ");              // label
        for (int col = 0; col < sales[row].length; col++)
        {
            System.out.print(sales[row][col] + "    ");               // 3 digits + 4 spaces = 7
        }
        System.out.println();                                         // after the inner loop
    }
    System.out.println("----------------------------------------------");

    // summary: every number comes from a method call, nothing is calculated in main
    System.out.println("Total tickets sold:   " + ticketSales.TotalTicketSales(sales));
    System.out.println("Average per season:   " + Math.round(ticketSales.AverageTicketSales(sales)));   // whole number
    System.out.println("Highest season:       " + ticketSales.HighestSale(sales));
    System.out.println("Lowest season:        " + ticketSales.LowestSale(sales));
}

// ======================================================================
// 7. Q2: FIELDS, IMPORTS, ONE-LINERS
// ======================================================================
// class-level fields (top of the form class, under the logger line)
PayCalculator calculator = new PayCalculator();   // one logic object for the whole form
int recordCount = 0;                              // how many records so far
double totalPay = 0;                              // running total of all the pay
String fileText = "";                             // lines for the file, built up as records are added
final int MAX_RECORDS = 5;                        // the paper's record limit

// imports (under the package line)
import javax.swing.JOptionPane;                   // message dialogs
import java.io.*;                                 // FileWriter, FileReader, BufferedReader, IOException

// constructor: make fields read-only if not ticked in the Properties window
public MyForm()
{
    initComponents();                             // keep this first
    txtReport.setEditable(false);                 // read-only report area
}

// useful one-liners
String text = txtName.getText();                  // read a text field
int n = Integer.parseInt(txtQty.getText());       // whole number (can throw NumberFormatException)
double d = Double.parseDouble(txtPrice.getText());   // decimal number
String choice = cmbMovie.getSelectedItem().toString();   // combo box selection
boolean ticked = chkMember.isSelected();          // check box
txtOut.setText(String.format("R%.2f", amount));   // R342.00
txtReport.append("line\n");                       // add a line to the text area

// ======================================================================
// 8. TRY / CATCH
// ======================================================================
// try / catch pattern (declare variables BEFORE the try; return stops the method)
int quantity;
try
{
    quantity = Integer.parseInt(txtQty.getText());          // fails on abc, 2.5 and empty text
}
catch (NumberFormatException ex)
{
    JOptionPane.showMessageDialog(this, "Please enter a whole number.");
    return;
}

// ======================================================================
// 9. VALIDATION, VAT, DISCOUNT (logic class)
// ======================================================================
public boolean ValidateData(MovieTicketData movieTicketData)    // the DATA CLASS type, not Object
{
    if (movieTicketData.getMovieName().trim().isEmpty())       // call getters on the OBJECT (lowercase m)
    {                                                          // NO ; after the if condition
        return false;                                          // rule 1: name cannot be empty
    }
    if (movieTicketData.getTicketPrice() <= 0)                 // rule 2: price above zero
    {
        return false;
    }
    if (movieTicketData.getNumberOfTickets() <= 0)             // rule 3: tickets above zero
    {
        return false;
    }
    return true;                                               // all rules passed
}

public double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice)
{
    double subtotal = numberOfTickets * ticketPrice;           // tickets times price
    double vat = subtotal * 0.14;                              // VAT rate from the paper (0.15 = 15%)
    return subtotal + vat;                                     // + not *1.14: gives exactly 342.0
}

public double CalculateDiscount(double subtotal, int quantity, boolean isMember)
{
    double rate;                                               // set by the chain below
    if (isMember && quantity >= 5)                             // most specific condition FIRST
    {
        rate = 0.15;
    }
    else if (isMember)
    {
        rate = 0.10;
    }
    else if (quantity >= 5)
    {
        rate = 0.05;
    }
    else
    {
        rate = 0;
    }
    return subtotal * rate;                                    // rand amount, not the rate
}

// ======================================================================
// 10. PROCESS METHOD (GUI): capture, validate, calculate, report, save
// ======================================================================
private void ProcessTickets()
{
    // 1. capture the input
    String movie = cmbMovie.getSelectedItem().toString();      // combo box item as text
    int tickets;                                               // declared BEFORE the try
    double price;
    try
    {
        tickets = Integer.parseInt(txtTickets.getText());      // whole number
        price = Double.parseDouble(txtPrice.getText());        // decimals allowed
    }
    catch (NumberFormatException ex)                           // text was not a number
    {
        JOptionPane.showMessageDialog(this, "Tickets and price must be numbers.");
        return;                                                // stop: never calculate with bad input
    }

    // 2. store in the data object, then validate
    MovieTicketData data = new MovieTicketData();              // create the data object
    data.setMovieName(movie);                                  // setters store the values
    data.setNumberOfTickets(tickets);
    data.setTicketPrice(price);

    MovieTickets movieTickets = new MovieTickets();            // object for the logic class
    if (!movieTickets.ValidateData(data))                      // ! = not valid
    {
        JOptionPane.showMessageDialog(this, "Please enter valid data.");
        return;                                                // stop
    }

    // 3. calculate and show the report
    double total = movieTickets.CalculateTotalTicketPrice(data.getNumberOfTickets(), data.getTicketPrice());
    String report = "MOVIE NAME: " + data.getMovieName() + "\n"           // \n starts the next line
                  + "MOVIE TICKET PRICE: R " + data.getTicketPrice() + "\n"
                  + "NUMBER OF TICKETS: " + data.getNumberOfTickets() + "\n"
                  + "TOTAL TICKET PRICE: R " + total + "\n";
    txtReport.setText(report);                                 // read-only text area

    // 4. save to the file named in the paper (include the extension)
    try (FileWriter writer = new FileWriter("report.txt"))
    {
        writer.write("MOVIE TICKET REPORT\n");
        writer.write("***********************************\n");
        writer.write(report);
        writer.write("***********************************\n");
    }
    catch (IOException ex)
    {
        JOptionPane.showMessageDialog(this, "Could not save the report.");
    }
}

// ======================================================================
// 11. EVENTS, CLEAR, EXIT
// ======================================================================
private void mniProcessActionPerformed(java.awt.event.ActionEvent evt)
{
    ProcessTickets();                              // menu item calls the shared method
}
private void btnProcessActionPerformed(java.awt.event.ActionEvent evt)
{
    ProcessTickets();                              // the button calls the SAME method (no duplicate code)
}
private void mniClearActionPerformed(java.awt.event.ActionEvent evt)
{
    ClearForm();                                   // shared clear method
}
private void mniExitActionPerformed(java.awt.event.ActionEvent evt)
{
    System.exit(0);                                // closes the application
}

private void ClearForm()
{
    cmbMovie.setSelectedIndex(0);                  // back to the first item
    txtTickets.setText("");                        // empty the text fields
    txtPrice.setText("");
    txtReport.setText("");                         // empty the report
    // list-style forms: also reset recordCount = 0; totalPay = 0; fileText = "";
}

// ======================================================================
// 12. CAPTURE UP TO 5 RECORDS
// ======================================================================
private void AddRecord()                           // capture-up-to-5-records pattern
{
    if (recordCount >= MAX_RECORDS)                // NO semicolon after the if condition
    {
        JOptionPane.showMessageDialog(this, "Only 5 records are allowed.");
        return;                                    // stop, do not add a sixth
    }
    // ... read, try/catch, validate, calculate (as in ProcessTickets) ...
    txtRecords.append(name + " - " + hours + " hours - R" + String.format("%.2f", pay) + "\n");   // show it
    fileText = fileText + name + "," + hours + "," + rate + "," + String.format("%.2f", pay) + "\n";   // keep the file line
    recordCount = recordCount + 1;                 // one more record
    totalPay = totalPay + pay;                     // running total
    txtCount.setText("" + recordCount);            // refresh the labels
    txtTotalPay.setText(String.format("R%.2f", totalPay));
}

// ======================================================================
// 13. FILES: save, append, load, split
// ======================================================================
import java.io.*;                                              // FileWriter, FileReader, BufferedReader, IOException

public static void SaveAll(String fileText)                    // overwrite: saves EVERYTHING at once
{
    try (FileWriter writer = new FileWriter("staff.txt"))      // closed automatically at the end
    {
        writer.write(fileText);                                // the lines, each ending in \n
    }
    catch (IOException ex)                                     // file problems
    {
        System.out.println("Could not save the file.");        // GUI: JOptionPane.showMessageDialog(this, ...)
    }
}

public static void AppendLine(String line)                     // append: adds ONE line, keeps the old ones
{
    try (FileWriter writer = new FileWriter("staff.txt", true))    // true = append
    {
        writer.write(line + "\n");                             // \n ends every line
    }
    catch (IOException ex)
    {
        System.out.println("Could not save the record.");
    }
}

public static void LoadAll()
{
    int count = 0;                                             // declared BEFORE the try
    double totalPay = 0;                                       // running total

    try (BufferedReader reader = new BufferedReader(new FileReader("staff.txt")))
    {
        String line = reader.readLine();                       // first line (null = file ended)
        while (line != null)                                   // until there are no more lines
        {
            String[] parts = line.split(",");                  // "Thandi,45.0,100.0,4750.00" -> 4 pieces
            System.out.println(parts[0] + " - " + parts[1] + " hours - R" + parts[3]);   // use the pieces
            count = count + 1;                                 // count the record
            totalPay = totalPay + Double.parseDouble(parts[3]);    // pieces are Strings: convert to do maths
            line = reader.readLine();                          // read the NEXT line: the loop moves forward
        }
    }
    catch (IOException ex)                                     // missing file lands here, no crash
    {
        System.out.println("Could not read the file.");
    }

    System.out.println("Records: " + count);                   // after the loop
    System.out.println("Total pay: R" + totalPay);
}

// ======================================================================
// 14. UNIT TESTS
// ======================================================================
package com.mycompany.yourpackage;                 // same package as the class being tested

import org.junit.jupiter.api.Test;                 // JUnit 5
import static org.junit.jupiter.api.Assertions.*;  // assertEquals, assertTrue, assertFalse

public class MovieTicketsTest
{
    @Test
    public void CalculateTotal_ReturnsTotal()      // EXACT name from the paper
    {
        // Arrange: create the object and the test values
        MovieTickets tickets = new MovieTickets();
        // Act: call the method
        double result = tickets.CalculateTotalTicketPrice(3, 100);
        // Assert: EXPECTED first, then actual, then delta for doubles
        assertEquals(342.0, result, 0.01);         // worked out by hand
    }

    @Test
    public void ValidateData_ReturnsFalseForZeroPrice()
    {
        MovieTickets tickets = new MovieTickets();             // Arrange
        MovieTicketData data = new MovieTicketData();          // build a data object with ONE bad value
        data.setMovieName("Napoleon");
        data.setNumberOfTickets(3);
        data.setTicketPrice(0);                                // the invalid value
        boolean result = tickets.ValidateData(data);           // Act
        assertFalse(result);                                   // Assert: expected false
    }

    // ---- 2D TABLE TESTS: the table is declared INSIDE the test (Arrange) ----
    @Test
    public void CalculateTotalTicketSales_ReturnsTotalTicketSales()
    {
        TicketSales ticketSales = new TicketSales();                       // Arrange: the object
        int[][] data = { {420, 310, 180, 390}, {450, 280, 220, 390} };     // Arrange: the table
        int actual = ticketSales.TotalTicketSales(data);                   // Act
        assertEquals(2640, actual);                                        // Assert: int, no delta
    }

    @Test
    public void AverageTicketSales_ReturnsAverageTicketSales()
    {
        TicketSales ticketSales = new TicketSales();                       // Arrange
        int[][] data = { {420, 310, 180, 390}, {450, 280, 220, 390} };
        double actual = ticketSales.AverageTicketSales(data);              // Act
        assertEquals(330, actual, 0.01);                                   // Assert: the METHOD returns the exact value
    }                                                                      // (2200 / 6 = 366.67, NOT the rounded 367)

    @Test
    public void HighestSale_ReturnsHighestSale()
    {
        TicketSales ticketSales = new TicketSales();                       // Arrange
        int[][] data = { {420, 310, 180, 390}, {450, 280, 220, 390} };
        int actual = ticketSales.HighestSale(data);                        // Act
        assertEquals(450, actual);                                         // Assert (lowest: 180)
    }

    // ints and Strings: assertEquals(6200, result);   assertEquals("Oppenheimer", result);  (no delta)
    // arrays: assertEquals on single elements, e.g. assertEquals(370, totals[0]);
    // RULE: work out by hand what the method RETURNS, then write that as the expected value.
}

// ======================================================================
// 15. COMMENTS TO REUSE
// ======================================================================
// ---- comment lines to reuse ----
// declare the data used in the report
// one box per row / one box per item
// start the total at 0 before the loop
// visit every item in the array
// add the current value to the total
// assume the first value is the highest so far
// replace it when a higher value is found
// best holds the position of the best so far
// add 1 each time the condition is true
// return the name at the best position
// outer loop: each row / inner loop: each column in this row
// restart the row total for each row
// store the row total after the inner loop
// pass one whole row to the 1D method
// print the title / print the column headings on one line
// one row per item / move to the next line after each row
// print the summary lines / print the top item
// create the object, then call its methods
// interface lists the methods the class must provide
// private fields: reached only through getters and setters
// getter returns the value / setter stores the value
// Arrange: create the object and the test data
// Act: call the method being tested
// Assert: expected value first, then the actual result
// allowed difference of 0.01 for decimal numbers
// invalid data, so the method must return false
// make the report area read-only
// menu item calls the same method as the button
// Exit closes the application
// Clear empties the fields and resets the combo box
// declare before the try so they can be used after it
// convert the text to a number; fails if the text is not a number
// show a message and stop if the input is not a number
// validate before calculating
// name cannot be empty / price and quantity must be above zero
// calculate the subtotal / VAT on the amount after the discount / total includes the VAT
// build the report text, one line per value
// display the report in the text area
// closed automatically at the end of the try
// overwrite the file with all the records / true opens the file in append mode
// read until there are no more lines / split the line at the commas / read the next line
// show a message if the file cannot be saved
// returns the ... (one line above every method)
// start with the first value, not 0, so negative numbers still work
// lowest: same as highest but with <
// find which row and which column hold the highest value
// the best row is the row with the highest total
// best column: add down the column, then find the highest total
// rounded for printing only: the method keeps the decimals
*/
