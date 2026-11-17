package com.mycompany._q1;


public class App {

    public static void main(String[] args) {
        
        
        String[] agents = {"Joe Bloggs", "Jane Doe"};                  // single array: agent names
    double[][] sales = { {800000, 1500000, 2000000}, {700000, 1200000, 1600000} };   // row = agent, column = month
    EstateAgent agent = new EstateAgent();                         // object of your class
    double[] totals = new double[sales.length];                     // one total per agent
    String [] months = {"JAN","FEB","MAR"};
    
System.out.println("Estate Agents Sales Report");    // 1. title
System.out.println("--------------------");    //    dashes

System.out.print("      ");                    // 2. heading: space for the label column
    for (int col = 0; col < months.length; col++)    // one pass per heading
    {
        System.out.print(months[col] + "            ");     // print: stay on the line
    }
    System.out.println();        // end the heading line
    
    for (int row = 0; row < agents.length; row++)   // 3. rows: outer loop = lines
    {
        System.out.print(agents[row] + ": ");    // the label for the CURRENT row
        for (int col = 0; col < sales[row].length; col++)  // inner loop = values across
        {
            System.out.print(sales[row][col] + " ");   // stay on the line
        }
        System.out.println();                      // end THIS row, after the inner loop
        totals[row] = agent.EstateAgentSales(sales[row]);
    }
    
            System.out.println();                                   // blank line

    // total per agent: a loop over the agents array, values come from the totals box
    for (int i = 0; i < agents.length; i++)
    {
        System.out.println("Total property sales for " + agents[i] + " = R " + totals[i]);
    }
    System.out.println();

    // commission per agent: pass each agent's TOTAL in
    for (int i = 0; i < agents.length; i++)
    {
        System.out.println("Sales Commission for " + agents[i] + " = R " + agent.EstateAgentCommission(totals[i]));
    }
    System.out.println();

    // top agent: the method returns a POSITION, the agents array turns it into a NAME
    int top = agent.TopEstateAgent(totals);                 // position of the highest total
    System.out.println("Top performing estate agent: " + agents[top]);
        
        
        
        
        
    }//main
}//class
