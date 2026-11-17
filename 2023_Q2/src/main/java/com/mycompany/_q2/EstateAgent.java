/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._q2;

/**
 *
 * @author ismai
 */
public class EstateAgent implements IEstateAgent {

    @Override
    public double CalculateCommission(String propertyPrice, String agentCommission) {
        double price = Double.parseDouble(propertyPrice);          // text to number
double percent = Double.parseDouble(agentCommission);
return price * percent / 100;                              // 10 means 10%
       
    }

    @Override
    public boolean ValidateData(Data dataToValidate) {
       if (dataToValidate.getLocation() == null || dataToValidate.getLocation().equals(""))
        {
            return false;                                    // rule 1: location cannot be empty
        }
        if (dataToValidate.getName().isEmpty())             // rule 2: name cannot be empty (which String method?)
        {
            return false;
        }
        if (dataToValidate.getPrice()<= 0)               // rule 3: price must be above zero (which operator fails it?)
        {
            return false;
        }
        if (dataToValidate.getCommission()<=0)           // rule 4: commission percentage must be above zero
        {
            return false;
        }
        return true;                                         // every rule passed
    }
    }

   
