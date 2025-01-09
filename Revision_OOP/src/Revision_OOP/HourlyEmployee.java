/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Revision_OOP;

/**
 *
 * @author NooR
 */
public class HourlyEmployee extends Employee implements Displayable {
    private int number_of_hours;
    private double hour_rate;
    
    
    public HourlyEmployee(String Name ,String Address,int SSN,Gender gen ,double hour_rate,int number_of_hours){
        super(Name,Address, SSN,gen);
        this.number_of_hours = number_of_hours;
        this.hour_rate = hour_rate;
                
    }
    
    public void set_number_of(int number_of_hours){
        this.number_of_hours = number_of_hours;
    }
    
    public int get_number_of_hours(){
        return this.number_of_hours;
    }
    
    public void set_hour_rate(double hour_rate){
        this.hour_rate = hour_rate;
    }
    
    public double get_rate (){
        return hour_rate;
    }

    @Override
    public double Earning() {
        return hour_rate * number_of_hours;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + "number_of_hours=" + number_of_hours + ", hour_rate=" + hour_rate + '}';
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
