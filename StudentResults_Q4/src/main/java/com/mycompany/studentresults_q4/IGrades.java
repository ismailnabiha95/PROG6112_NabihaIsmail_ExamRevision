package com.mycompany.studentresults_q4;


public interface IGrades    
{
    double StudentAverage(int[] marks);          // one student's marks in, their average out
    String GetGrade(double average);             // an average in, a letter grade out
    int CountPassed(double[] averages);          // all the averages in, the number of passes out
}

