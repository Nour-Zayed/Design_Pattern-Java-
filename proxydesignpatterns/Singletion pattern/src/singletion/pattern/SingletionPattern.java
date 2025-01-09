/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singletion.pattern;

/**
 *
 * @author NooR
 */
public class SingletionPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Lettersingle Ls1 = Lettersingle.getinstance();
        Lettersingle Ls2 = Lettersingle.getinstance();

        System.out.println(Ls1.hashCode());
        Ls1.printdata();
        System.out.println(Ls2.hashCode());
        Ls2.printdata();
        
    }
    
}
