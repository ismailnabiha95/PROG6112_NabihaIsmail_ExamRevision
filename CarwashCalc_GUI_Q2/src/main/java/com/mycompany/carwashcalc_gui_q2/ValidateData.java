
package com.mycompany.carwashcalc_gui_q2;

public class ValidateData {
    
   // returns true only when BOTH rules pass
    public boolean IsValid(String name, int quantity)
    {
        // rule 1: the name must not be empty (trim removes spaces)
        boolean nameOk = !name.trim().isEmpty();     // which String method checks for empty?

        // rule 2: the quantity must be greater than zero
        boolean quantityOk = quantity > 0;     // which comparison?

        // both must be true
        return nameOk && quantityOk;            // && or ||?
    }
}
