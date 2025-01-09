/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Revision_OOP;

/**
 *
 * @author NooR
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double base;

    public BasePlusCommissionEmployee() {
    }

    public BasePlusCommissionEmployee(String Name, String Address, int SSN, Gender gen, double commission_rate, double grose_sales) {
        super(Name, Address, SSN, gen, commission_rate, grose_sales);
        this.base= base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    @Override
    public double Earning() {
        
        return (super.get_grose_sales()  * super.get_commission_rate()  ) + base ;
     //   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" + "base=" + base + '}';
    }
   
    
    @Override
    public void displayAlldetails() {
        
        System.out.println(super.toString());
        System.out.println(toString());
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void displayearnings() {
        
        System.out.println(Earning());
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
         
}
