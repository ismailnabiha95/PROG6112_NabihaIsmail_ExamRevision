
package com.mycompany._q1;


public class EstateAgent implements IEstateAgent{

    @Override
    public double EstateAgentSales(double[] propertySales) {
        
         double total = 0;                                   // start at 0, BEFORE the loop
    for (int i = 0; i < propertySales.length; i++)        // visit every item
    {
         total =  total + propertySales[i];                     // add the VALUE
    }
    return  total;                                    // after the loop
        
    }

    @Override
    public double EstateAgentCommission(double propertySales) {
        
        return propertySales*0.02;    
    }

    @Override
    public int TopEstateAgent(double[] totalSales) {
        int top = 0;                                  // position of the best so far
    for (int i = 1; i < totalSales.length; i++)        // check the rest
    {
        if (totalSales[i] > totalSales[top])              // compare the NUMBERS array
        {
            top = i;                              // remember the position
        }
    }
    return top;                            // return the position of the top agent
    }
    
}
