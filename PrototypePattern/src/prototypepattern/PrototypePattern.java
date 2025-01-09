/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prototypepattern;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author NooR
 */
public class PrototypePattern {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        
        List<Vehicle> V = new ArrayList<>();
        Bus B = new Bus();
        B.setModel("Toyota");
        
        Car C = new Car();
        C.setModel("Verna");        
        V.add(C);
        V.add(B);
        
        // we need to copy these vehicles in an array of vehicle dont care which object is it
        
        List<Vehicle> CopyV = new ArrayList<>();
        
        for(Vehicle V1 : V){
            CopyV.add(V1.clone());
        }
        
        for(Vehicle V2 : CopyV){
            System.out.println(V2.getModel());
        }
        
        
        
        
        
        
    }
    
}