/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package templatepattern;

/**
 *
 * @author NooR
 */
public class TemplatePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        VehicleTemplate Car = new Car();
        Car.buildVechicle();
        
        VehicleTemplate Truck = new Truck();
        Truck.buildVechicle();
        // TODO code application logic here
    }
    }
    

