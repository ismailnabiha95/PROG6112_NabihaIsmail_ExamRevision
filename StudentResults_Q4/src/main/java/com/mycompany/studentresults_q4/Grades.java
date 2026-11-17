
package com.mycompany.studentresults_q4;


public class Grades implements IGrades{

    @Override
    public double StudentAverage(int[] marks) {
         int sum = 0;                                  // 1. what should the total start at?

    for (int i = 0; i < marks.length; i++)             // 2. which property gives the number of items?
    {
        sum = sum + marks[i];                     // 3. which variable picks the current mark?
    }

    return (double) sum / marks.length;                // 4. divide by the number of items (same property as 2)

    }

    @Override
public String GetGrade(double average)
{
    if (average >= 80)                          // the highest boundary first
    {
        return "A";                              // return stops the method here
    }
    else if (average >= 70)                     // only reached if the first check failed
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
    else                                         // everything lower than the last boundary
    {
        return "F";
    }
}
    @Override
public int CountPassed(double[] averages)
{
    int count = 0;                             // start at 0, before the loop

    for (int i = 0; i < averages.length; i++)       // the property for the number of items
    {
        if (averages[i] >= 50)                  // "50 or more" 
        {
            count = count + 1;                 // add how much per pass?
        }
    }

    return count;                                // after the loop
}
}
