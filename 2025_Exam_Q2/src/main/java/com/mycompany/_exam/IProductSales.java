
package com.mycompany._exam;

//defines method that product sales must implement
public interface IProductSales 
{
    int[][] GetProductSales(); 
    int GetTotalSales(); 
    int GetSalesOverLimit(); 
    int GetSalesUnderLimit(); 
    int GetProductsProcessed(); 
    double GetAverageSales(); 
}
