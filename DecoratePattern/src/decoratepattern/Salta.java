/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratepattern;

/**
 *
 * @author NooR
 */
public class Salta extends SandwichDecorator{
    
        public Salta(Sandwich sandwich) {
        super(sandwich);
    }
    
      @Override
    public double getcost() {
        return super.getcost() + 5;
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String getdescription() {
        return super.getdescription() + "Added salad";
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
