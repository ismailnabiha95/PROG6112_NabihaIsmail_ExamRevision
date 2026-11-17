/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany._q2;

/**
 *
 * @author ismai
 */
public interface IEstateAgent {
    
     double CalculateCommission(String propertyPrice, String agentCommission); 
    boolean ValidateData(Data dataToValidate);
    
}
