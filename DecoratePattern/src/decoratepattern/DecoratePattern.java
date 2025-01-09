/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decoratepattern;

/**
 *
 * @author NooR
 */
public class DecoratePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Sandwich firstsandwich = new BasicSandwich();
         System.out.println(firstsandwich.getdescription());
         System.out.println(firstsandwich.getcost());
         

         Sandwich secondsandwich = new Foul(new BasicSandwich());
         System.out.println(secondsandwich.getdescription());
         System.out.println(secondsandwich.getcost());
         
         
         
         Sandwich thirdsandwich = new Salta(new Foul(new BasicSandwich()));
         System.out.println(thirdsandwich.getdescription());
         System.out.println(thirdsandwich.getcost());  
        
        
        Sandwich fourthsandwich = new Salta(new BasicSandwich());
        System.out.println(fourthsandwich.getdescription());
        System.out.println(fourthsandwich.getcost());
    }
    
}
