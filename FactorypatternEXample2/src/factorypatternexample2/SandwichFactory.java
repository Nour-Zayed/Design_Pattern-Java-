/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypatternexample2;

/**
 *
 * @author NooR
 */
public class SandwichFactory {
    // Define constants for sandwich IDs
    public static final int CHEESE_BURGER = 1;
    public static final int CHICKEN_BURGER = 2;

    // Factory method to create sandwiches
    public static Sandwich createSandwich(int id) {
        switch (id) {
            case CHEESE_BURGER:
                return new Cheeseburgur();
            case CHICKEN_BURGER:
                return new chickenBurgur();
            default:
                return null;
        }
    }

}
