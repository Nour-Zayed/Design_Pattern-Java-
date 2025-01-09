/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern;

/**
 *
 * @author NooR
 */

// receiver class
public class Television {
    
    private int volume  = 10;   // default volume
    
    public void turnOn(){
        System.out.println("TV is on ");
    }
    public void turnOff(){
        System.out.println("TV is off");
    }
    
    public void increasevolume (){
        if(volume < 100){
            volume++;
             System.out.println("Volume increased to: " + volume);
        }else{
            System.out.println("Maximum volume reached");
        }
    }
    public void decreasevolume (){
        if(volume > 0){
            volume--;
             System.out.println("Volume decreased to: " + volume);
        }else{
            System.out.println("Minimum volume reached");
        }
    }    

    
}
