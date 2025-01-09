/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proxydesignpatterns;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author NooR
 */
public class Proxydesignpatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           List<String> Sites = Arrays.asList("google","youtube","facebook","twitter");
          
          InternetSerivceProvider ISP = new InternetProxy();
          for(String site: Sites){
              System.out.println(ISP.serveSite(site));
          }       
    }
    
}
