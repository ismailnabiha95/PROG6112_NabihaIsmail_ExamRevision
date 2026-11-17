
package com.mycompany.carwashcalc_gui_q2;


public interface ICarWash {
    double GetPrice(String vehicleType);
    double CalculateSubtotal(double price, int quantity);
    double CalculateDiscount(double subtotal, int quantity, boolean 
isMember);
    double CalculateVat(double amountAfterDiscount);
    double CalculateTotal(double subtotal, double discount);
}
