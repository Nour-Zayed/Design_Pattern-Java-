/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatepattern;

/**
 *
 * @author NooR
 */
public class Car extends VehicleTemplate{
 
    
    
     @Override
    protected void integrateComponent() {
        System.out.println("integrete Mirrors, Windows, Join the parts in the Car Body");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void installGearBox() {
        System.out.println("Installing 5 shifts gear box");
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}
