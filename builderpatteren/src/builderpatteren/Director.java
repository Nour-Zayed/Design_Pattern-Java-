/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderpatteren;

/**
 *
 * @author NooR
 */
public class Director {
    
    public void  buildchevolet(Carbuilder carbuilder){
        carbuilder.Brand("chevolet");
        carbuilder.Nbrodoors(4);
        carbuilder.Screentype("Big");
        carbuilder.Weight(50);
        carbuilder.Height(100);
                
                
    }
    
}
