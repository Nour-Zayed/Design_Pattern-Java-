/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapterpattern;

/**
 *
 * @author NooR
 */
public class AdapterPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle car = new Car ();
        useVehicle(car);
        Vehicle bike = new BicycleAdapter(new Bicycle());
        useVehicle(bike);    
    }

    public static void useVehicle (Vehicle car){
        car.accelerate();
        car.pushbreak();
        car.soundhorn();
        System.out.println("");
    }        
    }
    

