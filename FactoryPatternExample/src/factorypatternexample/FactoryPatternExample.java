/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorypatternexample;

import java.util.Random;

/**
 *
 * @author NooR
 */
public class FactoryPatternExample {
    static Random R = new Random() ;

    public static void main(String[] args) {
        
        int loop = 5;
        while (loop> 0){
             Enemy E=  EnemyFactory.createEnemy(getrandom(1,2));
             E.showup();
            loop --;
            
            
            
        }
        
    }
    public static int getrandom (int min , int max){
        // generate 0,1
        int  t = R.nextInt(max) + min ;
        return t;
    }
}
