/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Revision_OOP;

/**
 *
 * @author NooR
 */
public class SalariedEmployee extends Employee implements Displayable {
    private double salary ;
    private double bouns;
    private double deduction;
    
    
    public SalariedEmployee(){
        
        
    }

    public SalariedEmployee(int SSN, int par1, int par2, String Name, int par3, String Address, int par4, Gender gen) {
        super(Name, Address, SSN, gen);
        this.salary = salary;
        this.bouns  =bouns;
        this.deduction =deduction;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    @Override
    public double Earning() {
        
        return  (salary + bouns )- deduction;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "salary=" + salary + ", bouns=" + bouns + ", deduction=" + deduction + '}';
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
