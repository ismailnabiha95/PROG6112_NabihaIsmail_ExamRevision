
package com.mycompany.temperatures_act3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperaturesTest {
    
   

  @Test
public void HighestTemperature_ReturnsHighest()
{
    // Arrange
    Temperatures temp = new Temperatures();
    int[][] temps = { {24, 26, 28, 25, 23},
                      {18, 21, 16, 14, 19},
                      {12, 9, 15, 22, 8} };
    int expected = 28;

    // Act
    int highest = temp.HighestTemperature(temps);

    // Assert
    assertEquals(expected, highest);
}
   

    @Test
    public void ColdDays_ReturnsNumberOfColdDays() 
    {
        //arrange
         Temperatures temp = new Temperatures();
         int[][] temps = { {24, 26, 28, 25, 23},
                      {18, 21, 16, 14, 19},
                      {12, 9, 15, 22, 8} };
         
          int expected = 2;
          //act
          int colddays = temp.ColdDays(temps, 10);
          //assert
           assertEquals(expected, colddays);
          

         
         
    }
    
}
