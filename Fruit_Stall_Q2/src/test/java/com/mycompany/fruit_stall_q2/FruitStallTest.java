
package com.mycompany.fruit_stall_q2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FruitStallTest {
    
    

   @Test
public void WeeklyTotals_ReturnsTotalPerWeek()
{
    // Arrange
    FruitStall stall = new FruitStall();
    int[][] sales = {{30, 25, 40, 35},
                     {20, 30, 22, 15},
                     {15, 20, 10, 35}};

    // Act
    int[] actual = stall.WeeklyTotals(sales);

    // Assert
    assertEquals(65, actual[0]);
    assertEquals(75, actual[1]);
    assertEquals(72, actual[2]);
    assertEquals(85, actual[3]);
}

  @Test
public void BestWeek_ReturnsBestWeekNumber()
{
    // Arrange
    FruitStall stall = new FruitStall();
    int[] totals = {65, 75, 72, 85};

    // Act
    int actual = stall.BestWeek(totals);

    // Assert
    assertEquals(4, actual);
}

    
    
}
