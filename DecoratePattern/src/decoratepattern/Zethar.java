/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratepattern;

/**
 *
 * @author NooR
 */
public class Zethar extends SandwichDecorator{
    
        public Zethar(Sandwich sandwich) {
        super(sandwich);
    }
         @Override
    public double getcost() {
        return super.getcost() + 3;
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String getdescription() {
        return super.getdescription() + "Added Zethar";
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
