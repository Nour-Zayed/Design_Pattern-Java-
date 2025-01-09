/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Revision_OOP;

/**
 *
 * @author NooR
 */
public class CommissionEmployee extends Employee implements Displayable {
    

    private double commission_rate;
    private double grose_sales;

    
   public CommissionEmployee (){
       
   }
   
   public CommissionEmployee(String Name,String Address,int SSN,Gender gen,double commission_rate,double grose_sales){
       super(Name,Address,SSN,gen);
       this.commission_rate = commission_rate;
       this.grose_sales = grose_sales;
       
   }
   
   public void set_Commussion_rate (double commission_rate){
       this.commission_rate = commission_rate;
   }
   public double get_commission_rate(){
       return commission_rate;
   }
   
   public void set_grose_sales (double grose_sales){
       this.grose_sales = grose_sales;
   }

   
      public double get_grose_sales(){
       return grose_sales;
   }

    @Override
    public double Earning() {
        
        return grose_sales  * commission_rate;
     //   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public String toString() {
        return "CommissionEmployee{" + "commission_rate=" + commission_rate + ", grose_sales=" + grose_sales + '}';
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



