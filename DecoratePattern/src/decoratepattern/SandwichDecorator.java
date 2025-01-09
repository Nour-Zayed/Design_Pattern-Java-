/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratepattern;

/**
 *
 * @author NooR
 */
public abstract  class SandwichDecorator implements Sandwich {
    
    
    private Sandwich sandwich;
    
    public SandwichDecorator (Sandwich sandwich){
        this.sandwich = sandwich;
    }
    @Override
    public double getcost() {
        return sandwich.getcost();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getdescription() {
            return sandwich.getdescription();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
