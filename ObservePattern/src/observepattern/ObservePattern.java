/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observepattern;

/**
 *
 * @author NooR
 */
public class ObservePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Student Mohamed = new Student("Mohamed");
        Student Mahmoud = new Student("Mahmoud");
        Student Rami = new Student ("Rami");
        Student Sami = new Student ("Sami");
        
        Course java = new Course("Java Course");
        
        java.register(Mohamed);
        java.register(Mahmoud);
        java.register(Rami);
        java.register(Sami);

        java.unregister(Sami);
        
        java.setAvailability(false);
        
   
        
    
    }
    
}
