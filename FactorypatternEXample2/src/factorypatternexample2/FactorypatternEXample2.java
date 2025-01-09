/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorypatternexample2;

/**
 *
 * @author NooR
 */
public class FactorypatternEXample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Sandwich S1 = SandwichFactory.createSandwich(1);
        System.out.println(S1.toString());
       Sandwich S2 = SandwichFactory.createSandwich(2);
        System.out.println(S2.toString());
        // TODO code application logic here
    }
    
}
