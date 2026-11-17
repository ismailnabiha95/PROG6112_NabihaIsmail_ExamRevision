package com.mycompany.studentresults_q4;


public class StudentResults_Q4 {

    public static void main(String[] args) {
       
       // the data: names and three marks per student (one row each)
String[] names = {"Aisha", "Ben", "Carlos", "Dineo", "Emma"};
int[][] marks = { {82, 75, 90},               // Aisha
                  {65, 58, 70},               // Ben
                  {45, 52, 48},               // Carlos
                  {71, 68, 75},               // Dineo
                  {55, 62, 50} };             // Emma

Grades grades = new Grades();                 // object used to call the methods
double[] averages = new double[names.length]; // one box per student for the averages

// heading
System.out.println("STUDENT RESULTS");
System.out.println("---------------");

// calculate each student's average from their row of marks
for (int row = 0; row < marks.length; row++)
{
    averages[row] = grades.StudentAverage(marks[row]);   // marks[row] is one student's marks
}

// print each student's name, average and grade
for (int row = 0; row < names.length; row++)
{
    String grade = grades.GetGrade(averages[row]);       // a new grade for each student
    System.out.printf("%s: %.2f (%s)%n", names[row], averages[row], grade);
}

// summary: how many students passed
System.out.println("---------------");
System.out.println("Passed: " + grades.CountPassed(averages) + " out of " + names.length);
    }
}
