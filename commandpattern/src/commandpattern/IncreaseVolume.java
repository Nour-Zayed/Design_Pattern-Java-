/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern;

/**
 *
 * @author NooR
 */
public class IncreaseVolume implements Command {
    
    
    private Television TV;
    
    public IncreaseVolume (Television TV){
        this.TV = TV;
    }

    @Override
    public void execute() {
        TV.increasevolume();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
