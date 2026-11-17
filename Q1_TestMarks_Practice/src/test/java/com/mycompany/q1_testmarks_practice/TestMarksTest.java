/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.q1_testmarks_practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ismai
 */
public class TestMarksTest {
    
    

    @Test
public void StudentAverage_ReturnsAverage()
{
    // Arrange
    TestMarks testmarks = new TestMarks();
    int[] marks = {72, 65, 80};
    double expected = 72.33;

    // Act
    double actual = testmarks.StudentAverage(marks);

    // Assert
    assertEquals(expected, actual, 0.01);
}

    @Test
public void BestStudent_ReturnsBestStudent()
{
    // Arrange
    TestMarks testmarks = new TestMarks();
    String[] names = {"Ayesha", "Brandon", "Chloe", "Dumi"};
    double[] averages = {72.33, 57.67, 88.33,51.0};
    String expected = "Chloe";

    // Act
    String actual = testmarks.BestStudent(names, averages);

    // Assert
    assertEquals(expected, actual);
}
    
}
