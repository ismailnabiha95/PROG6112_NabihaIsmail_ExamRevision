
package com.mycompany.studentresults_q4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class GradesTest {
    
    
    

   @Test
public void GetGrade_AverageOf75_ReturnsB()
{
    // Arrange: the object, the input average and the expected result
    Grades grades = new Grades();       // object to call the method on
    double average = 75.0;              // the input named in the test title
    String expected = "B";              // worked out by hand: 75 is 70 or more, so B

    // Act: call the method and keep its result
    String actual = grades.GetGrade(average);   // GetGrade takes one double and returns a String

    // Assert: compare expected with actual (Strings need no tolerance)
    assertEquals(expected, actual);
}

    @Test
public void CountPassed_ReturnsNumberPassed()
{
    // Arrange: the object, the averages and the expected count
    Grades grades = new Grades();                                   // object to call the method on
    double[] averages = {82.33, 64.33, 48.33, 71.33, 55.67};       // the five averages from the data
    int expected = 4;                                               // by hand: all except 48.33 are 50 or more

    // Act: call the method and keep its result
    int passed = grades.CountPassed(averages);

    // Assert: compare two ints, so no tolerance is needed
    assertEquals(expected, passed);
}
    
    
}
