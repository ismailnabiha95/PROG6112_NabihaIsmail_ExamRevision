# PROG6112 Exam Code Templates (Q1 and Q2)

General templates for the methods asked in the 2022 to 2025 papers. Copy a block, then rename the placeholders to the names in your paper.

- Every line has a comment. Keep real comments in the exam: comments are worth 3 of the 10 General Requirements marks.
- No `\t`, no `%7s`, no `assertArrayEquals`. Layout uses `print`, `println`, `\n`, dashed lines and the simple `printf("%.2f%n")`.
- The method templates in sections 3 to 5 were compiled and run against small test data.

## Contents

1. What the past papers asked
2. Read the paper in this order
3. Q1: 1D array methods
4. Q1: 2D array methods (rows, columns, whole table)
5. Q1: Decisions and calculations
6. Q1: Interface, class and data class
7. Q1: `main` and the report
8. Q2: GUI cheat sheet
9. Q2: Process, save, clear, exit (menu and buttons share one method)
10. Q2: Validation and exceptions
11. Q2: Files (write, append, read, list box)
12. Q2: A class that holds its own data (2025 style)
13. Unit tests
14. NetBeans tips
15. Slip checklist

---

## 1. What the past papers asked

| Year | Q1 methods | Q2 methods |
|---|---|---|
| 2022 | No interface. 2D array of property prices, total per province (row total). | GUI with a list box and combo boxes, max 5 records (error if more), write and read `travel.txt`, error if the start and end locations match. |
| 2023 | `EstateAgentSales(double[])` total, `EstateAgentCommission(double)` 2%, `TopEstateAgent(double[])` returns an **int position** | `CalculateCommission(String, String)` takes **Strings**, `ValidateData(Data)`, save to `report.txt`. |
| 2024 | `TotalMovieSales(int[])`, `TopMovie(String[], int[])` returns the **name** | `CalculateTotalTicketPrice(int, double)` with **14% VAT**, `ValidateData(MovieTicketData)`, save to `report.txt`. |
| 2025 | `TotalSales(int[][])`, `AverageSales(int[][])`, `MaxSale(int[][])`, `MinSale(int[][])`, all over the **whole table** | A class that **holds its own data** with getters and no parameters: `GetTotalSales()`, `GetSalesOverLimit()`, `GetSalesUnderLimit()`, `GetProductsProcessed()`, `GetAverageSales()`. Load and Save buttons, a read-only label, `data.txt`. |

**Most common to least common:**
1. Total (every paper)
2. Top or best, by position or by name (2023, 2024)
3. Calculate a price with VAT or commission (2023, 2024)
4. Validate: empty text, and `<= 0` is invalid (2023, 2024)
5. Max, min, average (2025)
6. Count over or under a limit (2025)
7. Save to a text file (every Q2)
8. Menus: File > Exit and Tools > ... (every Q2)
9. Unit tests: exact names from the paper, 2 to 3 per question

**Marks:** Q1 is 30 to 50, Q2 is 60, General Requirements are 10 (practice 3, efficiency 2, comments 3, compiles and runs 2).

---

## 2. Read the paper in this order

1. Read the **interface** first. It tells you the exact method names, parameter types and return types.
2. Check whether the methods take **parameters** (2023, 2024) or the class **holds its data** (2025).
3. Copy the **test names** exactly from the table, even if they wrap onto two lines.
4. Look at the **sample screenshots** and match the report text.
5. Check the **rubric**: every line is worth marks, so do every line, even a small one.
6. Spend the last 15 minutes on the General Requirements: comments, naming, no duplicated code, and run it.

---

## 3. Q1: 1D array methods

```java
// TOTAL of all items
public int Total(int[] values)                                  // use double[] and double if the data has decimals
{
    int sum = 0;                                                // start at 0, BEFORE the loop

    for (int i = 0; i < values.length; i++)                     // visit every item
    {
        sum = sum + values[i];                                  // add the current item
    }

    return sum;                                                 // after the loop
}

// AVERAGE
public double Average(int[] values)
{
    int sum = 0;                                                // start at 0

    for (int i = 0; i < values.length; i++)                     // visit every item
    {
        sum = sum + values[i];                                  // add it
    }

    return (double) sum / values.length;                        // cast BEFORE dividing so decimals are kept
}

// HIGHEST VALUE (use < for the lowest)
public int Highest(int[] values)
{
    int highest = values[0];                                    // start with the first value

    for (int i = 1; i < values.length; i++)                     // check the rest
    {
        if (values[i] > highest)                                // newcomer on the left
        {
            highest = values[i];                                // keep the VALUE
        }
    }

    return highest;                                             // after the loop
}

// POSITION of the highest (use < for the lowest)
public int PositionOfHighest(int[] values)
{
    int best = 0;                                               // the first position is the best so far

    for (int i = 1; i < values.length; i++)                     // check the rest
    {
        if (values[i] > values[best])                           // newcomer on the left, champion on the right
        {
            best = i;                                           // keep the POSITION
        }
    }

    return best;                                                // add 1 if the question wants a 1-based number
}

// NAME of the highest (parallel arrays: same order, same length)
public String NameOfHighest(String[] names, double[] values)
{
    int best = 0;                                               // the first position is the best so far

    for (int i = 1; i < values.length; i++)                     // check the rest
    {
        if (values[i] > values[best])                           // compare the numbers
        {
            best = i;                                           // keep the position
        }
    }

    return names[best];                                         // look up the label at that position
}

// COUNT items that meet a condition
public int CountOver(int[] values, int limit)
{
    int count = 0;                                              // start at 0, BEFORE the loop

    for (int i = 0; i < values.length; i++)                     // visit every item
    {
        if (values[i] > limit)                                  // > over, < below, >= at least, <= at most
        {
            count = count + 1;                                  // add 1, never i
        }
    }

    return count;                                               // after the loop
}

// COUNT items equal to a text (Strings use equals, never ==)
public int CountMatches(String[] items, String target)
{
    int count = 0;                                              // start at 0

    for (int i = 0; i < items.length; i++)                      // visit every item
    {
        if (items[i].equals(target))                            // equals() compares the text
        {
            count = count + 1;                                  // add 1
        }
    }

    return count;                                               // after the loop
}

// SEARCH: is a value in the array?
public boolean Contains(int[] values, int target)
{
    for (int i = 0; i < values.length; i++)                     // visit every item
    {
        if (values[i] == target)                                // == is fine for numbers
        {
            return true;                                        // found it: stop straight away
        }
    }

    return false;                                               // checked every item and found nothing
}

// TOTAL of only the items that meet a condition
public int TotalOver(int[] values, int limit)
{
    int sum = 0;                                                // start at 0

    for (int i = 0; i < values.length; i++)                     // visit every item
    {
        if (values[i] > limit)                                  // only the ones that qualify
        {
            sum = sum + values[i];                              // add the VALUE (counting adds 1)
        }
    }

    return sum;                                                 // after the loop
}

// PERCENTAGE of the items that meet a condition
public double PercentOver(int[] values, int limit)
{
    int count = 0;                                              // how many qualify

    for (int i = 0; i < values.length; i++)                     // visit every item
    {
        if (values[i] > limit)                                  // the condition
        {
            count = count + 1;                                  // add 1
        }
    }

    return (double) count / values.length * 100;                // cast first, then multiply by 100
}

// BUILD a new array from calculations
public double[] AddVat(double[] prices)
{
    double[] result = new double[prices.length];                // same size as the input, NOT {}

    for (int i = 0; i < prices.length; i++)                     // visit every item
    {
        result[i] = prices[i] * 1.15;                           // one answer per box
    }

    return result;                                              // the whole array
}
```

---

## 4. Q1: 2D array methods

Reminders:
- `table.length` is the rows, and `table[row].length` is the columns.
- `table[row]` is a whole row (an `int[]`). `table[row][col]` is one value. Row first, then column.
- Inner loop condition uses `table[row].length`, never `col`.

```java
// TOTAL of ONE ROW (pass one row: table[r])
public int RowTotal(int[] row)
{
    int total = 0;                                              // start at 0

    for (int i = 0; i < row.length; i++)                        // every value in that row
    {
        total = total + row[i];                                 // add it
    }

    return total;                                               // after the loop
}

// TOTAL of EVERY ROW, one box per row
public int[] AllRowTotals(int[][] table)
{
    int[] totals = new int[table.length];                       // one box per row

    for (int row = 0; row < table.length; row++)                // each row
    {
        int rowTotal = 0;                                       // restart for every row

        for (int col = 0; col < table[row].length; col++)       // each column in this row
        {
            rowTotal = rowTotal + table[row][col];              // row first, then column
        }

        totals[row] = rowTotal;                                 // store this row's total
    }

    return totals;                                              // the whole array
}

// TOTAL of EVERY COLUMN (column loop on the OUTSIDE)
public int[] ColumnTotals(int[][] table)
{
    int[] totals = new int[table[0].length];                    // one box per column

    for (int col = 0; col < table[0].length; col++)             // OUTER: each column
    {
        int colTotal = 0;                                       // restart for every column

        for (int row = 0; row < table.length; row++)            // INNER: each row
        {
            colTotal = colTotal + table[row][col];              // row first, then column
        }

        totals[col] = colTotal;                                 // store this column's total
    }

    return totals;                                              // the whole array
}

// GRAND TOTAL of the whole table (2025: TotalSales)
public int GrandTotal(int[][] table)
{
    int total = 0;                                              // before BOTH loops

    for (int row = 0; row < table.length; row++)                // each row
    {
        for (int col = 0; col < table[row].length; col++)       // each column (row here, NOT col)
        {
            total = total + table[row][col];                    // add every single value
        }
    }

    return total;                                               // after both loops
}

// AVERAGE of the whole table (2025: AverageSales)
public double AverageOfTable(int[][] table)
{
    int sum = 0;                                                // total of all values
    int count = 0;                                              // how many values there are

    for (int row = 0; row < table.length; row++)                // each row
    {
        for (int col = 0; col < table[row].length; col++)       // each column
        {
            sum = sum + table[row][col];                        // add the value
            count = count + 1;                                  // count the value
        }
    }

    return (double) sum / count;                                // cast first, divide after the loops
}

// HIGHEST in the table (2025: MaxSale)
public int HighestInTable(int[][] table)
{
    int highest = table[0][0];                                  // the first value in the table

    for (int row = 0; row < table.length; row++)                // each row
    {
        for (int col = 0; col < table[row].length; col++)       // each column
        {
            if (table[row][col] > highest)                      // newcomer on the left
            {
                highest = table[row][col];                      // keep the VALUE
            }
        }
    }

    return highest;                                             // after both loops
}

// LOWEST in the table (2025: MinSale): same as above, but with <
public int LowestInTable(int[][] table)
{
    int lowest = table[0][0];                                   // the first value in the table

    for (int row = 0; row < table.length; row++)                // each row
    {
        for (int col = 0; col < table[row].length; col++)       // each column
        {
            if (table[row][col] < lowest)                       // newcomer on the left, < for the lowest
            {
                lowest = table[row][col];                       // keep the VALUE
            }
        }
    }

    return lowest;                                              // after both loops
}

// COUNT values below a limit in the whole table (use > for "over")
public int CountInTable(int[][] table, int limit)
{
    int count = 0;                                              // before BOTH loops

    for (int row = 0; row < table.length; row++)                // each row
    {
        for (int col = 0; col < table[row].length; col++)       // each column
        {
            if (table[row][col] < limit)                        // the condition
            {
                count = count + 1;                              // add 1
            }
        }
    }

    return count;                                               // after both loops
}
```

---

## 5. Q1: Decisions and calculations

```java
// if / else if chain: check the highest boundary FIRST
public String Category(double value)
{
    if (value >= 80)                                            // highest boundary first
    {
        return "A";                                             // return ends the method here
    }
    else if (value >= 60)                                       // only reached if the first check failed
    {
        return "B";
    }
    else                                                        // everything else
    {
        return "C";
    }
}

// Combine conditions: && means AND, || means OR
if (days > 0 && rate > 0)                                       // both must be true
{
    // valid
}
if (text.isEmpty() || text.equals("None"))                      // either one is enough
{
    // invalid
}

// Calculate with a constant and VAT (2024: 14%)
private static final double VAT_RATE = 0.14;                    // constant: ALL_CAPS, at the top of the class

public double CalculateTotalPrice(int quantity, double price)
{
    double subtotal = quantity * price;                         // price before VAT
    return subtotal + (subtotal * VAT_RATE);                    // add the VAT
}

// Commission as a percentage (2023: 2% in Q1, a typed percentage in Q2)
public double EstateAgentCommission(double propertySales)
{
    return propertySales * 0.02;                                // 2% of the sales
}

// Calculations that take Strings (2023 Q2): parse inside the method
public double CalculateCommission(String propertyPrice, String agentCommission)
{
    double price = Double.parseDouble(propertyPrice);           // text to number
    double percentage = Double.parseDouble(agentCommission);    // text to number
    return price * percentage / 100;                            // 5 means 5%: check whether the sample uses 5 or 0.05
}
```

---

## 6. Q1: Interface, class and data class

```java
public interface IName                                          // name from the paper
{
    double MethodOne(int[] values);                             // signature only: no body, no static
    boolean MethodTwo(DataClass data);                          // a method can take an object as a parameter
}

public class ClassName implements IName                         // implements links the class to the interface
{
    @Override                                                   // fulfils an interface method
    public double MethodOne(int[] values)                       // exact signature from the interface
    {
        return 0;                                               // replace with your logic
    }

    @Override
    public boolean MethodTwo(DataClass data)
    {
        return true;                                            // replace with your logic
    }
}

public class DataClass                                          // holds related values (textbook style)
{
    private String text;                                        // fields are private
    private int number;                                         // another field

    public DataClass()                                          // empty constructor
    {
    }

    public String getText() { return text; }                    // getter returns the field
    public void setText(String text) { this.text = text; }      // setter: this.text is the field

    public int getNumber() { return number; }                   // getter
    public void setNumber(int number) { this.number = number; } // setter
}

// Using them in main or in the form
ClassName obj = new ClassName();                                // object: lowercase first letter
DataClass data = new DataClass();                               // create the data object
data.setText("abc");                                            // fill it with setters
data.setNumber(5);                                              // fill it with setters
double answer = obj.MethodOne(someArray);                       // call on the OBJECT, never the class name
```

Rules:
- Method names, parameters and return types match the paper **exactly**, including capital letters.
- Interface methods have no body and no `static`.
- The class and the interface may have different names (for example `IProduct` and `ProductSales` in 2025).
- If a class gives red lines under `@Override`, check the `package` line and that every signature matches.

---

## 7. Q1: `main` and the report

```java
String[] names = {"Shop 1", "Shop 2"};                          // row labels
String[] quarters = {"Q1", "Q2", "Q3", "Q4"};                   // column labels
int[][] table = { {420, 380, 510, 450},                         // row 0
                  {390, 460, 300, 520} };                       // row 1

Bakery bakery = new Bakery();                                   // object: lowercase first letter
int[] rowTotals = new int[names.length];                        // result array: ALWAYS give it a size, NOT {}

for (int row = 0; row < names.length; row++)                    // fill it, one box per row
{
    rowTotals[row] = bakery.RowTotal(table[row]);               // table[row] is one whole row
}

System.out.println("REPORT TITLE");                             // heading
System.out.println("------------");                             // dashed line

System.out.print("PERIOD: ");                                   // column labels on one line
for (int col = 0; col < quarters.length; col++)                 // each column label
{
    System.out.print(quarters[col] + " ");                      // print stays on the line
}
System.out.println();                                           // end the line

for (int row = 0; row < names.length; row++)                    // one line per row
{
    System.out.print(names[row] + ": ");                        // the row label
    for (int col = 0; col < table[row].length; col++)           // each value in this row
    {
        System.out.print(table[row][col] + " ");                // the value and a space
    }
    System.out.println();                                       // AFTER the inner loop
}

System.out.println("------------");                             // dashed line before the summary
System.out.println("Total: " + bakery.TotalSales(table));       // text + method result
System.out.printf("Average: %.2f%n", bakery.AverageSales(table));   // simple printf: 2 decimals and a new line
System.out.println("Highest: " + bakery.MaxSale(table));        // call on the OBJECT
System.out.println("Lowest: " + bakery.MinSale(table));         // call on the OBJECT
System.out.println("Top: " + bakery.NameOfHighest(names, totalsAsDoubles));   // a name from parallel arrays (names and values in the same order)
```

Printing helpers:
- `print` stays on the line, `println` ends it, and `println()` with nothing inside just ends the line.
- `printf("%s: %.2f%n", name, value)`: `%s` is a text slot, `%.2f` is a decimal rounded to 2 places, `%n` is a new line. The values go in the same order as the slots.
- Declare totals right before their loop. A loop counter (`int i`) is not visible after the loop.

---

## 8. Q2: GUI cheat sheet

| Component | Prefix | Common calls |
|---|---|---|
| Frame | `frm` | `setTitle("...")`, `setLocationRelativeTo(null)` |
| Panel | `pnl` | holds other components |
| Label | `lbl` | `setText("...")` |
| Text field | `txt` | `getText()`, `setText("")`, `requestFocus()` |
| Text area | `txa` | `setText("...")`, `append("...\n")`, `getText()`, `setEditable(false)` |
| Scroll pane | `scr` | holds a text area or list |
| Button | `btn` | double-click in NetBeans to create the event |
| Combo box | `cmb` | `getSelectedItem().toString()`, `getSelectedIndex()`, `setSelectedIndex(0)` |
| Check box | `chk` | `isSelected()`, `setSelected(false)` |
| Radio button | `rdo` | `isSelected()`, grouped in a `grp` button group |
| List | `lst` | `getSelectedValue()`, `setModel(model)` |
| Table | `tbl` | holds rows and columns |
| Menu bar, menu, item | `mnb`, `mnu`, `mni` | the item uses `actionPerformed` like a button |

Build checklist:
- Change every variable name to its prefix (`txtDays`, `btnProcess`, `mniExit`).
- Clear the default text (`jTextField1`, `jTextArea1`) and fill the combo box items.
- Set the text area to **read-only**: `txaOutput.setEditable(false);` or untick *editable*.
- Attach the menu bar to the frame, with `File > Exit` and `Tools > ...` as the paper says.
- Create events with *Events > Action > actionPerformed*. Don't leave empty handlers behind.
- Rename or delete the auto-generated main class if its name clashes with your class (for example `CarRental`).

---

## 9. Q2: Process, save, clear, exit

Menu items must call **the same logic** as the buttons. Write each piece of logic once, in a method, and call it from both.

```java
private String lastResult = "";                                 // field: the last processed text, used by Save

private void processData()                                      // ONE method, called by the button AND the menu item
{
    try                                                         // anything that can throw goes in here
    {
        String item = cmbItem.getSelectedItem().toString();    // the chosen combo box item
        int quantity = Integer.parseInt(txtQuantity.getText()); // throws NumberFormatException if not a whole number
        double price = Double.parseDouble(txtPrice.getText());  // throws NumberFormatException if not a number

        ItemData data = new ItemData();                         // create the data object in the FORM
        data.setItem(item);                                     // fill it with setters
        data.setQuantity(quantity);                             // quantity
        data.setPrice(price);                                   // price

        ItemService service = new ItemService();                // object of the class (lowercase first letter)

        if (!service.ValidateData(data))                        // ! means "not valid"
        {
            JOptionPane.showMessageDialog(this, "Quantity and price must be greater than 0");   // tell the user
            return;                                             // stop here, do not calculate
        }

        double total = service.CalculateTotalPrice(quantity, price);   // the calculation
        lastResult = item + "," + quantity + "," + total;       // text for the file, comma separated

        txaOutput.setText("SALES REPORT\n");                    // heading, \n is a new line
        txaOutput.append("------------\n");                     // dashed line
        txaOutput.append("Item: " + item + "\n");               // item
        txaOutput.append("Quantity: " + quantity + "\n");       // quantity
        txaOutput.append("Total: R" + total + "\n");            // total
    }
    catch (NumberFormatException ex)                            // text was not a number
    {
        JOptionPane.showMessageDialog(this, "Please enter numbers only");   // friendly message
    }
}

private void clearForm()                                        // the Clear method
{
    txtQuantity.setText("");                                    // empty text fields
    txtPrice.setText("");                                       // empty the price
    cmbItem.setSelectedIndex(0);                                // reset combo boxes
    chkOption.setSelected(false);                               // untick check boxes
    txaOutput.setText("");                                      // empty the output
    lastResult = "";                                            // nothing left to save
    txtQuantity.requestFocus();                                 // put the cursor back
}

private void btnProcessActionPerformed(java.awt.event.ActionEvent evt)    // created by double-clicking the button
{
    processData();                                              // reuse the method
}

private void mniProcessActionPerformed(java.awt.event.ActionEvent evt)    // the menu item does the same thing
{
    processData();                                              // same method, written once
}

private void mniExitActionPerformed(java.awt.event.ActionEvent evt)       // File > Exit
{
    System.exit(0);                                             // close the program
}
```

Imports at the top of the form: `javax.swing.JOptionPane`, `java.io.FileWriter`, `java.io.FileReader`, `java.io.BufferedReader`, `java.io.IOException`, `javax.swing.DefaultListModel`.

---

## 10. Q2: Validation and exceptions

Validation rules in the papers: "cannot be empty" and "cannot be less than or equal to zero". Write the **valid** case as the check, and return `false` for everything else.

```java
// Validate: returns true only when ALL checks pass (2023 and 2024)
@Override
public boolean ValidateData(ItemData data)
{
    if (data.getItem() == null || data.getItem().isEmpty())     // check null first, then empty
    {
        return false;                                           // invalid
    }
    if (data.getQuantity() <= 0 || data.getPrice() <= 0)        // zero or negative is invalid
    {
        return false;                                           // invalid
    }
    return true;                                                // passed every check
}

// Catching bad input (text that is not a number)
try                                                             // risky code goes inside
{
    int number = Integer.parseInt(text);                        // throws NumberFormatException if it is not a whole number
    double decimal = Double.parseDouble(text);                  // same for decimals
}
catch (NumberFormatException ex)                                // runs only when the parse fails
{
    JOptionPane.showMessageDialog(this, "Numbers only");        // message to the user
}
```

Notes:
- Use `equals()` for text, never `==`.
- Put `return;` after an error message so the method stops.
- Create the data object in the **form**, not inside `ValidateData`: the paper-given signature already takes it as a parameter.

---

## 11. Q2: Files

```java
// SAVE a report: true means append, leave it out to overwrite
private void saveReport()
{
    if (txaOutput.getText().isEmpty())                          // nothing to save yet
    {
        JOptionPane.showMessageDialog(this, "Nothing to save"); // tell the user
        return;                                                 // stop
    }

    try (FileWriter writer = new FileWriter("report.txt"))      // try-with-resources closes the file for you
    {
        writer.write(txaOutput.getText());                      // write everything shown in the text area
        JOptionPane.showMessageDialog(this, "Saved");           // confirm
    }
    catch (IOException ex)                                      // file problems
    {
        JOptionPane.showMessageDialog(this, "Could not save the file");   // error message
    }
}

// APPEND one line per record
try (FileWriter writer = new FileWriter("data.txt", true))      // true = add to the end of the file
{
    writer.write(lastResult + "\n");                            // one line per record
}
catch (IOException ex)                                          // file problems
{
    JOptionPane.showMessageDialog(this, "Could not save");      // message
}

// READ a file line by line into a list box (2022)
private void loadFile()
{
    DefaultListModel<String> model = new DefaultListModel<>();  // the list box contents

    try (BufferedReader reader = new BufferedReader(new FileReader("travel.txt")))   // open the file
    {
        String line = reader.readLine();                        // first line, or null if empty
        while (line != null)                                    // until nothing is left
        {
            String[] parts = line.split(",");                   // cut at each comma (parts are Strings)
            model.addElement(parts[0] + " to " + parts[1]);     // add to the list
            line = reader.readLine();                           // next line
        }
    }
    catch (IOException ex)                                      // missing or unreadable file
    {
        JOptionPane.showMessageDialog(this, "Could not read the file");   // message
    }

    lstTravel.setModel(model);                                  // show it in the list box
}

// CAPTURE up to five records (2022)
private String[] names = new String[5];                         // field: room for 5 records
private int count = 0;                                          // field: how many are stored

private void saveRecord()
{
    if (count >= 5)                                             // the array is full
    {
        JOptionPane.showMessageDialog(this, "Only five records allowed");   // error message
        return;                                                 // stop
    }

    names[count] = txtName.getText();                           // store at the next free position
    count = count + 1;                                          // one more stored
}

// SAME start and end (2022)
if (cmbStart.getSelectedItem().toString().equals(cmbEnd.getSelectedItem().toString()))   // equals, not ==
{
    JOptionPane.showMessageDialog(this, "Start and end cannot be the same");   // error message
    return;                                                     // stop
}
```

---

## 12. Q2: A class that holds its own data (2025 style)

When the interface has methods with **no parameters** (`GetTotalSales()`), the data lives **inside the class**.

```java
public class ProductSales implements IProductSales
{
    private int[][] productSales = { {300, 150, 700},           // the data lives INSIDE the class
                                     {250, 200, 600} };
    private static final int SALES_LIMIT = 500;                 // constant from the question

    @Override
    public int[][] GetProductSales()
    {
        return productSales;                                    // hand the table to the form
    }

    @Override
    public int GetTotalSales()
    {
        int sum = 0;                                            // before both loops
        for (int row = 0; row < productSales.length; row++)     // each row
        {
            for (int col = 0; col < productSales[row].length; col++)   // each column
            {
                sum = sum + productSales[row][col];             // add the value
            }
        }
        return sum;                                             // after both loops
    }

    @Override
    public int GetSalesOverLimit()
    {
        int count = 0;                                          // before both loops
        for (int row = 0; row < productSales.length; row++)     // each row
        {
            for (int col = 0; col < productSales[row].length; col++)   // each column
            {
                if (productSales[row][col] > SALES_LIMIT)       // over the limit (use < for under)
                {
                    count = count + 1;                          // add 1
                }
            }
        }
        return count;                                           // after both loops
    }

    @Override
    public int GetProductsProcessed()
    {
        return productSales.length;                             // rows = years (check the sample in the paper)
    }

    @Override
    public double GetAverageSales()
    {
        int values = productSales.length * productSales[0].length;   // rows x columns
        return (double) GetTotalSales() / values;               // reuse the total method
    }
}
```

`GetSalesUnderLimit()` is `GetSalesOverLimit()` with `<`.

In the form (Load and Save buttons, plus matching menu items):

```java
private ProductSales sales = new ProductSales();                // field: one object for the whole form

private void loadData()                                         // called by the button AND the menu item
{
    int[][] table = sales.GetProductSales();                    // the data from the class

    txaOutput.setText("PRODUCT SALES REPORT\n");                // heading
    txaOutput.append("--------------------\n");                 // dashed line

    for (int row = 0; row < table.length; row++)                // each year
    {
        txaOutput.append("Year " + (row + 1) + ": ");           // row + 1 turns position 0 into Year 1
        for (int col = 0; col < table[row].length; col++)       // each product
        {
            txaOutput.append(table[row][col] + " ");            // the value and a space
        }
        txaOutput.append("\n");                                 // end the line AFTER the inner loop
    }

    txaOutput.append("--------------------\n");                 // dashed line before the summary
    txaOutput.append("Total sales: " + sales.GetTotalSales() + "\n");               // total
    txaOutput.append(String.format("Average sales: %.2f%n", sales.GetAverageSales()));   // 2 decimals
    txaOutput.append("Sales over the limit: " + sales.GetSalesOverLimit() + "\n");  // over
    txaOutput.append("Sales under the limit: " + sales.GetSalesUnderLimit() + "\n");// under

    lblYears.setText(String.valueOf(sales.GetProductsProcessed()));   // number to text for the label
}

private void clearForm()                                        // Clear: text area and label
{
    txaOutput.setText("");                                      // empty the text area
    lblYears.setText("");                                       // empty the label
}
```

---

## 13. Unit tests

```java
// Imports (top of the test file)
import org.junit.jupiter.api.Test;                              // the @Test annotation
import static org.junit.jupiter.api.Assertions.*;               // assertEquals, assertTrue, assertFalse

@Test
public void MethodName_Scenario_Result()                        // use the EXACT name from the paper
{
    // Arrange: build everything the test needs
    ClassName obj = new ClassName();                            // the test makes its own object
    int[] input = {1, 2, 3};                                    // the input, matching the parameter type
    double expected = 2.0;                                      // worked out BY HAND on paper

    // Act: call the method once and keep the result
    double actual = obj.Average(input);                         // the result type matches the method

    // Assert: compare
    assertEquals(expected, actual, 0.01);                       // double: add the tolerance
}

assertEquals(5, intResult);                                     // int: no tolerance
assertEquals("Ana", stringResult);                              // String: no tolerance, expected first
assertTrue(booleanResult);                                      // expect true
assertFalse(booleanResult);                                     // expect false
assertEquals(10, resultArray[0]);                               // array result: one box at a time
assertEquals(20, resultArray[1]);                               // the next box
```

**Validation tests** (one is enough, but a valid and an invalid case is best):

```java
@Test
public void ValidateData_ZeroQuantity_ReturnsFalse()            // invalid case
{
    // Arrange
    ItemService service = new ItemService();                    // object
    ItemData data = new ItemData();                             // data object
    data.setItem("Pen");                                        // valid item
    data.setQuantity(0);                                        // INVALID quantity
    data.setPrice(5.0);                                         // valid price

    // Act
    boolean actual = service.ValidateData(data);                // should be false

    // Assert
    assertFalse(actual);                                        // must NOT be valid
}
```

**Calculated unsuccessfully (2023):** a test that proves a wrong value is not returned.

```java
@Test
public void CalculateCommission_CalculatedUnSuccessfully()
{
    // Arrange
    EstateAgent agent = new EstateAgent();                      // object
    double wrong = 999.0;                                       // a value the method must NOT return

    // Act
    double actual = agent.CalculateCommission("1000000", "5");  // the real commission is 50000

    // Assert
    assertNotEquals(wrong, actual, 0.01);                       // passes because they differ
}
```

Check your notes to see if `assertNotEquals` was taught. If not, use `assertEquals` with the true value.

**For a class with no parameters (2025):**

```java
@Test
public void GetSalesOverLimit_ReturnsNumberOfSales()
{
    // Arrange
    ProductSales sales = new ProductSales();                    // the data is inside the class
    int expected = 3;                                           // by hand: count the values above 500

    // Act
    int actual = sales.GetSalesOverLimit();                     // no parameters

    // Assert
    assertEquals(expected, actual);                             // int: no tolerance
}
```

Rules:
- The expected value comes from **you**, worked out by hand. If it came from the method itself, the test would prove nothing.
- A test only uses variables it creates itself.
- A test input must match the method's parameter type: `StudentAverage(int[])` needs one row, not the whole table.
- Tests go in the **Test Packages** folder. Delete empty tests that NetBeans generates.

---

## 14. NetBeans tips

- Every file starts with the **same `package` line**. When you paste a whole file, check it is still there.
- If `@Override` is red, check the package line, then every signature against the interface.
- If the auto-generated main class has the same name as your class (for example `CarRental`), rename one. A clash causes "cannot find symbol" errors.
- Create the test class from *Tools > Create/Update Tests*, or manually in the Test Packages folder.
- Run the tests from the Test Packages folder (right-click the test file and choose *Test File*) and check they all pass.

---

## 15. Slip checklist

- Counting adds **1**. Totalling adds the **value**.
- The newcomer goes on the **left**: `arr[i] > arr[best]`.
- Result arrays use `new type[n]`, never `{}`.
- Pass **one row** (`table[row]`) to a method that takes a 1D array.
- The inner loop uses `table[row].length`, not `col`.
- Call methods on the **object**, not the class name.
- `equals()` for Strings, never `==`.
- "Over" is `>`, "below" is `<`, "at least" is `>=`.
- When a loop uses `row`, every array indexed inside it uses `row`, never a fixed `0`.
- `println()` goes **after** the inner loop.
- Weeks and years start at 1 but positions start at 0: use `best + 1` or `row + 1`.
- Don't leave template question comments, empty tests or empty event handlers in the submission.
- Run the program and compare the output with the sample screenshot before you hand in.
