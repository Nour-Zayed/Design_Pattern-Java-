/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratepattern;

/**
 *
 * @author NooR
 */
public class Foul extends SandwichDecorator {
    
    public Foul(Sandwich sandwich) {
        super(sandwich);
    }
      @Override
    public double getcost() {
        return super.getcost() + 10;
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String getdescription() {
        return super.getdescription() + "Added Foul";
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}
