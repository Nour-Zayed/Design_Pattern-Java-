/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatepattern;

/**
 *
 * @author NooR
 */
public abstract class VehicleTemplate {
    
      public final void buildVechicle (){
        collectComponent();
        integrateComponent();
        installGearBox();
        startVehicle();
        System.out.println("Vehicle is on");
    }

    protected abstract void integrateComponent (); // depends on the type of car 
    protected abstract void installGearBox(); // also depends on the type of the Car to be free in changes
    
    private void collectComponent() {
        System.out.println("Bring rear, front lights, tires ");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void startVehicle() {
        System.out.println("Engine is powering Up");
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
    
}
