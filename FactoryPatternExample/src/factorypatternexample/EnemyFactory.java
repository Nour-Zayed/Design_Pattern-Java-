/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypatternexample;

/**
 *
 * @author NooR
 */
public class EnemyFactory {
    public static final int Turtle = 1;
    public static final int Bird = 2;
    
    
    public static Enemy createEnemy(int id) {
        switch(id){
            case Turtle:
                return new Turtle();
            case Bird:
                return new Bird();
            default:
                return null;
        }
        
    }
    
   


    
}

