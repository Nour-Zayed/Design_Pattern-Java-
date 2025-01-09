/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern;

/**
 *
 * @author NooR
 */
public class TurnOnTelevision implements Command{
    
    
    private Television TV;
    public TurnOnTelevision (Television tv){
        this.TV = tv;
    }

    
    @Override
    public void execute() {
         this.TV.turnOn();
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
