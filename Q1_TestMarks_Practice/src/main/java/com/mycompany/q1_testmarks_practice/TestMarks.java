package com.mycompany.q1_testmarks_practice;


public class TestMarks implements IMarks
{

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
public String BestStudent(String[] names, double[] averages)
{
    int best = 0;

    for (int i = 1; i < averages.length; i++)
    {
        if (averages[i] > averages[best])
        {
            best = i;
        }
    }

    return names[best];
}
    
}
