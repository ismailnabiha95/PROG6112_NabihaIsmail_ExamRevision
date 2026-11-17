package com.mycompany.q1_testmarks_practice;

public class Q1_TestMarks_Practice {

    public static void main(String[] args) {
        
        String[] names = {"Ayesha","Brandon","Chloe","Dumi"};// the 4 students
String[] tests = {"TEST 1", "TEST 2", "TEST 3"};// TEST 1, TEST 2, TEST 3
int[][] marks = { {72 ,65, 80},{ 55, 60 ,58},{ 88, 92 ,85},{ 40, 52 ,61}};// the table of marks
double[] averages = new double[marks.length ];
TestMarks testmarks = new TestMarks();

for (int row = 0; row < names.length; row++)
{
    averages[row] = testmarks.StudentAverage(marks[row]);
}
        
System.out.println("TEST MARKS REPORT");
System.out.print("NAME");
for (int col = 0; col < tests.length; col++)
{
    System.out.print("\t" + tests[col]);
}
System.out.println();

for (int row = 0; row < names.length; row++)
{
    System.out.print(names[row]);
    for (int col = 0; col < marks[row].length; col++)
    {
        System.out.print("\t" + marks[row][col]);
    }
    System.out.println();
}

for (int row = 0; row < names.length; row++)
{
    System.out.printf("Average for %s: %.2f%n", names[row], averages[row]);
}

String best = testmarks.BestStudent(names, averages);
System.out.println("Best student: " + best);
       
    }//main
    
    
}
