/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eagersingletion;

import singletion.pattern.Lettersingle;

/**
 *
 * @author NooR
 */
public class EagerSingletion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lettersingle L1 =  Lettersingle.oneinstance;
        Lettersingle L2 =  Lettersingle.oneinstance;

        System.out.println(L1.hashCode());
        L1.printdata();
        System.out.println(L2.hashCode());
        L2.printdata();
        
        // TODO code application logic here
    }
    
}
