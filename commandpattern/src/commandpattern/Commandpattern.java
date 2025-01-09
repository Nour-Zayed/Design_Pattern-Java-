/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package commandpattern;

/**
 *
 * @author NooR
 */
public class Commandpattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RemoteControl RC = new RemoteControl();

        Television TV = new Television();

        TurnOnTelevision TVon = new TurnOnTelevision(TV);
        TurnOffTelevision TVoff = new TurnOffTelevision(TV);

        IncreaseVolume IV = new IncreaseVolume(TV);
        DecreaseVolume DV = new DecreaseVolume(TV);

        RC.addcommand(0, IV);
        RC.addcommand(1, DV);
        RC.addcommand(2, TVon);
        RC.addcommand(3, TVoff);
        
        RC.ButtonPressed(2);
        RC.ButtonPressed(0);
        RC.ButtonPressed(0);
        RC.ButtonPressed(1);
        RC.ButtonPressed(1);
        RC.ButtonPressed(3);
    }    
    }
    

