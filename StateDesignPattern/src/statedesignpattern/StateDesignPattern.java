/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statedesignpattern;

/**
 *
 * @author NooR
 */
public class StateDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        MobileContext MC = new MobileContext();
        MC.alert();
        MC.setState(new Silent());
        MC.alert();
        
        MC.setState(new Vibration());
        MC.alert();
    }   
    }
    

