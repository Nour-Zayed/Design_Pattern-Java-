/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletion.pattern;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author NooR
 */
public class Lettersingle {
    
    private String [] letters= { "a" , "b" , "c" , "d" ,"e"  };
    private List <String> data =Arrays.asList(letters);
     
    // 2- create 4 reference from the same class (private static)
    private static Lettersingle oneinstance;
    
    //3- create a method called getinstance 
    
    public static Lettersingle getinstance(){
        if(oneinstance ==null ){
            oneinstance = new Lettersingle();
        }
        return oneinstance;
    }
    
    //1- convert constractor from public to private 
    private Lettersingle(){
        Collections.shuffle(data);
    }
   
    public void printdata(){
        for(String item:data){
            System.out.println(item+ " ");
        }
        System.out.println("");
    }

 
}
