/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statedesignpattern;

/**
 *
 * @author NooR
 */
public class MobileContext {
    private MobileAlertState MobileState;
    
    public MobileContext (){
        // default state Ringing
        MobileState = new Ringing();
    }
    
    // change state of object 
    public void setState (MobileAlertState state){
        MobileState = state;
    }
    
    public void alert (){
        MobileState.alert();
    }   
}
