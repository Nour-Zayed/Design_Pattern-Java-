/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern;

/**
 *
 * @author NooR
 */
public class RemoteControl {
    
    // Array of slots and each slot has on and off
    private Command[] Command;
    //private Command[] offCommand;

    public RemoteControl() {
        Command = new Command[4];

    }

    public void addcommand(int slotid, Command Command) {
        this.Command[slotid] = Command;

    }
    public void ButtonPressed(int slot) {
        Command[slot].execute();
    }    
    
    
}
